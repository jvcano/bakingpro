import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;


public class UserEmailGUI extends JFrame
{
    JTextArea costumerTextArea   = new JTextArea();
    JLabel idLabel     = new JLabel("ID: ");
    JTextField idTextField = new JTextField(5);
    JLabel nameLabel = new JLabel ("Name: ");
    JTextField nameTextField = new JTextField(5);
    JLabel SumLable = new JLabel("amount");
    JTextField SumTextField = new JTextField(5);


    JButton addButton = new JButton("add");
    JButton TransacctionButton= new JButton("Transactions");
    JButton WihtdrawButton = new JButton("Withdraws");
    JButton BalanceButton = new JButton("Balance");

    //class Instance Data:
    private LinkedList<UserEmail> CostumerLinkedList = new LinkedList<>();

    public UserEmailGUI()
    {

         // Constants:
        //

        JPanel flow1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow2Panel= new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel gridPanel = new JPanel(new GridLayout(2,1));

        costumerTextArea.setEditable(false);

        flow1Panel.add(idLabel);
        flow1Panel.add(idTextField);
        flow1Panel.add(nameLabel);
        flow1Panel.add(nameTextField);
        flow1Panel.add(SumLable);
        flow1Panel.add(SumTextField);

        flow2Panel.add(addButton);
        flow2Panel.add(TransacctionButton);
        flow2Panel.add(WihtdrawButton);
        flow2Panel.add(BalanceButton);

        gridPanel.add(flow1Panel);
        gridPanel.add(flow2Panel);

        add(costumerTextArea, BorderLayout.CENTER);
        add(gridPanel, BorderLayout.SOUTH);

        addButton.addActionListener(event ->addCostumer ());

    }
    private void addCostumer () {
        boolean isUserUnique = true;

        for (UserEmail stud : CostumerLinkedList) {
            if (stud.getId().compareTo(idTextField.getText()) == 0) {
                isUserUnique = false;
            }
        }

        if (isUserUnique == false) {
            JOptionPane.showMessageDialog(null, "error: user is on the data base");
        } else {
            CostumerLinkedList.add(new UserEmail(nameTextField.getText(), idTextField.getText(),SumTextField.getText()));
            costumerTextArea.setText("          ");
            for (UserEmail stud : CostumerLinkedList) {
                costumerTextArea.append(stud + "\n");
            }
        }
    }


public static void main (String [] args)
    {

        UserEmailGUI app = new UserEmailGUI();
        app.setVisible(true);
        app.setSize(400,300);
        app.setLocation(200,200);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




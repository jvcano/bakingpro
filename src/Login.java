import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPasswordField passwordField1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton loginButton;


    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
    }
}

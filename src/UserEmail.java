//

public class UserEmail {
    public static final  String EMAIL_STUB = "@bank.email";
    private String name;
    private  String id;
    private String amount;

    public UserEmail()
    {
        name ="";
        id = "";
        amount= "";

    }
    public UserEmail(String name, String id, String amount)
    {
        this.name = name;
        this.id= id;
        this.amount=amount;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "   ID: "+id + " " +"User: "+ name + "      " +  amount+"$";
    }
}

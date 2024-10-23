package bank;

class Account {
    public String name;
    protected String email;
    private String password;
    //getter and setter

public String getPassword(){
    return this.password;
}
public void setPassword(String pass){
    this.password=pass;
}
}
public class Bank {
    public static void main (String args[]){
        Account account1 = new Account();
        account1.name= "Ganesh";
        account1.email="ganesh@gmail.com";
        account1.setPassword("hha");
        System.out.println(account1.getPassword());




    }
    
}

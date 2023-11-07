package inheritance;
//parent class
public class BankAccount {
    int balance;
    public static void main(String[] args) {
       BankAccount t=new BankAccount();
       t.deposit(1000);
       t.withdraw(500);
    }

public void deposit(int amount){
    balance+=amount;
}
public void withdraw(int amount){

        if (balance<amount){
    System.out.println("Account holder cannot withdraw money");}
    else{
            System.out.println("Account holder can withdraw money");

}}}

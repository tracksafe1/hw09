package inheritance;

public class SavingsAccount extends BankAccount {

    public static void main(String[] args) {
        SavingsAccount t=new SavingsAccount();
        t.deposit(5000);
        t.withdraw(600);

    }


    @Override
    public void withdraw(int amount) {
    if (  balance<100){
        System.out.println("withdrawl is not allowed");}
        else{
                System.out.println("withdrawl is allowed");
            }

        }}


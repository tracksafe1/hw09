package polymorphism;

public class SavingsAccount extends BankAccount{
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount();
        s.deposit();
        s.withdraw();
    }

    @Override
    public void withdraw() {
        System.out.println("you can withdraw maximum of £250 in a day");

    }
}

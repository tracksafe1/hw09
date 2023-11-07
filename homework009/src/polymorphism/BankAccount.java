package polymorphism;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.withdraw();
        b.deposit();
    }

public void withdraw(){
    System.out.println("you can withdraw money");
}
public void deposit(){
    System.out.println("you can deposit money");
}
}

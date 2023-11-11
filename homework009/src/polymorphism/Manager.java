package polymorphism;

public class Manager extends Employee {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.calculatesalary(50000);


    }

    @Override
    public void calculatesalary(int basicsalary) {
        double bonus = .3 * basicsalary;
        double annualincrement = .05 * basicsalary;
        double salary = bonus + annualincrement + basicsalary;
        System.out.println("salary of Manager :"+salary);
    }


}















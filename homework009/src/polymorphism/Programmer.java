package polymorphism;

public class Programmer extends Employee         {
    public static void main(String[] args) {
       Programmer e=new Programmer();
      e.calculatesalary(40000);
  }

    @Override
    public void calculatesalary(int basicsalary) {

        double bonus=.01*basicsalary;
        double annualincrement=.05*basicsalary;
        double salary=bonus+annualincrement+basicsalary;
        System.out.println("salary of programmer "+salary);

    }
}

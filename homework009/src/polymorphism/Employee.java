package polymorphism;

public class Employee {
    public static void main(String[] args) {
        Employee e=new Employee();

        e.calculatesalary(45000);
    }
    public void calculatesalary(int basicsalary){

        double bonus=.01*basicsalary;
        double annualincrement=.05*basicsalary;
        double salary=bonus+annualincrement+basicsalary;
        System.out.println(salary);
       if ( basicsalary<=40000)
        { System.out.println("salary of programmer");
        }
        else {
            System.out.println("salary of Manager");}
    }}



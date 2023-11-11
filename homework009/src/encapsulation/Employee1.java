package encapsulation;

public class Employee1 extends Employee{
    public static void main(String[] args) {
        Employee1 t=new Employee1();
        t.setEmployeeId(22);
        t.setEmployeeName("keshav");
        System.out.println("Employee ID :"+t.getEmployeeId());
        System.out.println("Employee Name :"+t.getEmployeeName());
        System.out.println(t.getFormattedSalary(40000));
}}

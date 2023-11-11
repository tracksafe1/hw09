package encapsulation;

public class Car1 extends Car{
    public static void main(String[] args) {
        Car1 obj=new Car1();
        obj.setMileage(25);
        obj.setCompany_name("Toyata");
        obj.setModel_name("Etios");
        obj.setYear(2017);
        int getmileage= obj.getMileage();
        System.out.println("company name :"+obj.getCompany_name());
        System.out.println("model name :"+obj.getModel_name());
        System.out.println("Year is :"+obj.getYear());
        System.out.println("mileage is  :"+getmileage+"miles/hour");
    }
}

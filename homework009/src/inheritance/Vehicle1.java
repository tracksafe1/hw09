package inheritance;

public class Vehicle1 {


    double year;
    String fueltype;
    public static void main(String[] args) {
Vehicle1  object=new Vehicle1();
        object.calculatingFueleffiency(100,5);
        object.distancetravelled(100);
        object.maximumspeed(120);
        object.features("toyota","Etios",2022,"petrol");
    }
public  void calculatingFueleffiency(double distance,double fuelused){
        double fuelefficiency=distance/fuelused;
    System.out.println("Fueleffieciecy  :" +fuelefficiency);

}
public void distancetravelled(double distance){
    System.out.println("Distance travelled"+distance+"miles");

}
public void maximumspeed(double miles){
    System.out.println("Maximum speed :"+miles+"miles/hour");

}
public void features(String make,String model,double Year,String fueltype){
    System.out.println(make);
    System.out.println(model);
    System.out.println(year);
    System.out.println(fueltype);}}


package polymorphism;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle obj=new Vehicle();
        obj.speedUp();
    }
    public void speedUp(){
        System.out.println("Speed of different vehicles are different");
    }
}

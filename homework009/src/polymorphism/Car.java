package polymorphism;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car c=new Car();
        c.speedUp();

    }

    @Override
    public void speedUp() {
        System.out.println("speed of car is 100 miles/hour");
    }
}

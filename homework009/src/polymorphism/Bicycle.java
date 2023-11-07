package polymorphism;

public class Bicycle extends Vehicle{
    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        b.speedUp();
    }

    @Override
    public void speedUp() {
        System.out.println("bicycle speed is 10 miles/hour");
    }
}
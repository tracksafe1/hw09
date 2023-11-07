package inheritance;

public class Car extends Vehicle{
    public static void main(String[] args) {
       Car t=new Car();
       t.drive();
       t.features();
       t.sell("After repair I will sell my car");
    }

    @Override
    public void drive() {
        System.out.println("Repairing a Car");

    }
    public void sell(String sell){
        System.out.println(sell);

    }

}

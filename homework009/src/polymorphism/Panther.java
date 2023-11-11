package polymorphism;

public class Panther extends Animal{
    public static void main(String[] args) {
        Panther obj=new Panther();
        obj.move();
        obj.sound();

    }

    @Override
    public void move() {
        System.out.println("Panther run very fast");
    }

    @Override
    public void sound() {
        System.out.println("panther roar");
    }
}

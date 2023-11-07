package polymorphism;

public class Bird extends Animal {
    public static void main(String[] args) {
        Bird obj=new Bird();
        obj.sound();
        obj.move();
    }

    @Override
    public void sound() {
        System.out.println("birds do cheen cheen");
    }

    @Override
    public void move() {
        System.out.println("birds fly");
    }
}



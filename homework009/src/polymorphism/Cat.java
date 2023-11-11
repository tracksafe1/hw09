package polymorphism;

public class Cat extends Animal{
    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.sound();



    }

    @Override
    public void sound() {
        System.out.println("cat does meow meow");
    }
}

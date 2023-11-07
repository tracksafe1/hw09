package polymorphism;

public class Animal {
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.sound();
        obj.move();
    }
    public void sound(){

        System.out.println("different animals make different sounds");
    }
    public void move( ){
        System.out.println("how animals move");
    }
}

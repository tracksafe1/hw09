package polymorphism;/*. Write a Java program to create a base class Animal (Animal Family) with a method  called Sound().
 Create two subclasses Bird and Cat.
  Override the Sound() method in  each subclass to make a specific sound for each animal.
*/
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

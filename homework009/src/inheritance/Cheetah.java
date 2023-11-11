package inheritance;

public class Cheetah extends Animal {
    public static void main(String[] args) {
        Cheetah object=new Cheetah();
        object.move();
    }

    public void move(){
        System.out.println("Cheetah is running");

    }
}

package encapsulation;

public class Person1 extends Person {
    public static void main(String[] args) {

        Person1 p = new Person1();
        p.setName("keshav");
        p.setAge(12);
        p.setCountry("London");
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getCountry());
        System.out.println("===================");

    }
}
/*Write a Java program to create a class called Person with private instance variables
name, age. and country. Provide public getter and setter methods to access and modify
these variables.public int getEmp_Id() {   //getter method and This method used to get Value
        return emp_Id;
    }
    public void setEmp_Id(int emp_Id) {  //setter method. This method set the Value.
        this.emp_Id = emp_Id;
    }*/
package encapsulation;

public class Person {
    private String name;
    private int age;
    private String country;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

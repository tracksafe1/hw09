/*/* 1. Write a class with the name Rectangle. The class needstwo fields(instance variable) with name
width and length both of type double.
The class needsto have one constructor with parameters width and length both of type double and it
needs to initialize the fields.*/
package midweekhomework.Q20;

public class Rectangle {
    double width;
    double length;


          public Rectangle(double width,double length){
              this.width = (width < 0) ? 0 : width;
              this.length = (length < 0) ? 0 : length;

        }
        public double getWidth(){
        return width;
        }
        public double getLength(){
        return length;
        }
    public double getArea(){
         double Area=length*width;
         return Area;
    }
    }



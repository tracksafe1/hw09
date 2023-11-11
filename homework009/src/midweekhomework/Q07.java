/*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needsto find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needsto return -1 to indicate an invalid value.
public class IntToStringExample2{
public static void main(String args[]){
int i=200;
String s=Integer.toString(i);*/
package midweekhomework;

public class Q07 {
    public static void main(String[] args) {
        Q07 t = new Q07();
        System.out.println(t.sumFirstAndLastDigit(456));
        System.out.println(t.sumFirstAndLastDigit(108));
        System.out.println(t.sumFirstAndLastDigit(-4 ));
        System.out.println(t.sumFirstAndLastDigit(335));

    }

    public int sumFirstAndLastDigit(int number) {
        //number 235

        if (number < 0) {
            return -1;
        }else {
            int lastdigit = number % 10;
            int firstdigit = number;
            for (firstdigit = number; firstdigit >= 10; firstdigit = firstdigit / 10) ;
            return firstdigit + lastdigit;
        }


    }
}
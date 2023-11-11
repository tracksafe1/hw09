/*Write a method named hasSharedDigit with two parameters of type int.
Each numbershould be within the range of 10 (inclusive) - 99 (inclusive). If one ofthe numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public staticpackage midweekhomework;
*/
public class Q13{
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,34));
    }
    public static boolean hasSharedDigit(int number1, int number2){
        if((number1<10||number1>99)&&(number2<10||number2>99)){
            return false;
        }
        int number1firstdigit=number1/10;
        int number2firstdigit=number2/10;
        int number1lastdigit=number1%10;
        int number2lastdigit=number2%10;
        if((number1firstdigit==number2firstdigit)||(number1firstdigit==number2lastdigit)||(number1lastdigit==number2firstdigit)||(number1lastdigit==number2lastdigit))
        {return true;
        }else
        {return false;}}}


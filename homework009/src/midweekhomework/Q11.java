/*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative*/
package midweekhomework;

public class Q11 {
    public static void main(String[] args) {
        System.out.println("sum of even digits:"+getEvenDigitSum(123456789));
        System.out.println("sum of even digits:"+getEvenDigitSum(252));
        System.out.println("sum of even digits:"+getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;}
        int digit;
        int sum = 0;
        while(number > 0) {
            digit = number % 10;
            if(isEven(digit)) {
                sum += digit;
            }
            number =number/10;
        }
        return sum;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

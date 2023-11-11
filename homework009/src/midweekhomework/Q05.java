/*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
Itshould return true ifthe number is a palindrome number otherwise itshould return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to*/
package midweekhomework;

public class Q05 {
    public static void main(String[] args) {
        Q05 t=new Q05();
        isPalindrome(121);
        isPalindrome(1451);
    }


    public static  int reverse(int number) {
        int reverse1 = 0;
        while (number > 0) {

            int lastdigit = number % 10;
            reverse1 = reverse1 * 10;
            reverse1 = reverse1 + lastdigit;
            number = number / 10;

        } return reverse1;
    }
       public static boolean isPalindrome(int number){
        int reverse1=reverse( number);
        boolean result;
        if (number == reverse1) {
            result=true;
            System.out.println("no is palindrome");
        }else{
            result=false;
            System.out.println(("no is not  palindrome"));
        }  return result;
    }}

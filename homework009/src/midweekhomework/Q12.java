/*write a program to check whether no is prime or not)*/
package midweekhomework;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
       int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=s.nextInt();
        for (int i=1;i<=number;i++){
            if(number%i==0){
                count++;

            }
        }if (count==2){
            System.out.println("Number is Prime number");
        }else{
            System.out.println("Number is not Prime");
        }

        }

}

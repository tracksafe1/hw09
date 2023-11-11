/*15. Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *    */
package midweekhomework;

public class Q15 {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/
package midweekhomework;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Q08 {
    public static void main(String[] args) {
rightangletriangle();
    }
    public static void rightangletriangle(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}

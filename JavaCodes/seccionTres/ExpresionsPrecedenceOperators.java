/*
 * Author: Fabián Camp Mussa.
 * Date: October 23, 2018.
 * 
 * Details: In this program we will see how the precedence operators afects the output.
 **/
package seccionTres;

public class ExpresionsPrecedenceOperators {
    
    public static void main(String[] args) {
        
        // Declaration of the variables we are going to use.
        int a = 5;
        int b = 2;
        int c = 3;
        
        // First the multiplation b * c, will be done and then it will add the value of a.
        int r = a + b * c;
        System.out.println("Value of r: " + r);
        
        // First it will add a + b then, it will multiply c to the result.
        r = (a + b) * c;
        System.out.println("Value of r: " + r);
    }
}

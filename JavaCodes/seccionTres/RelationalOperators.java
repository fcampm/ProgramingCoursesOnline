/*
 * Author: Fabián Camp Mussa.
 * Date: October 21, 2018.
 * 
 * Details: In this program we are going to learn the different relational operators that we can use in the if statements. It exists different kind of this opearators, 
 * some examples are:
 * 1. > (greater than).
 * 2. < (lower than).
 * 3. >= (greater or equal than).
 * 4. <= (lower or equal than).
 * 5. == (equal than).
 * 6. != (different than).
 *
 * Also it exists the logical operators that we use when we need to have more than one condition or another condition, etc:
 * 1. && (logic and).
 * 2. || (logic or).
 * 3. ! (logic not).
 **/
package seccionTres;

public class RelationalOperators {
    
    public static void main(String[] args) {
        
        // Declaration of the variables to use.
        int a = 6;
        int b = 2;
        
        if(a > 3 && !(b < 1)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

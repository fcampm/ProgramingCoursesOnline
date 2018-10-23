/*
 * Author: Fabián Camp Mussa.
 * Date: October 21, 2018.
 * 
 * Details: In this program we will use the switch case structure for multiple conditions.
 **/
package seccionTres;

import java.util.Scanner;

public class SwitchCaseConditional {
    
    public static void main(String[] args) {
        
        // Declaration of the variables that we are going to use.
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("Compute any number: ");
        a = sc.nextInt();
        
        // Implementation of the switch case condition.
        switch(a){
            case 1:
                System.out.println("\nThis is the first case");
                break; // It's important to put the break for the correct behavior of the switch case conditional.
            case 2:
                System.out.println("\nThis is the second case");
                break;
            case 3:
                System.out.println("\nThis is the third case");
                break;
            default: // In case the condition "a" does not have a value of 1, 2 or 3 it will enter to this case that is the default case.
                System.out.println("\nNot a valid number for a case");
                break;
        }
    }
}

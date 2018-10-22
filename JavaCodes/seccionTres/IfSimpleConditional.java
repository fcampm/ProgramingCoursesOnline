/*
 * Author: Fabián Camp Mussa.
 * Date: October 21, 2018.
 * 
 * Details: In this program we will use a simple control conditional to control the logic that the program.
 **/

package seccionTres;

import java.util.Scanner;

public class IfSimpleConditional {
    
    public static void main(String[] args) {
        
        // Declaration of the variables we are going to use.
        int a;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        a = sc.nextInt();
        
        // Simple conditional sentence. If the value of a is greater than 2 then, it will run the code beneath the if statement.
        if (a > 2){
            System.out.println("\nThe number " + a + " is greater than 2");            
        }
        // In case that the value of a is lower than 2 then, the program will run the code beneath the else statement.
        else{
            System.out.println("\nThe number " + a + " is lower than 2\n");
        }
    }
}

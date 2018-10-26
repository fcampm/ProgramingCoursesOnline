/*
 * Author: Fabián Camp Mussa.
 * Date: October 26, 2018.
 * 
 * Details: In this program we will see the 3 different kinds of loops that we can use. This three loops are:
 * 1. While Loop.
 * 2. Do-While Loop.
 * 3. For Loop.
 **/

package seccionTres;

import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args) {
        
        // We call the function whileLoop to execute its intructions, also we do the same with the doWhileLoop function.
        whileLoop();
        doWhileLoop();
        forLoop();
    }
    
    public static void whileLoop(){
        
        // Declaration of the variables we are going to use.
        Scanner sc = new Scanner(System.in);
        String answer;
        
        System.out.print("Do you want to repeat? (y|n): ");
        answer = sc.next();
        
        // Here we are going to use a while loop to see how it works and its sintaxys.
        while(answer.equalsIgnoreCase("y")){
            
            System.out.println("Do you want to repear? (y|n)");
            answer = sc.next(); // We need to ask again for the answer, becasue in case we do not ask it we will enter an infinity loop; this is, the program will never end.
        }
    }
    
    public static void doWhileLoop(){
        
        // Declaration of the variables we are going to use.
        int turn = 0; 
        Scanner sc = new Scanner(System.in);
        String answer;
               
        // Here we are using the do-while loop to see how it works and its sintaxys.
        do{
            
            turn++; // We add one to the variable turn. Also we can put this turn += 1; or turn = turn + 1;
            System.out.println("Turn value: " + turn);
            System.out.println("Do you want to repeat? (y|n)");
            answer = sc.next();
        }
        // In this case we need to put a semicolon after the while command.
        while(answer.equalsIgnoreCase("y"));        
    }
    
    public static void forLoop() {
        
        // Declaration of the variables we a re going to use.
        int counter = 0;        
        
        // Here were are using the for loop to see how it works and its sintaxys.
        for(int i = 0; i <= 10; i++){
            counter += i;
        }
        System.out.println("The sum of the first 10 numbers is: " + counter);
    }
}

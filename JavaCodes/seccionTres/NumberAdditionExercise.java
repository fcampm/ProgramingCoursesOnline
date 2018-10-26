/*
 * Author: Fabián Camp Mussa.
 * Date: October 26, 2018.
 * 
 * Details: The program will ask the user integer numbers and then it will ask if the user wants to add more numbers. In the case the user says no, we need to print the addition of
 * all the numbers and the program will end. 
 *
 * Note: The user might not want to enter any value, we never know.
 **/

package seccionTres;

import java.util.Scanner;

public class NumberAdditionExercise {
    
    public static void main(String[] args) {
        
        // Declaration of the variables we are going to use.
        Scanner moreNumbers = new Scanner(System.in);
        Scanner numberToAdd = new Scanner(System.in);            
        int addition = 0;
        String answer;
        
        System.out.print("Do you want to add numbers(y|n): ");
        answer = moreNumbers.next();
        if(answer.equalsIgnoreCase("y")){
            do{
                System.out.print("Please digit an integer number: ");
                int number = numberToAdd.nextInt();
                addition += number;
                System.out.print("Do you want to add more values(y|n): ");
                answer = moreNumbers.next();
            }
            while(answer.equalsIgnoreCase("y"));                        
            System.out.println("\n\nThe addition of all the values computed is: " + addition);        
        }
        else{
            System.out.println("Thank you for using the program :)");
        }
    }   
}

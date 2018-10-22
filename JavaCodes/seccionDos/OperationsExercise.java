/*
 * Author: Fabián Camp Mussa.
 * Date: October 21, 2018.
 * 
 * Details: Create a program that shows in the screen all the posible aritmetic operations that you can do with two different integer numbers, with two real numbers
 * and the operation with a real number and a integer number.
 **/
package seccionDos;

import java.util.Scanner;

public class OperationsExercise {
    
    public static void main(String[] args) {
        
        // Declaration of the variables we are going to use.
        Scanner sc = new Scanner(System.in);
        int userEntryOne;
        int userEntryTwo;
        double userEntryOneFloat;
        double userEntryTwoFloat;
        int typeOperation;
        System.out.print("\nWhat kind of operation you are going to do (1-int, 2-float): ");
        typeOperation = sc.nextInt();
        
        switch(typeOperation){
            case 1:
                System.out.print("\nEnter the first number: ");
                userEntryOne = sc.nextInt();
                System.out.print("Enter the second number: ");
                userEntryTwo = sc.nextInt();                
                operationIntegerNumbers(userEntryOne, userEntryTwo);
                break;
            case 2:
                System.out.print("\nEnter the first number: ");
                userEntryOneFloat = sc.nextFloat();
                System.out.print("Enter the second number: ");
                userEntryTwoFloat = sc.nextFloat();
                operationFloatNumbers(userEntryOneFloat, userEntryTwoFloat);
                break;
            default:
                System.out.print("\nNot an option, try again...");
                break;
        }                      
    }
    
    // Method that calculates the operations with integer numbers.
    public static void operationIntegerNumbers(int i, int j){
                        
        System.out.println("\nThe addition a + b is: " + Integer.toString(i + j));        
        System.out.println("The substraction a - b is: " + Integer.toString(i - j));
        System.out.println("The substraction b - a is: " + Integer.toString(j - i));
        System.out.println("The multiplication is: " + Integer.toString(i * j));
        System.out.println("The division a / b is: " + Double.toString((double)i / (double) j));
        System.out.println("The division b / a is: " + Double.toString((double)j / (double) i));
        System.out.println("The remainder a % b is: " + Integer.toString(i % j));
        System.out.println("The remainder b % a is: " + Integer.toString(j % i));
    }
    
    // Method that calculates the operations with float/float numbers and integer/float numbers.
    public static void operationFloatNumbers(double i, double j){
        
        System.out.println("\nThe addition a + b is: " + Double.toString(i + j));
        System.out.println("The substraction a - b is: " + Double.toString(i - j));
        System.out.println("The substraction b - a is: " + Double.toString(j - i));
        System.out.println("The multiplication is: " + Double.toString(i * j));
        System.out.println("The division a / b is: " + Double.toString(i / j));
        System.out.println("The division b / a is: " + Double.toString(j / i));
        System.out.println("The remainder a % b is: " + Double.toString(i % j));
        System.out.println("The remainder b % a is: " + Double.toString(j % i));
    }
}

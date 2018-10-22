/*
 * Author: Fabián Camp Mussa.
 * Date: October 19, 2018.
 * 
 * Details: Program that will ask the user for a certain input within the console.
 **/
package seccionDos;

import java.util.Scanner;

public class InputOutputData {
    
    public static void main(String[] args) {
        
        printString();
        inputString();
    }
    
    public static void printString(){
        System.out.println("This is an example of Output data in a program\n");
    }
    
    public static void inputString(){
        
        // Declaration of the variables we are going to use.
        Scanner sc = new Scanner(System.in); 
        String nombre;
        
        System.out.println("Enter your name:\n");
        nombre = sc.nextLine();
        System.out.println("Nice to meet you " + nombre);
    }
}

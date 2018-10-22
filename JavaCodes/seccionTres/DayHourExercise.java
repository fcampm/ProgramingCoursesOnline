/*
 * Author: Fabián Camp Mussa.
 * Date: October 21, 2018.
 * 
 * Details: This program will ask the user to compute the actual hour (hour and minutes). After this, in function of the values that the user compute, the program will show
 * if its a.m, if its afternoon or if its night. Another thing to have in mind its that if the value its 12 of the morning or 12 of the night, we will show a special message to the user.
 **/
package seccionTres;

import java.util.Scanner;

public class DayHourExercise {
    
    public static void main(String[] args) {
        
        // Declaration of the variables we are going to use.
        int hour;
        int minutes;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the actual hour: ");
        hour = sc.nextInt();
        System.out.print("\nEnter the actual minutes: ");
        minutes = sc.nextInt();
        
        if ((hour == 0 && minutes >= 1 && minutes <= 59) || (hour > 0 && hour <= 11 && minutes <= 59)){
            System.out.println("Good morning");            
        }
        if ((hour >= 12 && minutes >= 1 && minutes <= 59) || (hour > 12 && hour <= 18 && minutes <= 59)){
            System.out.println("Good afternoon");
        }
        if (hour >= 19 && hour <= 23 && minutes <= 59){
            System.out.println("Good night");
        }
        if (hour == 12 && minutes == 0){
            System.out.println("Middle of the day");
        }
        if (hour == 0 && minutes == 0){
            System.out.println("Middle of the night");
        }        
    }
}

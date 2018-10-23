/*
 * Author: Fabián Camp Mussa.
 * Date: October 23, 2018.
 * 
 * Details: The program will ask the user for a value between 0 and 10. Using this value, print the different grades. For example: approved for 5, regular for 7, excelent for 9 or 10.
 * If the value is not between 0 and 10 the program will print a message and do nothing more.
 **/
package seccionTres;

import java.util.Scanner;

public class ApprovedSuspendedExercise {
    
    public static void main(String[] args) {
        
        // Declaration of the variables we are going to use.
        Scanner sc = new Scanner(System.in);
        int studentGrade;
        
        // We ask the user for the grade of the student.
        System.out.print("Compute the grade of the student: ");
        studentGrade = sc.nextInt();
        
        // Using a switch case structure we can solve this problem.
        switch(studentGrade){
            // For the cases that the studentGrade variable is 1, 2, 3 or 4 we will print Subject Suspended.
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Subject Suspended");
                break;
            // For the case that the studentGrade variable is 5 or 6 we will print Subject Approved.
            case 5:
            case 6:
                System.out.println("Subject Approved");
                break;
            // For the case that the studentGrade variable is 7 or 8 we will print Subject approved with regular grade.
            case 7:
            case 8:
                System.out.println("Subject approved with regular grade");
                break;
            // For the case that the studentGrade variable is 9 or 10 we will print Subject approved with excelent grade.
            case 9:
            case 10:
                System.out.println("Subject approved with excelent grade");
                break;
            // For any other value of the studentGrade variable we will print Not a valid grade, try again...
            default:
                System.out.println("Not a valid grade, try again...");
                break;
        }
    }
}

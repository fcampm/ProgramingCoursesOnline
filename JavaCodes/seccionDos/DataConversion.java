/*
 * Author: Fabián Camp Mussa.
 * Date: October 19, 2018.
 * 
 * Details: Program that will show you how to do data convertion.
 * It exists 3 different forms of doing this implicit, casting (explicit) and conversion of String to int, double, etc.
 **/

package seccionDos;

/**
 *
 * @author fcamp
 */
public class DataConversion {
    
    public static void main(String[] args) {
        
        // Variable declaration.
        int a = 5;
        int explicit;
        int parsingInt;
        double c = 0.5;
        double implicit;
        double parsingDouble;
        String s = "7";
        
        implicit = a; // This type of data convertion its implicit.
        explicit = (int)c; // This type of data convertion is a casting or explicit convertion.
        parsingInt = Integer.parseInt(s);
        parsingDouble = Double.parseDouble(s);
        
        // We print the results of the data convertion.
        System.out.println("Implicit convertion: " + implicit);
        System.out.println("Explicit convertion: " + explicit);
        System.out.println("Parsing integer convertion: " + parsingInt);
        System.out.println("Parsing double convertion: " + parsingDouble);
    }
}

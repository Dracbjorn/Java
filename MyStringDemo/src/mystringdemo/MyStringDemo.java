/*
 * Create a Java class named MyStringDemo using your favorite text editor. Be 
 * sure you name the file “MyStringDemo.java”. Add code to the file in the 
 * main() method that will provide functionality to prompt the user for two 
 * strings and two integer values. Use the String concat() method and the + 
 * operator to concatenate the two Strings. Use the Integer.parseInt() to scan 
 * in two int values. Convert the int values to Strings and display the length 
 * of each of the Strings.
 */

package mystringdemo;

import java.util.Scanner;

/**
 *
 * @author Travis "Kent" Graves
 */
public class MyStringDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {
        
        // Declare integer variables
        int intVal1;
        int intVal2;
        
        // Declare string variables
        String stringVal1 = "";
        String stringVal2 = "";
        
        // Declare Scanner class userInput
        Scanner UserInput = new Scanner(System.in);
        
        // Get Integer value one
        System.out.print("Enter Integer Value One: ");
        intVal1 = Integer.parseInt(UserInput.next());
       
        
        // Get Integer value two
        System.out.print("Enter Integer Value Two: ");
        intVal2 = Integer.parseInt(UserInput.next());
        
        // Convert Integers to Strings
        String stringVal3 = Integer.toString(intVal1);
        String stringVal4 = Integer.toString(intVal2);
        
        // Get String value one
        System.out.print("Enter String One: ");
        stringVal1 = UserInput.next();
       
        // Get String value two
        System.out.print("Enter String Two: ");
        stringVal2 = UserInput.next();
        
        // Concat Strings
        System.out.println("Your string values using + are: " + 
                stringVal1 + " " + stringVal2);
        
        System.out.println("Your string values using concat() are: " + 
                stringVal1.concat(" ").concat(stringVal2));
        
        // Display length of all strings
        System.out.println("The length of string 1 is: " + stringVal1.length());
        System.out.println("The length of string 2 is: " + stringVal2.length());
        System.out.println("The length of string 3 is: " + stringVal3.length());
        System.out.println("The length of string 4 is: " + stringVal4.length());     
        
    }
    
}

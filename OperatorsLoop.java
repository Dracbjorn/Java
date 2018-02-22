/* File: OperatorsLoop.java
 * Author: Travis "Kent" Graves
 * Date: 30-01-2015
 * Purpose: Demonstrates the use of mathmatical operators using and validating user input
 * until the user decides to stop.
 */

// List imports
import java.util.Scanner;
import java.io.*;

public class OperatorsLoop {

    public static void main(String [] args) {

        // Declare variables
        int result = 0;
        String desiredOperation = "";
        int validateInput;
        int intOne = 0;
        int intTwo = 0;

        // Define the scanner class for user input
        Scanner userInput = new Scanner(System.in);
    
        // Gather user input using do while loops
        boolean quit = false;
        do {        

            // Prompt the user for the first integer
            System.out.print("Enter the first integer: ");
            intOne = userInput.nextInt();
                
            // Prompt the user for the second integer
            System.out.print("Enter the second integer: ");
            intTwo = userInput.nextInt();

            // Get desired operator and validate
            validateInput = 0;
            while (validateInput == 0) {

                // increment while loop counter
                validateInput++;

                // Prompt the user for the desired operation
                System.out.print("Enter the desired operation: ");
                desiredOperation = userInput.next();

                // Validate user input
                switch (desiredOperation) {
                    case "+":
                        result = intOne + intTwo;
                        break;
                    case "-":
                        result = intOne - intTwo;
                        break;
                    case "/":
                        result = intOne / intTwo;
                        break;
                    case "*":
                        result = intOne * intTwo;
                        break;
                    case "%":
                        result = intOne % intTwo;
                        break;
                    case "&":
                        result = intOne & intTwo;
                        break;
                    case "|":
                        result = intOne | intTwo;
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        System.out.println("Valid Operators: + - / * % & |");
                        // Decrement loop counter to re-iterate if input is not valid
                        --validateInput;
                        break;
                } // End Switch
            } // End While Loop

            // Print the result of the equation
            System.out.println("\n" + intOne + " " + desiredOperation + " " + intTwo + " = " + result + "\n");
 
            // Ask if user wants to perform another operation
            String choice = "";
            while (choice == "") {

                // Get users decision
                System.out.print("Would you like to perform another operation? [y/n] ");
                choice = userInput.next();

                // Validate choice
                switch(choice) {

                    case "y":
                        // If yes then restart the program
                        System.out.println("Performing another operation...\n");
                        break;
                    case "n":
                        // If no set quit to true and exit loop to exit program
                        quit = true;
                        break;
                    default:
                        // If invalid ask the user again
                        System.out.println("Not a valid answer!");
                        choice = "";

                } // End Switch

            } // End While Loop

        } while (!quit); // End While Loop

    } // End of main

} // End of Class OperatorsLoop
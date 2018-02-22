// Filename: Homework1
// CMIS 141
// Author: Ryan O'Connor
// Date: 01/29/2015

import java.util.*;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        
        //declare variables
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int reps;
        int i;
        
        boolean quit = false;
        do {

            //get the number of loops to run.
            System.out.println("***** Random Number Generator *****");
            System.out.print("Please enter the number of random numbers to generate: ");
            reps = input.nextInt();
            System.out.println();
            System.out.println("Your random numbers are listed below:");
            
            //loop to generate random numbers.
            for (i = reps; i > 0 ; i--) {
                System.out.println(rand.nextInt());
            }

            // Ask if user wants to perform another operation
            String choice = "";
            while (choice == "") {

                // Get users decision
                System.out.print("Would you like to perform another operation? [y/n] ");
                choice = input.next();

                // Validate choice
                switch(choice) {

                    case "y":
                        // If yes then restart the program
                        System.out.println("\nRestarting...\n");
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
        } while(!quit);
       
    } // End Main
    
} // End Class
// Import statements

import java.util.Scanner;

public class ErrorExamples {

  public static void main(String [] args) {

    // Define variables
    int num1;
    int num2;

         // Create scanner class
    Scanner scannerIn = new Scanner(System.in);

    //Set the variables
    System.out.println("Please enter your first integer below: "); // Added space after ":"
    num1 = scannerIn.nextInt(); // Changed from ":" to ";"


    System.out.println("Please enter your second integer below: "); // Added space after ":"
    num2 = scannerIn.nextInt();

    //print the two integers  // Added second "/" on comment
    System.out.println("You picked integers: " + num1 + " and " + num2 + "!!");
  } // End of main  

} // End of Class ErrorExamples
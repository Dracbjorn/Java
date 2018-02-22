/* File: HomeWorkOnePart1.java

 * Author: G. Niles

 * Date: 2015-01-24

 * Class: CMIS

 * Purpose: Demonstrates  understanding of Java technology variables and data types,

 * operators, assignment statements, standard input/output, selection statements, using Java style guides

 * and debugging code to find and fix compile and run-time errors.

 * The program prints the following // Fixed Line Indentation

 *            1 + 2 = 3

 *            3 - 1 = 2

 *            2 * 2 = 4

 *            4 / 2 = 2

 *            2 + 8 = 10

 *            10 % 7 = 3

*/


// Import each required Java class

import java.io.IOException;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Scanner;

 

public class HomeWorkOnePart1Edit
{
    public static void main (String[] args)
    {
        char operation = ' ';

        int firstInt = 0;

        int secondInt = 0;

        int resultInt = 0;

        boolean isInputValid = false;    

        // Use the Scanner class to read Standard Input

        Scanner stdin = new Scanner(System.in);

        // Display a welcome note

        System.out.println ("Class: CMIS 141   Section 4020 homework assignment 1 part 1");

        boolean quit = false;
        do
        {

            // Prompt the user to enter the first integer

            // Use print instead of println allows user to input values on the same line as the prompt versus awkwardly entering the value on the line below the prompt.

            System.out.print ("Enter the first integer: "); // Added a ":" and a space to make prompt feel cleaner

            // the nextInt() method scans the next int value

            firstInt = stdin.nextInt();

            // Prompt the user to enter another integer

            System.out.print ("Enter the next integer: "); // Same fixes as above

            // the nextInt() method scans the next int value

            secondInt = stdin.nextInt();

            // Prompt the user to enter the operation // Fixed comment indentation inconsistency

            // Put above the prompt to enter an operation so the user can see what values are valid as they are entering them.

            System.out.println("Valid values: ( *   /    %  +   - )   "); 

            System.out.print ("Enter a the operation's character: "); // And again, same fixes as above.

            operation = stdin.next().charAt(0); // Fixed spacing in consistencies

            // Echo the input values // Fixed comment indentation

            System.out.println ("The first integer: " + firstInt);

            System.out.println ("The second integer: " + secondInt);

            System.out.println ("The operation specified: " + operation);

            System.out.print ("Are all values valid? Enter 'true' or 'false' "); // Fixed indentation

            isInputValid = stdin.nextBoolean(); // Fixed indentation

            if (isInputValid)  { //3

                switch (operation) {  //4

                    case '*' :

                        resultInt = firstInt * secondInt;

                        break;         

                    case '/' :

                        resultInt = firstInt / secondInt;

                        break;        

                    case '%' :

                        resultInt = firstInt % secondInt;

                        break; 

                    case '+' :

                        resultInt = firstInt + secondInt;

                        break;

                    case '-' :

                        resultInt = firstInt - secondInt;

                        break;

                    default:

                        System.out.println ("Operation specified " + operation  + " is not valid.");

                        System.exit(0);             

                }  //4 end switch (operation)
            }   //3 end  true if (isInputValid)
            else
            {
                // If false is entered retart the program
                continue;
            }             

            System.out.println ("Result : " + firstInt + " " + operation + " " + secondInt +  " = " + resultInt);

            String ans = "";
            while (ans == "") {

                System.out.print ("Would you like to perform another operation? [y/n] ");
                ans = stdin.next();

                    // Validate ans
                    switch(ans) {

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
                            ans = "";
                    }
            }

        } while(!quit); // End Do While Loop   

    }  //2 end method main

}  // 1 end class ArithmeticDemo Wrong class name should be HomeWorkOnePart1
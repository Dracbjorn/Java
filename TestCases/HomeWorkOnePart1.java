/* File: HomeWorkOnePart1.java
 * Author: G. Niles
 * Date: 2015-01-24
 * Class: CMIS
 * Purpose: Demonstrates  understanding of Java technology variables and data types,
 * operators, assignment statements, standard input/output, selection statements, using Java style guides
 * and debugging code to find and fix compile and run-time errors.
* the program prints the fwllowing
 * 	1 + 2 = 3
 * 	3 - 1 = 2
 * 	2 * 2 = 4
 * 	4 / 2 = 2
 * 	2 + 8 = 10
 * 	10 % 7 = 3 
*/
 
// Import each required Java class
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWorkOnePart1
{  //1
      
    public static void main (String[] args) 
    {  //2
        char operation = ' ';
        int firstInt = 0;
        int secondInt = 0;
        int resultInt = 0;
        boolean isInputValid = false; 

        // Use the Scanner class to read Standard Input
        Scanner stdin = new Scanner(System.in);

    // Display a welcome note
    System.out.println (" Class: CMIS 141   Section 4020 homework assignment 1 part 1");
 
        // Prompt the user to enter the first integer
        System.out.println ("Enter the first integer");
        // the nextInt() method scans the next int value
        firstInt = stdin.nextInt();
        
        // Prompt the user to enter another integer
        System.out.println ("Enter the next integer");
        // the nextInt() method scans the next int value
        secondInt = stdin.nextInt();

         // Prompt the user to enter the operation
        System.out.println("Enter a the operation's character");
        System.out.println("Valid values: ( *   /    %  +   - )   ");       
        operation=stdin.next().charAt(0);

      // Echo the input values
        System.out.println ("The first integer: " + firstInt);
        System.out.println ("The second integer: " + secondInt);
        System.out.println ("The operation specified: " + operation);

         System.out.println ("Are all values valid? Enter 'true' or 'false' ");
          isInputValid = stdin.nextBoolean();
 
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
                    System.out.println ("Operation specified " + operation  + " not valid.");
                    System.exit(0);              
                }  //4 end switch (operation)
        }   //3 end  true if (isInputValid)   
        else {  //5
            System.out.println ("Invalid data entered program will end");
            System.exit(0);
        }  //5 end  false if (isInputValid)     
        System.out.println ("Result : " + firstInt + " " + operation + " " + secondInt +  " = " + resultInt); 
    }  //2 end method main
}  //1 end class ArithmeticDemo
/*
 * Write a Java program to simulate a die. A die has values of either 1, 2, 3, 4, 5 or 6 on
 * the face. You should use the Math.Random() or the java.util.Random() class to generate the 
 * values on the die. The program should prompt the user to enter how many times the die should 
 * be rolled. The output should show the results of each roll along with the total number of times 
 * 1, 2, 3, 4, 5 or 6 occurred for all rolls and the total sum comprised of the sum of all rolls.
 * Here is a sample run:
 *
 * How many times do you want to roll the die? 10
 *
 * Thank you! The die roll results for 10 rolls were:
 * 
 * The number of occurrences of each face were as follows:
 * 
 *   1: 1
 *   2: 3
 *   3: 2
 *   4: 1
 *   5: 1
 *   6: 2
 * 
 * The sum of die rolls was: 34
 */

package rollingdice;

// Imports
import java.util.Scanner;

/**
 *
 * @author Travis "Kent" Graves
 */
public class RollingDice {

  /**
   * @param args the command line arguments
   */
  public static void main ( String[] args ) {
    
    // Initiate variables
    int rollTimes;  // Amount of times to roll the die
    int rollValue;  // The value of the die when rolled
    boolean quit;   // Used for while loops
    boolean valid;  // Used for input validation

    // Build the Die object class
    Die die = new Die();

    // Initiate scanner class for userInput
    Scanner userInput = new Scanner(System.in);

    // Begin the rolling
    quit = false;
    do {

        // Get the amount of times to roll the die
        System.out.print("How many times do you want to roll the die? ");
        String stringNum = userInput.next();

        // Check the value of the string to ensure its a integer
        if (isInteger(stringNum)) {
            rollTimes = Integer.parseInt(stringNum);
        } else {
            System.out.println("That is not a valid amount!");
            continue;
        }

        // Print results of the rolls 
        System.out.println("Thank you! The results for " + rollTimes + " rolls are: ");
        
        // Roll the die
        for (int i = 0; i < rollTimes; i++) {
       
          die.roll();

        }

        // Print the number of times each value was rolled
        System.out.println("The number of occurences of each face value were: ");
        
        die.sumOfSides();
        
        // Print the sum of all the values
        System.out.println("The sum of all the values was: " + die.sumTotal());
        

        valid = false;
        while (!valid) {

            // Ask to add more weight
            System.out.print("Would you like to roll the die again?[y/n] ");
            char response = userInput.next().charAt(0);

            // Validate answer/response
            switch (response) {
                case 'y': case 'Y':
                    valid = true;
                    quit = false;
                    continue;
                case 'n': case 'N':
                    valid = true;
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid response!");
                    valid = false;
                    quit = false;
                    break;

            } // End switch response

        } // End while valid

    } while(!quit); // End Do While quit
    
    // Exit the script
    System.out.println("Thanks for rolling!");
    
  } // End method main
  
  // Checks if a string is a integer or not
    private static boolean isInteger(String str) {  
        
        try  
        {  
          int i = Integer.parseInt(str);
        }  
        
        catch(NumberFormatException nfe)  
        {  
          return false;  
        }  
        
        return true;  
        
    } // End method isInteger
  
} // End Class RollingDice

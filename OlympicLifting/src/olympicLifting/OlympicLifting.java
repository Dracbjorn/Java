/*
 * Provide Java code to create and initialize an array of integers (Java primitive int), floats or any
 * other Java primitive type of your choice. You pick the array name and length. Demonstrate how you 
 * would determine the length of your array. Show this through a code example you create where you use
 * the length member. Respond to other student postings by compiling and testing and providing 
 * feedback on their code.
 */

package olympicLifting;

// Imports
import java.util.Scanner;

/**
 *
 * @author Travis "Kent" Graves
 * 
 * Discussion Post Week 5
 * 
 * Olympic Lifting Class designed to simulate building a barbell with plates
 * and then lifting it for reps.  At the moment it is a generic exercise of
 * just lifting the bar with no specific movement.  May add specific movements
 * later such as Clean and Jerk or Snatch.
 */
public class OlympicLifting {
    
    public static void main ( String[] args ) throws InterruptedException {
        
        // Initiate variables
        int maxPlates = 5;                            // Max Plates that can fit on bar
        double[] plates = new double[maxPlates];      // An array for the weights to put on bar
        double plate;                                 // Variable to pass a single plate
        String[] stringNum = new String[maxPlates];   // Stores plate until converted to double plates[]
        double totalWeight;                           // Total weight of bar
        int totalReps;                                // Total number of reps completed
        boolean quit;                                 // Used for while loops
        boolean valid;                                // Used for input validation
        
        // Build the Barbell as an object class barbell
        Barbell barbell = new Barbell();
        
        // Initiate scanner class for userInput
        Scanner userInput = new Scanner(System.in);
        
        // Welcome Message
        System.out.println("*--- Welcome to Olympic Lifting Class! ---*");
        
        // Explain how input works
        System.out.println("\nPlates available are: 45, 25, 10, 5, 2.5, and 1.25 lbs.\n");

        System.out.println("What plates would you like to put on the barbell?\n");

        System.out.println("(For each plate entered we will assume you put the same on both sides.)");
        
        
        // Start assembling that barbell!
        int plateCount = 0;                   // Used to count plates added to array
        quit = false;                         // Terminates do while
        do {
            
            if (plateCount == plates.length) {              
              quit = true; // If this is 10th plate              
              System.out.println("The bar is full!\n");              
              break;
            }
          
            // Get the plates being added from user input
            System.out.print("\nEnter plate number " + (plateCount + 1) + ": ");

            if (plateCount < stringNum.length) {
              stringNum[plateCount] = userInput.next();
              plateCount++;
            }
            
            // Check the value of the string to ensure its a double
            if ((plateCount - 1) <= stringNum.length) {
              if (isDouble(stringNum[(plateCount - 1)])) {
                plates[(plateCount - 1)] = Double.parseDouble(stringNum[(plateCount - 1)]);
              } else {
                System.out.println("ERROR: Please enter one of the values listed!");
                plateCount--;
                continue;
              }
            }
            
            // Check the value of the plate added to ensure its a valid choice
            if ((plateCount - 1) <= plates.length) {
              String checkValue = Double.toString(plates[(plateCount - 1)]);
              switch (checkValue) {
                  case "45.0": case "25.0": case "10.0": case "5.0": case "2.5": case "1.25":
                      break;
                  default:
                      System.out.println("ERROR: Please enter one of the values listed!");
                      plateCount--;
                      continue;
              }
            }

            // Print the current weight of the bar 
            System.out.println("\nPutting 2 x " + plates[(plateCount - 1)] + "lbs. on the bar...\n");            
                    
            // Setter method to add weight to the bar. Weight is plates x 2 since weight is added
            // to both sides of the barbell.
            barbell.assembleBar(plates);

            // Check how much weight we loaded on the bar
            System.out.println("You have loaded " + barbell.checkWeight() + "lbs. on the bar.\n");
            
            if (plateCount < plates.length) {
              valid = false; // Terminates while loop
              while (!valid) {
                  // Ask to add more weight
                  System.out.print("Would you like to add anymore weight?[y/n] ");
                  char response = userInput.next().charAt(0);

                  // Validate answer/response
                  switch (response) {
                      case 'y': case 'Y':
                          valid = true;     // Exit 'valid' While
                          quit = false;     // Re-Iterate main DoWhile
                          continue;
                      case 'n': case 'N':
                          valid = true;     // Exit 'valid' While
                          quit = true;      // Exit main DoWhile
                          break;
                      default:
                          System.out.println("\nError: Invalid response!\n");
                          valid = false;    // Re-Iterate 'valid' While
                          quit = false;     // Re-Iterate main DoWhile
                          break;

                  } // End switch response

              } // End while valid
              
            } // End if

        } while(!quit); // End Do While quit
        
        // Do some work! Lets lift the bar!
        quit = false;   //Used to exit do while; Defaults to run once.
        do {
            
            // Get the amount of reps to do
            System.out.print("How many reps do you want to do? ");
            String repNum = userInput.next();
            
            // rep input validation
            int reps; // Stores amount of reps
            if (repNum.matches("[0-9]+")) {         
                reps = Integer.parseInt(repNum);
            } else {             
                System.out.println("\nERROR: Invalid amount!\n");
                continue;
            }            
            
            // Do the reps!
            barbell.liftTheBar(reps);
            
            // See what the total rep count is so far...
            System.out.println("You have performed " + barbell.checkReps() + " reps! Good Job!");
            
            valid = false;    // Terminates 'valid' While Loop
            while (!valid) {
                
                // Do another set?
                System.out.print("\nWould you like to do another set?[y/n] ");
                char response = userInput.next().charAt(0);
                
                // Validate answer/response
                switch (response) {
                    
                    case 'y': case 'Y':
                        valid = true;
                        quit = false;
                        break;
                        
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
            
        } while(!quit); // End while quit
        
        // Report the results of the workout
        System.out.println("\nGreat workout! You lifted " + barbell.checkWeight() + "lbs. " + barbell.checkReps() + " times!");
       
    } // End Main method
    
    // Checks if a string is a double or not
    private static boolean isDouble(String str) {  
        
        try {  
          double d = Double.parseDouble(str);
        }  
        
        catch(NumberFormatException nfe) {  
          return false;  
        }  
        
        return true;  
        
    } // End isDouble method
    
} // End Class

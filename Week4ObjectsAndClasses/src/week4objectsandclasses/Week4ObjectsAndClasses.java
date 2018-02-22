/*
 * Provide Java code for a simple class of your choice. Be sure to include at least
 * one constructor, two methods and two fields. The fields should be private.
 * Create a test class to constuct and call the methods of your class.
 * Describe your class and demonstrate your code functions properly.
 * Respond to other student postings by testing their Unique classes.
 */

package week4objectsandclasses;

// Imports
import java.util.Scanner;

/**
 *
 * @author Travis "Kent" Graves
 */
public class Week4ObjectsAndClasses {
    
    public static void main ( String[] args ) throws InterruptedException {
        
        // Initiate variables
        double plates; // weight to put on bar
        double totalWeight; // Total weight of bar
        int totalReps; // Total number of reps completed
        boolean quit; // Used for while loops
        boolean valid; // Used for input validation
        
        // Build the Barbell object
        Barbell barbell = new Barbell();
        
        // Initiate scanner class userInput
        Scanner userInput = new Scanner(System.in);
        
        // Start assembling the barbell
        quit = false;
        do {
            
            // Get the weight of the plate being added
            System.out.println("Plates available are: 45.0, 25.0, 10.0, 5.0, 2.5, 1.25");
            System.out.print("What plate would you like to put on the barbell? ");
            String stringNum = userInput.next();
            
            if (isDouble(stringNum)) {
                plates = Double.parseDouble(stringNum);
            } else {
                System.out.println("Please enter one of the values listed!");
                continue;
            }
            
            String checkValue = Double.toString(plates);
            switch (checkValue) {
                case "45.0": case "25.0": case "10.0": case "5.0": case "2.5": case "1.25":
                    break;
                default:
                    System.out.println("Please enter one of the values listed!");
                    continue;
                    
            }
            
            // Add weight to the bar
            totalWeight = barbell.assembleBar(plates);
          
            // Print the current weight of the bar
            System.out.println("You have " + totalWeight + "lbs. on the bar");
            
            valid = false;
            while (!valid) {
                
                // Ask to add more weight
                System.out.print("Would you like to add anymore weight?[y/n] ");
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
        
        // Lift the bar!
        quit = true;
        do {
            
            // Get the amount of reps to do
            System.out.print("How many reps do you want to do? ");
            int reps = Integer.parseInt(userInput.next());
            
            for (int i = 1; i <= reps; i++) {
                System.out.println(i + "...");
                Thread.sleep(1000);
            }
            
            // Count them reps!
            totalReps = barbell.liftTheBar(reps);
            System.out.println("You have performed " + totalReps + " reps! Good Job!");
            
            valid = false;
            while (!valid) {
                
                // Do another set?
                System.out.print("Would you like to do another set?[y/n] ");
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
        
        System.out.print("Great workout! You lifted " + barbell.checkWeight() + "lbs. " + barbell.checkReps() + " times!");
       
    } // End Main
    
    // Checks if a string is a double or not
    private static boolean isDouble(String str) {  
        
        try  
        {  
          double d = Double.parseDouble(str);
        }  
        
        catch(NumberFormatException nfe)  
        {  
          return false;  
        }  
        
        return true;  
        
    } // End isDouble
    
} // End Class

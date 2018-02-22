/*
Create your own simple Java application to generate X random Integer values between 0 and Y.
Use command line arguments for entry of X and Y. Demonstrate your code compiles and runs
without issue using screen captures as appropriate.
 */

package genxrandomint;

/**
 *
 * @author Travis "Kent" Graves
 */
public class GenXRandomInt {

  /**
   * @param args[1] = Number of random values to generate
   *            [2] = Upper limit of random values that are generated
   */
  public static void main ( String[] args ) {
    
    // Initiate variables
    // Use command line arguments to get X and Y values
    // Let x be the number of random values generated
    // Let y be the maximum value of random values generated
    int numValues = Integer.parseInt(args[0]);
    int numLimit = Integer.parseInt(args[1]);
    
    //Using x and y generate random X number of random values between the values 0 and Y
    for (int i = 0; i < numValues; i++) {
      // Create numValues number of random values and print to screen
      int randValue = (int) (Math.random() * numLimit + 1);
      System.out.println(randValue);
    }
    
  }
  
}

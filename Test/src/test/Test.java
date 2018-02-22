/*
 
 */

package test;

import java.lang.*;

public class Test {

  public static void main(String[] args) throws InterruptedException
  {
    
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
    
   


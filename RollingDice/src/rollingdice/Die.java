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

/**
 *
 * @author Travis "Kent" Graves
 */
public class Die {
  
  // Initiate variables
  private int sumOfRolls = 0;
  private int sideOne = 0;
  private int sideTwo = 0;
  private int sideThree = 0;
  private int sideFour = 0;
  private int sideFive = 0;
  private int sideSix = 0;
  
  // Main construct no parameters
  public Die() {
    
  } // End construct Die
  
  // Roll the dice. Has six sides.
  public int roll() {
    
    int rollValue = (int) (Math.random() * 6) +1;
    
    // Show the value of each roll
    System.out.println(rollValue);
    
    // Add roll amount to sum
    sumOfRolls = sumOfRolls + rollValue;
    
    // Increase number of times this face value was rolled
    
    switch (rollValue) {
      
      case 1:
        sideOne++;
        break;
        
      case 2:
        sideTwo++;
        break;
        
      case 3:
        sideThree++;
        break;
        
      case 4:
        sideFour++;
        break;
        
      case 5:
        sideFive++;
        break;
        
      case 6:
        sideSix++;
        break;
        
    }
    
    // Return value of the roll in case someone wants to use it
    return rollValue;
    
  } // End method roll
  
  // Used to get total of all rolls
  public int sumTotal() {
    
    return sumOfRolls;
    
  } // End method sumTotal
  
  // Prints individual die side occurences
  public void sumOfSides() {
    
    System.out.println("1: " + sideOne);
    System.out.println("2: " + sideTwo);
    System.out.println("3: " + sideThree);
    System.out.println("4: " + sideFour);
    System.out.println("5: " + sideFive);
    System.out.println("6: " + sideSix);

  } // End method sumOfSides
  
} // End class Die

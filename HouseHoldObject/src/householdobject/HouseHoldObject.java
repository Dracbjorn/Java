/*
Design and implement your own simple class to represent any household item of your choice 
(toaster, fan, hair dryer, piano ...) Your class should have a constructor, one additional method 
and at least one member variable (e.g. boolean isOn to turn the item on or off). Be sure you 
demonstrate your class works properly by constructing an instance of it and calling your method.
 */

package householdobject;

// Imports
import java.util.Scanner;

/**
 *
 * @author Travis "Kent" Graves
 */
public class HouseHoldObject {

  /**
   * @param args the command line arguments
   */
  public static void main ( String[] args ) {
    
    // Initiate for user input
    Scanner userInput = new Scanner(System.in);
    
    // Get the amount of Blender objects to create
    System.out.print( "How many Blenders do you own? " );
    String stringNum = userInput.next();
    
    // Initiate the object array
    Blender[] blender = new Blender[Integer.parseInt( stringNum )];
    
    // Contruct each object in the array
    for (int i = 0; i < blender.length; i++) {
      blender[i] = new Blender();
    }
    
    // Print the amount of objects using static method
    System.out.println( "\nNumber of Blenders: " + Blender.howMany() );
    System.out.println( "Number powered ON: " + Blender.howManyPoweredOn());
    
    // Print the state of each object Blender in the array
    System.out.println( "\nGetting current state of blenders..." );
    for (int i = 0; i < blender.length; i++) {
      System.out.println( "\nBlender " + (i + 1) );
      System.out.println( "Power State: " + blender[i].getPowerState() );
      System.out.println( "Speed Level: " + blender[i].getSpeed() );
      System.out.println( "Contents: " + blender[i].getContents() );
    }
    
    System.out.println( "\nUsing blenders...\n" );
    // Change state of blenders
    for (int i = 0; i < blender.length; i++) {
      if (((i + 1) % 2) == 0) { // For even number blenders
        // For the first half of even number blenders
        if ((i + 1) < (blender.length / 2)) {
          blender[i].setPowerState(true);
          blender[i].setSpeed(3);
          blender[i].setContents("Banana Smoothie");
        } else { // For the second half of even number blenders
          blender[i].setPowerState(true);
          blender[i].setSpeed(1);
          blender[i].setContents("Margarita");
        }
      } else { // For odd number blenders
        // For first half of odd number blenders
        if ((i + 1) < (blender.length / 2)) {
          blender[i].setPowerState(true);
          blender[i].setSpeed(2);
          blender[i].setContents("Cake Batter");
        } else { // For the second half of odd number blenders
          blender[i].setPowerState(false);
          blender[i].setSpeed(0);
          blender[i].setContents("empty");
        }
      }
    }
    
    System.out.println( "Getting new state of blenders...\n" );
    // Print the state of each object Blender in the array
    for (int i = 0; i < blender.length; i++) {
      System.out.println( "\nBlender " + (i + 1) );
      System.out.println( "Power State: " + blender[i].getPowerState() );
      System.out.println( "Speed Level: " + blender[i].getSpeed() );
      System.out.println( "Contents: " + blender[i].getContents() );
    }   
    
    System.out.println( "\nNumber of Blenders: " + Blender.howMany() );
    System.out.println( "\nNumber powered ON: " + Blender.howManyPoweredOn() );
  }  
}
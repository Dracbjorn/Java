/*
Write a Java program the displays the State bird and flower. The program should
prompt the user to enter a State and print both the State bird and flower. The user
should be able to enter a State without worrying about case. (e.g. Users could enter
Maryland, maryland, MARYLAND or any other possible combination of lower and upper case
characters) States may also contain leading and trailing white spaces. Hint: Store the
State information in a multi-dimensional array. The program should continue to prompt
the user to enter a state until “None” is entered. You will need to do some research 
to find the State birds and flowers. Here is a sample run:

Enter a State or None to exit:
Maryland
Bird: Baltimore Oriole
Flower: Black-eyed Susan
Enter a State or None to exit:
Delaware
Bird: Blue Hen Chicken
Flower: Peach Blossom
Enter a State or None to exit:
None
 */

package stateinfo;

// Imports
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Travis "Kent" Graves
 */
public class StateInfo {
    
  /**
   * @param args the command line arguments
   */
  public static void main ( String[] args ) {
    
    // Initiate Variables
    String workingDirectory = "<Insert PATH to file here> ";
    String stateInfoFile = workingDirectory + "StateInfo.txt";
    int numOfLines = 0;
    
    // 2D Array, with 3 columns and 50 rows for storing State Info
    // 3 Columns for State|Bird|Flower respectively and 50 rows for 50 states
    String[][] stateInfo = new String[3][50];
    
    // Retrieve State info from files StateInfo.txt
    // Create ReadFile objects to get state info from files
    ReadFile stateInfoFileData = new ReadFile(stateInfoFile);    
    
    // Read in the file
    try {
      stateInfoFileData.readFileData();
    }
    catch (IOException err) {
      System.out.println(err.getMessage());
      System.exit(0);
    } // End try/catch
    
    // Get the number of lines in the file
    try {
      numOfLines = stateInfoFileData.getNumLines();
    }
    catch (IOException err) {
      System.out.println(err.getMessage());
      System.exit(0);
    } // End try/catch
    
    // Create an array of size numOfLines to store every line of the file for parsing
    String[] lines = new String[numOfLines];
    lines = stateInfoFileData.getFileData();
    
    // Store state information in a Multi-Dimenstional array
    // Loop to assign each line of the array lines[] into the stateInfo 2D array
    for (int i = 0; i < lines.length; i++) {
      // Store current line in a string
      String string = lines[i];
      // Split the line into an array of 3 parts
      String[] parts = string.split("\\|");
      // Assign each part to the 2D array
      stateInfo[0][i] = parts[0];
      stateInfo[1][i] = parts[1];
      stateInfo[2][i] = parts[2];

    } // End for loop stateInfo assignment

    // Set boolean to exit the program if desired otherwise keep prompting user for input
    boolean quit = false;
    do {
      
      // Prompt User to enter a State
      // Create Scanner class for user input
      Scanner userInput = new Scanner(System.in);
    
      System.out.print( "\nEnter a State or None to exit: " );
      // Convert user input to all lower case and remove leading/trailing whitespace
      String stateSelected = userInput.next().toLowerCase().trim();

      // If user entered none, exit program
      if (stateSelected.compareTo("none") == 0) {
        System.out.println( "Goodbye!" );
        quit = true;
        System.exit(0);
      } // End if statement

      // Search through the array at index 0 for a match of that state selected
      int stateIndex = -1;
      for (int i = 0; i < stateInfo[0].length; i++) {
        // If a match is found set the index of the state to stateIndex
        if (stateInfo[0][i].equalsIgnoreCase(stateSelected)) {
          stateIndex = i;
        }
      } // End for loop

      // If the stateIndex was set and match was found print out the following state info
      if ((stateIndex) >= 0) {
        System.out.println( "State: " + stateInfo[0][stateIndex]);
        System.out.println( "State Bird: " + stateInfo[1][stateIndex]);
        System.out.println( "State Flower: " + stateInfo[2][stateIndex] );
      } else {
        // If state was not found or entered incorrectly prompt the user again
        System.out.println( "That is an invalid state!" );
      } // End If statement
      
    } while (!quit); // End do while loop
    
    
    // Ignore case and leading/trailing white space
    
    // Print the State flower and bird based off user input
    
    // If user enters none end the script
    
    
  } // End main method
  

  
} // End StateInfo Class

/*
Final Project CMIS 141 UMUC
Titanic Information Program
*/

package titanicInfo;

// Imports
import java.io.IOException;
import java.util.Scanner;
import java.time.*;

/**
 *
 * @author Travis "Kent" Graves
 */
public class TestTitanic {

  /**
   * @param args the command line arguments
   */
  public static void main ( String[] args ) throws InterruptedException {
    
    // Initiate time program was started
    Instant start = Instant.now();
    
    // Initiate variables
    String pathToFile = "null";
        
    // Get titanic.txt file location from arguments
    if (args.length != 1) { // If no argument is provided inform the user that they need one
      System.out.println( "Must provide path to file!" );
      System.out.println( "Usage ex: java TestTitanic \"C:\\Users\\MyName\\My Documents"
          + "\\titanic.txt\"" );
      System.exit(1);
    } else { // Echo the file the user provided
      pathToFile = args[0];
      System.out.println( "File provided: " + pathToFile );
    }
    
    // Welcome message
    System.out.println( "\nWelcome to my Titanic Program!" );
    
    // Initiate titanic file data object to read in file
    ReadFile titanicFileData = new ReadFile(pathToFile);
    
    // Read in the titanic.txt file
    try {
      titanicFileData.readFileData();
    }
    catch (IOException err) {
      System.out.println(err.getMessage());
      System.exit(1);
    } // End try & catch
    
    // Get the number of lines in the file
    int numOfLines = 0;
    try {
      // Set number of lines to variable numOfLines
      numOfLines = titanicFileData.getNumLines();
    }
    catch (IOException err) {
      System.out.println(err.getMessage());
      System.exit(1);
    } // End try & catch
    
    // Create an array of size numOfLines to store every line of the file for parsing
    String[] titanicDataRaw = new String[numOfLines];
    titanicDataRaw = titanicFileData.getFileData();
    
    // Initiate Titanic object and parse the info
    Titanic titanic = new Titanic(titanicDataRaw);
    String[][] titanicInfo = titanic.getInfo();
    
    // Start user input menu loop
    boolean quit = false; // Setting quit to true exits the loop
    do {
      
      // Initiate scanner class for user input
      Scanner userInput = new Scanner(System.in);
          
      // Prompt the user to perform a function
      String[] titanicOptions = titanic.getOptions();
      
      // Get and print out the available options of the Titanic object
      System.out.println("\nAvailable Titanic information functions:\n");
      for ( String titanicOption : titanicOptions ) {
        System.out.println(titanicOption);
      }
   
      // Get the users desired function/option
      System.out.println();
      System.out.print( "Please choose a function: " );      
      String option = userInput.next().toLowerCase();
      System.out.println();
      
      // Perform the desired function returning the value for quit
      quit = titanic.setOptions(option);      
      
    } while(!quit); // End do while
    
    // Goodbye message
    System.out.println( "Thank you for trying my Titanic program!" );
    
    // Calculate total time elapsed since program was started
    Instant stop = Instant.now();
    double duration = Duration.between( start, stop ).toMillis();
    System.out.println( "Total time elapsed was " + (duration / 1000) + " seconds." );
    
  } // End main method
  
} // End main class TestTitanic

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
  public static void main ( String[] args ) throws InterruptedException { 
    
    // Initiate Variables
    String workingDirectory = "./";
    String stateInfoFile = workingDirectory + "StateInfo.txt";
    int numOfLines = 0;
    
    // 2D Array, with 3 columns and 50 rows for storing State Info
    // 3 Columns for State|Bird|Flower respectively and 50 rows for 50 states
	final int COL = 3;
	final int ROW = 50;
    String[][] stateInfo = new String[COL][ROW];
    
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
	
	System.out.println("Raw lines from file prior to parsing...");
	Thread.sleep(2000);
	for (int i=0;i<lines.length;i++) {
		System.out.println(lines[i]);
	}
	Thread.sleep(2000);
    
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
	
	System.out.println("\nLines from file after being parsed and assigned to 2D array...");
	Thread.sleep(2000);
	for (int i=0; i < stateInfo[0].length;i++) {
		System.out.println( "\nState: " + stateInfo[0][i]);
		System.out.println( "State Bird: " + stateInfo[1][i]);
		System.out.println( "State Flower: " + stateInfo[2][i] );
	}
	Thread.sleep(2000);
	
	System.out.println("\nAll output was read into a two-dimensional array from the file " + stateInfoFile);
	System.out.println("Number of Columns: " + COL);
	System.out.println("Number of rows: " + ROW);
	System.out.println("Number of lines read from file: " + numOfLines);
		
  } // End main method

} // End StateInfo Class

/*
 Class used to read all data from a file into an array that can be subsequently used to parse for
information.
 */

package titanicInfo;

// Class Imports
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author Travis "Kent" Graves
 */
public class ReadFile {
  // Initiate Variables
  private String path;        // Path to file
  private String[] fileData;  // Array to store file data in
  
  // Default constructor
  public ReadFile() {
    this("null");
  }
  
  // Constructor setting path to file
  public ReadFile(String path) {
    this.path = path;
  }
  
  // Method reads in file data line by line from "path" into the fileData array
  public void readFileData() throws IOException {
    
    // Stores each character of file
    FileReader fileReader = new FileReader(this.path);

    // Stores lines of a file
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    
    int numOfLines = this.getNumLines();
    
    // Initiate array to store each line of the file to
    this.fileData = new String[numOfLines];

    // Assign each line of the file to the array
    for (int i = 0; i < this.fileData.length; i++) {
      this.fileData[i] = bufferedReader.readLine();
    }   
    
    // Close the BufferedReader
    bufferedReader.close();
    
  } // End readFileData method
  
  // Method counts the number of lines in the file
  public int getNumLines() throws IOException {
    
    int numOfLines = 0;
    
    // Stores each character of file
    FileReader fileReader = new FileReader(this.path);

    // Stores lines of a file
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    
    // Get the number of lines in the file
    while ((bufferedReader.readLine()) != null) {
      numOfLines++;
    }

    return numOfLines;
  }
  
  // Method returns the fileData array with all file information
  public String[] getFileData() {
    return this.fileData;
  }
  
}

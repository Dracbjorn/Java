/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stateinfo;

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
  private String path;
  private String[] fileData;
  
  public ReadFile() {
    this("null");
  }
  
  public ReadFile(String path) {
    this.path = path;
  }
  
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
  
  public String[] getFileData() {
    return this.fileData;
  }

}

/*
 * Homework week 4
 */

package testpolygon;

/**
 *
 * @author Travis "Kent" Graves
 * 
 * Object class Polygon
 * 
 * Construct:
 * Polygon() // No parameters
 * Polygon(integer numberOfSides, double lengthOfSides, double coordOfX, double coordOfY)
 * 
 * Methods:
 * setNumSides(integer numberOfSides)   // sets the number of sides the polygon has
 * setSideLength(double lengthOfSides)  // Sets the length of the polygon sides
 * setXCoord(double coordOfX)           // Sets X coordinate of polygon
 * setYCoord(double coordOfY)           // Sets Y coordinate of polygon
 * getNumSides                          // Number of sides the polygon has
 * getSideLength                        // Length of polygon sides
 * getXCoord                            // X coordinate of polygon
 * getYCoord                            // Y coordinate of polygon
 * getPerimeter                         // Sum of all the sides lengths
 * toString                             // Returns properties as a string
 * 
 */
public class Polygon {
  
  // Initiate private variables
  private int numSides = 4;         // Number of polygon sides
  private double sideLength = 10.0; // Length of each side
  private double xCoord = 0.0;      // X coordinate for center of polygon
  private double yCoord = 0.0;      // Y coordinate for center of polygon
  
  // No argument construct
  public Polygon() {
    
    // Create default polygon with default values which are already inititated
    
  } // End default Polygon construct
  
  public Polygon(int numberOfSides, double lengthOfSides, double coordOfX, double coordOfY) {
    
    // Set new polygon variables
    numSides = numberOfSides;
    sideLength = lengthOfSides;
    xCoord = coordOfX;
    yCoord = coordOfY;
    
  } // End construct Polygon
  
 public void setNumSides(int num) {
   
    numSides = num;
    
    System.out.println("setNumSides results: " + numSides);
   
  } // End method setNumSides
  
 public void setSideLength(double num) {
   
    sideLength = num;
    
    System.out.println("setSideLength results: " + sideLength);
   
  } // End method setSideLength
 
 public void setXCoord(double num) {
   
    xCoord = num;
    
    System.out.println("setXCoord results: " + xCoord);
   
  } // End method setXCoord
 
 public void setYCoord(double num) {
   
    yCoord = num;
    
    System.out.println("setYCoord results: " + yCoord);
   
  } // End method setYCoord
 
 public int getNumSides() {
   
   System.out.println("getNumSides results: " + numSides);
   
   return numSides;
   
 } // End method getNumSides
 
 public double getSideLength() {
   
   System.out.println("getSideLength results: " + sideLength);
   
   return sideLength;
   
 } // End method getSideLength
 
 public double getXCoord() {
   
   System.out.println("getXCoord results: " + xCoord);
   
   return xCoord;
   
 } // End method getXCoord
 
 public double getYCoord() {
   
   System.out.println("getYCoord results: " + yCoord);
   
   return yCoord;
   
 } // End method getYCoord
 
 public double getPerimeter() {
   
   double polygonPerimeter = sideLength * numSides;
   
   System.out.println("getPerimeter results: " + polygonPerimeter);
   
   return polygonPerimeter;
   
 } // End method getPerimeter
 
 public @Override String toString() {
   
   String polygonProperties = "The polygon has the following properties:\n"
       + "Number of Sides: " + numSides + "\n"
       + "Length of each Side: " + sideLength + "\n"
       + "Location of Polygon: " + xCoord + "," + yCoord;
   
   System.out.println("toString results below:\n\n" + polygonProperties);
   
   return polygonProperties;
   
 } // End method toString
  
  
} // End class Polygon

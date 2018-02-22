/*
 * Homework Week 4
 *
 * Notes:
 *
 * Need to learn how to pass an object to a method or pass each object one at a time to a loop
 * so that I don't have to repeat the same code over and over again. 
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
 */
public class TestPolygon {

  /**
   * @param args the command line arguments
   */
  public static void main ( String[] args ) {
    
    // Welcome message
    System.out.println("Welcome to the polygon builder!");
    
    System.out.println(); // Add a break between polygons for good formatting
    
    // Build first polygon object with default values
    Polygon polygonOne = new Polygon();
    
    // Demonstrate method uses for polygonOne
    System.out.println("Building polygon one...");
    
    polygonOne.setNumSides(4);      // Kept default values
    polygonOne.setSideLength(10.0); // Kept default values
    polygonOne.setXCoord(0.0);      // Kept default values
    polygonOne.setYCoord(0.0);      // Kept default values
    polygonOne.getNumSides();
    polygonOne.getSideLength();
    polygonOne.getXCoord();
    polygonOne.getYCoord();
    polygonOne.getPerimeter();
    polygonOne.toString();
    
    System.out.println(); // Add a break between polygons for good formatting

    // Build a second polygon object with custom values
    Polygon polygonTwo = new Polygon(6,5.5,-7.5,17.0);
    
    // Demonstrate method uses for polygonTwo
    System.out.println("Building polygon two...");
    
    polygonTwo.setNumSides(6);
    polygonTwo.setSideLength(5.5);
    polygonTwo.setXCoord(-7.5);
    polygonTwo.setYCoord(17.0);
    polygonTwo.getNumSides();
    polygonTwo.getSideLength();
    polygonTwo.getXCoord();
    polygonTwo.getYCoord();
    polygonTwo.getPerimeter();
    polygonTwo.toString();
    
    System.out.println(); // Add a break between polygons for good formatting
    
    // Build a third polygon object with custom values
    Polygon polygonThree = new Polygon(10,6.2,-15.4,28.0);
    
    // Demonstrate method uses for polygonThree
    System.out.println("Building polygon three...");
    
    polygonThree.setNumSides(10);
    polygonThree.setSideLength(6.2);
    polygonThree.setXCoord(-15.4);
    polygonThree.setYCoord(28.0);
    polygonThree.getNumSides();
    polygonThree.getSideLength();
    polygonThree.getXCoord();
    polygonThree.getYCoord();
    polygonThree.getPerimeter();
    polygonThree.toString();
    
    System.out.println(); // Add a break between polygons for good formatting
    
    // Build a fourth polygon object with custom values
    Polygon polygonFour = new Polygon(2,1,14.5,-22.5);
    
    // Demonstrate method uses for polygonFour
    System.out.println("Building polygon four...");
    
    polygonFour.setNumSides(2);
    polygonFour.setSideLength(1);
    polygonFour.setXCoord(14.5);
    polygonFour.setYCoord(-22.5);
    polygonFour.getNumSides();
    polygonFour.getSideLength();
    polygonFour.getXCoord();
    polygonFour.getYCoord();
    polygonFour.getPerimeter();
    polygonFour.toString();
    
    System.out.println(); // Add a break between polygons for good formatting
    
    // Build a fifth polygon object with custom values
    Polygon polygonFive = new Polygon(128,452.5,-500.0,100.0);
    
    // Demonstrate method uses for polygonFive
    System.out.println("Building polygon five...");
    
    polygonFive.setNumSides(128);
    polygonFive.setSideLength(452.5);
    polygonFive.setXCoord(-500.0);
    polygonFive.setYCoord(100.0);
    polygonFive.getNumSides();
    polygonFive.getSideLength();
    polygonFive.getXCoord();
    polygonFive.getYCoord();
    polygonFive.getPerimeter();
    polygonFive.toString();
    
    System.out.println(); // Add a break between polygons for good formatting
    
    // Goodbye message
    System.out.println("Thanks for building polygons!");
    
  } // End method main
  
} // End class TestPolygon

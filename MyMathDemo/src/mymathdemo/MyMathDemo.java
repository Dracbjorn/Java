
/** Create a Java class named MyMathDemo using your favorite text editor. Be
 * sure name the file “MyMathDemo.java”. Add code to the file in the main()
 * method that will provide functionality to prompt the user to enter the length
 * of two sides of a right triangle. Then use the Math.hypot() method to
 * calculate the length of the hypotenuse. Next, demonstrate the use of the
 * Math.pow() method by printing the results for 10 raised to the 2nd, 3rd and
 * 4th powers. Finally, simulate the Maryland lottery pick 5 by generating five
 * “pseudorandom” numbers between the values of 1 and 35.
 */

package mymathdemo;

import java.util.Scanner;

/**
 *
 * @author Travis "Kent" Graves
 */
public class MyMathDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args ) {
        // Declare Scanner Class userInput
        Scanner userInput = new Scanner(System.in);
        
        // Determine the Hypotenuse of two doubles        
        System.out.print( "Enter the length of the first side of a right angle: ");
        double firstAngle = userInput.nextDouble();
        
        System.out.print( "Enter the length of the second side of the right angle: ");
        double secondAngle = userInput.nextDouble();
        
        System.out.println("The Hypotenuse of the right angle is: " + Math.hypot(firstAngle, secondAngle));
        
        // Determine the answer to 10 raised to the 2nd, 3rd, and 4th
        System.out.println("10 squared is: " + Math.pow( 10, 2));
        System.out.println("10 cubed is: " + Math.pow(10, 3));
        System.out.println("10 to the 4th is: " + Math.pow(10, 4));
        
        // Maryland lottery simulator
        System.out.println("The five numbers for the pick five are...");
        for (int i = 0; i<10000; i++)
        {
            double randoNum = (int) (Math.random() * 35) +1;
            System.out.println(randoNum);
        }
        
    }
    
}

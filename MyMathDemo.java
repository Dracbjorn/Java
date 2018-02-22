/*
* File: MyMathDemo.java
* Author: Dr. Robertson
* Date: January 1, 2015
* Purpose: This program calculates the hypotenuse given
* 2 sides of a right triangle and the 10 raised to 2,3 and 
* 4th powers.
*/

// Import statements
import java.util.Scanner;

public class MyMathDemo {	
    public static void main(String[] args)  { 	

	// Display a Welcome note
       System.out.println("Welcome to the My Math Class Demo");

	// Variables to hold values
	double side1 = 0.0;
	double side2 = 0.0;
	
	// Use the Scanner class to input data
        Scanner scannerIn = new Scanner(System.in);

	System.out.println("Enter the first side (>0.0) :");
	// the nextInt() method scans the next int value
        side1 = scannerIn.nextDouble();

	// Verify the angle was entered
	System.out.println("The following side1 was entered " + side1);

	System.out.println("Enter the second side (>0.0) :");
	// the nextInt() method scans the next int value
        side2 = scannerIn.nextDouble();

	// Verify the angle was entered
	System.out.println("The following side2 was entered " + side2);

	// Calculate the hypotenuse and display
	double hypotenuse = Math.hypot(side1,side2);
	
	// Display results
	System.out.println("Hypotenuse is " + hypotenuse);

	// Use the power function to calculate
	// 10 raised to the 2nd, 3rd and 4th.
	System.out.println("10 raised to the second power is " + Math.pow(10,2));
	System.out.println("10 raised to the third power is " + Math.pow(10,3));
	System.out.println("10 raised to the fourth power is " + Math.pow(10,4));	

	// Generate 5 pseudorandom numbers between 1 and 35
	// First number
	int firstBall = (int) (Math.random() * 36) +1 ;	
	// Second number
	int secondBall = (int) (Math.random() * 36) +1 ;	
	// Third number
	int thirdBall = (int) (Math.random() * 36) +1 ;
	// Fourth number
	int fourthBall = (int) (Math.random() * 36) +1 ;
	// Fifth number
	int fifthBall = (int) (Math.random() * 36) +1 ;

	// Display the winning ticket.			
	System.out.println("Your lucky picks are:" + firstBall + "," + 
	secondBall + "," + thirdBall + "," + fourthBall + "," + fifthBall);
    }
}
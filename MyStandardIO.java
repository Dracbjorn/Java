/*
HEADER COMMENTS
*/

//import statements
import java.io.IOException;
import java.util.Scanner;

public class MyStandardIO {
	public static void main(String [] args) throws IOException {

		// Using scanner class to get user input
		Scanner scannerIn = new Scanner(System.in);

		// Ask for the users age
		System.out.print("Enter your age: ");
		byte usersAge = scannerIn.nextByte();

		// Get the users lattitude location
		System.out.print("Enter your location [lat]: ");
		float locLat = scannerIn.nextFloat();

		// Get the users longitude location
		System.out.print("Enter your location [long]: ");
		float locLong = scannerIn.nextFloat();

		// Ask how many stars are in the galaxy
		System.out.print("What is the aproximate number of stars in the Galaxy? ");
		long numOfStars = scannerIn.nextLong();

		// Ask the user what the max length of a short is
		System.out.print("What is the max length of a short variable? ");
		short maxShortLength = scannerIn.nextShort();

		// Ask if the user is stressed out
		System.out.print("Are you stressed out [True or False]? ");
		boolean stressedOut = scannerIn.nextBoolean();

		// Echo all user input back to them
		System.out.println("Your age is " + usersAge + ".");

		System.out.println("You are located at " + locLat + " lattitude by " + locLong + " longitude.");

		System.out.println("You think there are aproximately " + numOfStars + " stars in the Galaxy.");

		System.out.println("You think the max length of a short variable is " + maxShortLength + ".");

		if (stressedOut) { // Check if user is stressed out or not
			System.out.println("You are totally stressed out! Relax!");
		}
		else if (stressedOut) {
			System.out.println("You are calm as can be. Just Chillin.");
		}

	} // End of main
} // End of class
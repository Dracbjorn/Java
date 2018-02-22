import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class RolePlaya {

	public static void main(String [] args) throws IOException {
	
		// Declare player variables
		String characterName;

		// Define scanner class
		Scanner playaInput = new Scanner(System.in);

		// Get desired character name from user
		System.out.println("Hint: Character names cannot contain special characters or numbers.");
		System.out.println("They must also have no less than 3 characters and no more than 16 characters.\n");
		System.out.print("Please enter your characters name: ");
		characterName = playaInput.next();

		// Confirm the character name that was chosen
		System.out.println("The characters name you entered is " + characterName + ".");

		// Convert to lower case to check for validity
		characterName = characterName.toLowerCase();
		System.out.println("Checking validity of your characters name...");

		// If character name contains special characters or numbers it is invalid
		if (characterName.matches("[a-z]{3,16}"))
	    	System.out.println("The character name " + characterName + " is valid!");
	    else
	    	System.out.println("The character name " + characterName + " is NOT valid!");

	} // End of main
} // End of Class
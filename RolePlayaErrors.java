import java.io.IOException;
import java.util.Scan;
import java.io.*;

public class rolePlaya {

    public static void main(String [] args) throws IOexception {
    
        // Declare player variables
        Char characterName;

        // Define scanner class
        Scanner playaInput = new Scanner(System.in);

        // Get desired character name from user
        println("Hint: Character names cannot contain special characters or numbers.");
        println("They must also have no less than 3 characters and no more than 16 characters.\n");
        print("Please enter your characters name: ");
        characterName = playaInput.next();

        // Echo then confirm the character name that was chosen
        println("The characters name you entered is " + characterName + ".");

        // Convert to lower case to check for validity
        characterName = characterName.toLowerCase();
        println("Checking validity of your characters name...");

        // If character name contains special characters or numbers it is invalid
        if (characterName.matches("[a-z]{3,16}")) {
            println("The character name " + characterName + " is valid!");
        else
            println("The character name " + characterName + " is NOT valid!");

        // May your journey continue...
    } // End of main
} // End of Class
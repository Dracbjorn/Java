/* File: RolePlayaStats.java
 * Author: Travis "Kent" Graves
 * Date: 23-01-2015
 * Purpose: demonstrates the use of mathmatical operators
 */

// List imports
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class RolePlayaStats {

	public static void main(String [] args) throws IOException {
	
		// Declare player attributes and stat values
		int strengthValue;
		int dexterityValue;
		int intelligenceValue;
		int maxHealthValue;
		int maxManaValue;
		int chanceToDodgeValue;
		int statPoints = 200;
		int primarySpellCost = 33;
		double manaRemaining;

		// Define scanner class for user input
		Scanner playaInput = new Scanner(System.in);

		// Start character attribute assignment using 200 points
		System.out.println("You have 200 points to distribute between your characters Strength, Dexterity, and Intelligence.");
		System.out.println("Choose wisely!\n");

		// Get characters strength
		System.out.println("Enter your characters desired Strength.");
		System.out.println("Strength affects your overall Health. One strength equals ten health.");
		System.out.println("You have " + statPoints + " points remaining...\n");
		System.out.print("Enter Characters Strength [1-100]: ");
		strengthValue = playaInput.nextInt();

		// Check if value is negative
		if (strengthValue <= 0) {
			System.out.print("You cannot have negative attributes! Please start again.");
			System.exit(1);
		}
		else if (strengthValue > 100) {
			System.out.print("You cannot have more than 100 of an attribute! Please start again.");
			System.exit(1);
		}

		// Subtract points assigned to strength from stat points remaining
		statPoints = statPoints - strengthValue;

		// Get characters Dexterity
		System.out.println("\nEnter your characters desired Dexterity.");
		System.out.println("Dexterity affects your overall chance to dodge attacks. Ten dexterity equals 1% chance to dodge.");
		System.out.println("You have " + statPoints + " points remaining...\n");
		System.out.print("Enter Characters Dexterity [1-100]: ");
		dexterityValue = playaInput.nextInt();

		// Check if value is negative
		if (dexterityValue <= 0) {
			System.out.print("You cannot have negative attributes! Please start again.");
			System.exit(1);
		}
		else if (dexterityValue > 100) {
			System.out.print("You cannot have more than 100 of an attribute! Please start again.");
			System.exit(1);
		}

		// Subtract points assigned to dexterity from stat points remaining
		statPoints = statPoints - dexterityValue;

		// Get characters Intelligence
		System.out.println("\nEnter your characters desired Intelligence.");
		System.out.println("Intelligence affects your overall mana pool. One intelligence equals 20 mana.");
		System.out.println("You have " + statPoints + " points remaining...\n");
		System.out.print("Enter Characters Intelligence [1-100]: ");
		intelligenceValue = playaInput.nextInt();

		// Check if value is negative
		if (intelligenceValue <= 0) {
			System.out.print("You cannot have negative attributes! Please start again.");
			System.exit(1);
		}
		else if (intelligenceValue > 100) {
			System.out.print("You cannot have more than 100 of an attribute! Please start again.");
			System.exit(1);
		}

		// Subtract points assigned to intelligence from stat points remaining
		statPoints = statPoints - intelligenceValue;

		// Echo stats that were assigned to the player
		System.out.println("\nYou have assigned your character the following stats:");
		System.out.println("Strength = " + strengthValue);
		System.out.println("Dexterity = " + dexterityValue);
		System.out.println("Intelligence = " + intelligenceValue);

		// Check if player used too many stat points
		if (statPoints > 0) {
			System.out.println("\nYou have " + statPoints + " leftover. You can assign these later.");
			System.exit(1);
		}
		else if (statPoints < 0) {
			System.out.println("\nYou used too many points! Please start again.");
			System.exit(1);
		}
		else {
			System.out.println("\nPlayer attributes have been assigned using all 200 points.");
		}

		// Calculate the amount of health based on strength 1:10 ratio
		maxHealthValue = strengthValue * 10;
		System.out.println("\nYour character will have " + maxHealthValue + " maximum health.");

		// Calculate the amount of Dodge chance based on Dexterity 10:1 ratio
		chanceToDodgeValue = dexterityValue / 10;
		System.out.println("Your character will have " + chanceToDodgeValue + "% chance to dodge attacks.");

		// Calculate the amount of mana the character will have at a 1:20 ratio
		maxManaValue = intelligenceValue * 20;
		System.out.println("Your character will have " + maxManaValue + " maximum mana.");

		// Use modulus to determine mana remaining because I can't think of any practical way to use it...
		System.out.println("\nYour primary attack cost " + primarySpellCost + " mana.");
		System.out.println("You attack until you have insufficient mana to cast again!");

		// calculate mana remaining using max mana modulus spell cost
		manaRemaining = maxManaValue % primarySpellCost;

		// Echo mana remaining to player
		System.out.println("You have " + manaRemaining + " mana remaining.");
		System.out.println("Find a mana potion to regain your mana!");

		// Can't think of a way to practially use bitwise | or & in this scenario so here it goes
		// In this crazy binary RolePlaying world melee damage is dealt by bitwise &

		// Attack Value
 		int meleeAttack1 = 0b100000101111;      
        System.out.println("\nYou attack for: " + meleeAttack1);
        
        // Parry Value
        int meleeParry1 =  0b111111110011;
        System.out.println("Your opponents parry value is: " + meleeParry1);

        // perform bitwise & on Attack & Parry
        int meleeDmgDealt = meleeAttack1 & meleeParry1;
        System.out.println("You deal " + meleeDmgDealt + " damage!\n");  

        // And spell damage is dealt using bitwise | 

        // Spell attack value
		int spellAttack1 = 0b110001001111;      
        System.out.println("You cast a spell for: " + spellAttack1);
        
        // Opponent spell block value
        int spellBlock1 =  0b101101111011;
        System.out.println("Your opponents spell block value is: " + spellBlock1);

        // perform bitwise | on spell attack | spell block
        int spellDmgDealt = spellAttack1 | spellBlock1;
        System.out.println("You deal " + spellDmgDealt + " spell damage!");

        // May this journey continue...
	} // End of main
} // End of Class RolePlayaStats
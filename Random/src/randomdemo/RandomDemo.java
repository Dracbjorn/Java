/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomdemo;

import java.util.Random;

/**
 *
 * @author Travis "Kent" Graves
 */
public class RandomDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {

        // Display a Welcome note

        System.out.println("Welcome to the Random Class Demo");

        // Variables to hold values

        int randInt = 0;

        boolean randBoolean = false;

        double randDouble = 0.0;

        // Construct a Random class instance

        Random randomGen = new Random();

        // Generate a random Int

        // range will be from MIN to MAX Java int

        randInt = randomGen.nextInt();

        System.out.println("Random int: " + randInt);

        // Generate a random Int 

        // but limit it between 0 and 35

        randInt = randomGen.nextInt(36);

        System.out.println("Random int: " + randInt);

        // Generate a random boolean

        randBoolean = randomGen.nextBoolean();

        System.out.println("Random boolean: " + randBoolean);

        // Generate a random Double

        randDouble = randomGen.nextDouble();

        System.out.println("Random double: " + randDouble);
    }
    
}

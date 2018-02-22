/*
 * Create a Java class named MyRandomDemo using your favorite text editor. Be 
 * sure you name the file “MyRandomDemo.java”. Add code to the file in the 
 * main() method that will provide functionality simulate the Maryland lottery 
 * Mega-Millions game by generating five “pseudorandom” numbers between the 
 * values of 1 and 75 and one “pseudorandom” number between the values of 1 and
 * 15. Be sure to use Java’s Random class for this exercise.
 */

package myrandomdemo;

import java.util.Random;

/**
 *
 * @author Travis "Kent" Graves
 */
public class MyRandomDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {
        // Declare variables
        int lotteryNum;
        
        // Declare Scanner class randoGen
        Random randoGen = new Random();
        
        System.out.println("The Mega-Millions numbers are...");
        
        for (int i = 0; i < 10000; i++) {
            
            // 5 Random numbers between 1 - 75
            lotteryNum = randoGen.nextInt(75) +1;
            System.out.println(lotteryNum);
            
//            switch(lotteryNum) {
//                case (0): case (76):
//                    System.out.println("Detected! " + lotteryNum);
//            }
        }
        
        // Random number between 1 - 15
        lotteryNum = randoGen.nextInt(15) +1;
        System.out.println(lotteryNum);
        
    }
    
}

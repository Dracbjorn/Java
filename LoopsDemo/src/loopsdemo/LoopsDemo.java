/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loopsdemo;

 // Import statements

import java.util.Scanner;
/**
 *
 * @author Travis "Kent" Graves
 */
public class LoopsDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {
       
        int maxLoop = 0;

        System.out.println("Welcome to the Loops Demo");

        // Scanner class

        Scanner scannerIn = new Scanner (System.in);

        // Prompt use for how many random integers to generator

        System.out.println("How many integers to generate?");

        maxLoop = scannerIn.nextInt();

        // While Loop

        int cnt=0;

        int randInt = 0;

        while (cnt < maxLoop) {

         randInt = (int) (Math.random() * 10);

         System.out.println("While loop: Random value is " + randInt);

         // Increment counter

         cnt++;

         }

        // Do while loop

        // Same logic but use the do while loop

        // Reset the counter

        cnt = 0;

        do {

         randInt = (int) (Math.random() * 10);

         System.out.println("do-while: Random value is " + randInt);

         // Increment counter

         cnt++;

         } while (cnt < maxLoop);

        // For loop

        for (int i=0; i<maxLoop; i++) {

         randInt = (int) (Math.random() * 10);

         System.out.println("for loop: Random value is " + randInt); 

        }

    }
    
}

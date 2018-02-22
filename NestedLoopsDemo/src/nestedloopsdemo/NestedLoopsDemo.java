/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nestedloopsdemo;

/**
 *
 * @author Travis "Kent" Graves
 */
    public class NestedLoopsDemo {

        public static void main(String[] args) { 

        // Define Number of Rows and Columns as Constants

        final int MAXROWS = 10;

        final int MAXCOLS = 10;

        System.out.println("Welcome to the NestedLoops Demo");

        // While Loop

        int rowCnt = 0;

        int colCnt = 0;

        // Print the Header

        System.out.println("");

        System.out.println("While Loop Multiplication Table");

        System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");

        while (rowCnt <= MAXROWS) {

         // Print the Left column

         // Reset colCnt

         colCnt = 0;

         System.out.print(rowCnt + "\t");

         while (colCnt <= MAXCOLS) {

         System.out.print(colCnt*rowCnt + "\t");

         colCnt++;

         }

         System.out.print("\n");

         rowCnt++;

         }

        // Perform the same with a do-while

        // Reset values

        rowCnt=0;

        colCnt=0;

        System.out.println("");

        System.out.println("Do-While Loop Multiplication Table");

        System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");

        do {

         // Print the Left column

         // Reset colCnt

         colCnt = 0; 

         System.out.print(rowCnt + "\t");

         do {

         System.out.print(colCnt*rowCnt + "\t"); 

         colCnt++;

         } while (colCnt <=MAXCOLS);



         System.out.print("\n");

         rowCnt++;

         } while (rowCnt <=MAXROWS);

        // Perform the same with for loop

        // Reset values

        rowCnt=0;

        colCnt=0;

        System.out.println("");

        System.out.println("For Loop Multiplication Table");

        System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");

        for (rowCnt=0; rowCnt <= MAXROWS; rowCnt++) {

         // Print the Left column

         System.out.print(rowCnt + "\t");

         for (colCnt=0; colCnt<= MAXCOLS; colCnt++) {

         System.out.print(colCnt*rowCnt + "\t"); 

         }

         System.out.print("\n"); 

         }



        System.out.println("");

        System.out.println("For Loop Nested Summation");

        int productSum = 0; 

        // Finally we use nested loops

        // And sum a variable to print the sum of products

        for (rowCnt=0; rowCnt <= MAXROWS; rowCnt++) { 

         for (colCnt=0; colCnt<= MAXCOLS; colCnt++) {
            productSum += rowCnt*colCnt;
         }

         System.out.print("After " + rowCnt + 

         " Iterations, the sum is " + productSum + "\n"); 

        }

    }

}
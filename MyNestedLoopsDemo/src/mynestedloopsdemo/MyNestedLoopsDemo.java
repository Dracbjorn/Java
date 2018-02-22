/*
 * Create a Java class named MyNestedLoopsDemo using your favorite text editor.
 * Be sure you name the file “MyNestedLoopsDemo.java”. Create an application
 * that sums the products of the multiplication table from the values of 11 to 
 * 99. (Hint, this is similar to what we did for multiplication tables with the 
 * values of 0 to 10). Print the final sum of all of the products along with 
 * the average of the product values.
 */

package mynestedloopsdemo;

/**
 *
 * @author Travis "Kent" Graves
 */
public class MyNestedLoopsDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {

        final int MAXRANGE = 99;

        // While Loop

        int minRange = 11;
        int counter = 11;
        int totalProduct = 0;
        
        for (; minRange <= MAXRANGE;) {

            for (; counter <= MAXRANGE;) {
                totalProduct = minRange * counter + totalProduct;
                System.out.println(minRange + " x " + counter + " = " + (minRange * counter));
                counter++;
            }
            
            System.out.println("Total sum of all the products for " + minRange + " is: " + totalProduct);
            counter = 11;
            minRange++;
        }
       
        
    }
    
}

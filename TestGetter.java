// Import List

import java.util.*;

public class TestGetter {

  public static void main (String [] args){

   int a;
   double b;

       // Declare scanner class stdin for user input
   Scanner stdin = new Scanner(System.in);


   System.out.print("Type the value of a (integer): ");
   a = stdin.nextInt();

   System.out.print("Type the value of b (double): ");
   b = stdin.nextDouble(); // Also inserted space after "="

   System.out.println("a is: " + a);
   System.out.println("b is: " + b);
   } // End of Main
} // End of Class TestGetter
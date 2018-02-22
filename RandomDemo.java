import java.lang.*;

public class RandomDemo {

   public static void main(String[] args) {

      // get two random double numbers
      double x = Math.random();
      double y = Math.random();

      // print the numbers and print the higher one
      System.out.println("Random number 1:" + x);
      System.out.println("Random number 2:" + y);
      System.out.println("Highest number:" + Math.max(x, y));

   }
}
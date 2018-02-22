import java.lang.*;

public class CosDemo {

   public static void main(String[] args) {

      // get two double numbers
      double x = 45.0;
      double y = 180.0;

      // convert them to radians
      x = Math.toRadians(x);
      y = Math.toRadians(y);

      // print their cosine
      System.out.println("Math.cos(" + x + ")=" + Math.cos(x));
      System.out.println("Math.cos(" + y + ")=" + Math.cos(y));


   }
}
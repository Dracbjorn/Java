import java.lang.*;

public class SinDemo {

   public static void main(String[] args) {

      // get two double numbers numbers
      double x = 45;
      double y = -180;

      // convert them to radians
      x = Math.toRadians(x);
      y = Math.toRadians(y);

      // print the trigonometric sine for these doubles
      System.out.println("Math.sin(" + x + ")=" + Math.sin(x));
      System.out.println("Math.sin(" + y + ")=" + Math.sin(y));

   }
}
import java.lang.*;

public class TanhDemo {

   public static void main(String[] args) {

      // get two double numbers numbers
      double x = 45;
      double y = -180;

      // convert them in degrees
      x = Math.toDegrees(x);
      y = Math.toDegrees(y);

      // print the hyperbolic tangent of these doubles
      System.out.println("Math.tanh(" + x + ")=" + Math.tanh(x));
      System.out.println("Math.tanh(" + y + ")=" + Math.tanh(y));

   }
}
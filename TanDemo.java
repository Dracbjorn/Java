import java.lang.*;

public class TanDemo {

   public static void main(String[] args) {

      // get two double numbers numbers
      double x = 45;
      double y = -180;

      // convert them in radians
      x = Math.toRadians(x);
      y = Math.toRadians(y);

      // print the tangent of these doubles
      System.out.println("Math.tan(" + x + ")=" + Math.tan(x));
      System.out.println("Math.tan(" + y + ")=" + Math.tan(y));

   }
}
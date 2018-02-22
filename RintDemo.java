import java.lang.*;

public class RintDemo {

   public static void main(String[] args) {

      // get two double numbers
      double x = 1654.9874;
      double y = -9765.134;

      // find the closest integers for these double numbers
      System.out.println("Math.rint(" + x + ")=" + Math.rint(x));
      System.out.println("Math.rint(" + y + ")=" + Math.rint(y));

   }
}
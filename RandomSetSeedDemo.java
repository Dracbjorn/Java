import java.util.*;

public class RandomSetSeedDemo {
   public static void main( String args[] ){
      // create random object
      Random randomno = new Random();
      
      // setting seed
      randomno.setSeed(20);
      
      // value after setting seed
      System.out.println("Object after seed: " + randomno.nextInt());
   }    
}
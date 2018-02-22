import java.util.*;

public class RandomNextBoolDemo {
   public static void main( String args[] ){
      // create random object
      Random randomno = new Random();
      
      // get next next boolean value 
      boolean value = randomno.nextBoolean();
      
      // check the value  
      System.out.println("Value is: " + value);
   }     
}
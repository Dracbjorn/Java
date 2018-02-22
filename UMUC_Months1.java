/* File: UMUC_Months1.java
 * Author: InstructorX 
 * Date: dd-mm-yyyy 
 * Purpose: demonstrates the use of a simple if statement 
 */

public class UMUC_Months1 {
   public static void main(String[] args) {
      int month = 7, days = 0;

      if (month == 1)
         days = 31;
      if (month == 2) 
         days = 28; 
      if (month == 3)
         days = 31;
      if (month == 4)
         days = 30;
      if (month == 5)
         days = 31;
      if (month == 6)
         days = 30;
      if (month == 7)
         days = 31;
      if (month == 8)
         days = 31;
      if (month == 9)
         days = 30;
      if (month == 10)
         days = 31;
      if (month == 11) 
         days = 30;
      if (month == 12) 
         days = 31; 
 
      System.out.println("days = " + days);
   } // end main
} // end class
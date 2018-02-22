/* File: UMUC_Months2.java 
 * Author: InstructorX 
 * Date: dd-mm-yyyy 
 * Purpose: demonstrates the use of a simple if statement with 
 * multiple boolean expressions 
 */
 
public class UMUC_Months2 { 
   public static void main(String[] args) { 
      int month = 7, days = 0; 
     
      if ((month == 1) || 
          (month == 3) || 
          (month == 5) || 
          (month == 7) || 
          (month == 8) || 
          (month == 10) || 
          (month == 12)) 
          days = 31; 
      if ((month == 4) || 
          (month == 6) || 
          (month == 9) || 
          (month == 11)) 
          days = 30; 
      if (month == 2) 
          days = 28; 
         
      System.out.println("days = " + days); 
   } // end main
} // end class

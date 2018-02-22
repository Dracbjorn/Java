/* File: HomeWorkOnePart2.java
 * Author: G. Niles
 * Date: 2015-01-24
 * Class: CMIS 141   Section 4020  
 * Purpose: A program that prompts a user to enter demographic information including
 * year of birth (values 1900-2014), month of birth (values 1-12), day (value of 1-31) of birth,
 * latitude and longitude of home address current grade point average (GPA)
 * 	
*/
 
// Import each required Java class
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWorkOnePart2
{  //1

  final String DEGREE  = "\u00b0";
      
    public static void main (String[] args) 
    {  //2
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        double homeLatitude = 0.0;
        double homeLongitude = 0.0;
        double currentGPA = 0.0;
        String birthMonthString = " ";
        

        // Use the Scanner class to read Standard Input
        Scanner stdin = new Scanner(System.in);

    // Display a welcome note
    System.out.println (" CMIS 141   Section 4020 homework assignment 1 part 2");
 
        // Prompt the user to enter the year of birth
        System.out.println ("Enter the year of birth");
        // the nextInt() method scans the next int value
        birthYear = stdin.nextInt();

        if ((birthYear < 1900) || (birthYear > 2014))  {  //3
              System.out.println ("invalid year " + birthYear +" entered program ends");
             System.exit(0);
         }  //3    

        // Prompt the user to enter the month of birth
        System.out.println ("Enter the month of birth");
        // the nextInt() method scans the next int value
        birthMonth = stdin.nextInt();

        if ((birthMonth < 1) || (birthMonth > 12))  {  //4
              System.out.println ("invalid month " + birthMonth +" entered program ends");
             System.exit(0);
         }  //4   

         // Prompt the user to enter the day of birth
        System.out.println("Enter the day of birth");
         birthDay = stdin.nextInt();
         if ((birthDay < 1) || (birthDay > 31))  {  //5 
              System.out.println ("invalid day " + birthDay +" entered program ends");
              System.exit(0);
         } //5   

      /* Echo the input values
        System.out.println ("The year of birth: " + birthYear);
        System.out.println ("The month of birth:  " + birthMonth);
        System.out.println ("The  day of birth: " + birthDay);
 */

        switch (birthMonth) {  //6
            case 1:  birthMonthString = "January";
                     break;
            case 2:  birthMonthString = "February";
                     break;
            case 3:  birthMonthString = "March";
                     break;            
            case 4:  birthMonthString = "April";
                     break;   
            case 5:  birthMonthString = "May";
                     break;
            case 6:  birthMonthString = "June";
                     break;
            case 7:  birthMonthString = "July";
                     break;
            case 8:  birthMonthString = "August";
                     break;
            case 9:  birthMonthString = "September";
                     break;
            case 10: birthMonthString = "October";
                     break;
            case 11: birthMonthString = "November";
                     break;
            case 12: birthMonthString = "December";
                     break;
            default: birthMonthString = "Invalid month";
                     break;
        }  //6
  //      System.out.println("Birthday: " + birthMonthString + " " + birthDay +", " + birthYear);



        // Prompt the user to enter the current homeLatitude
        System.out.println ("Enter the current homeLatitude");
        // the nexDoublet() method scans the next int value
        homeLatitude = stdin.nextDouble();
 
        // Prompt the user to enter the current homeLongitude
        System.out.println ("Enter the current homeLongitude");
        // the nexDoublet() method scans the next int value
        homeLongitude = stdin.nextDouble();

     
        // Prompt the user to enter the current GPA
        System.out.println ("Enter the current GPA");
        // the nexDoublet() method scans the next int value
        currentGPA = stdin.nextDouble();

         if ((currentGPA < 0.0) || (currentGPA > 4.0))  {  //7 
              System.out.println ("invalid GPA " + currentGPA +" entered program ends");
              System.exit(0);
         } //7   
         else {  //8
                System.out.println ("Current GPA: " +  currentGPA);
         }  //8 
       
 System.out.println ("******* Thank you for completing our survey **********************************");
 System.out.println ("You have entered the following data:");
 System.out.println ("Birthday: " + birthMonthString + " " + birthDay +", " + birthYear);
 System.out.println ("Address: Latitude " + homeLatitude + ","+ "Longitude" + homeLongitude );
 System.out.println ("Current GPA: " +  currentGPA);
/* */

    }  //2 end method  


 
}  //1 end class ArithmeticDemo
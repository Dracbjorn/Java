/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Travis "Kent" Graves
 */
public class Titanic {
  
  // Initiate variables
  
  final public int COL = 6;       // Constant variable for number of fields in text file
  public String[][] titanicInfo;  // String to store the text info into for manipulation  
  
  // Default Titanic constructor
  public Titanic() {
  } // End default Titanic constructor
  
  public Titanic(String[] titanicDataRaw) {
    setInfo(titanicDataRaw);
  }
  
  private void setInfo(String[] titanicDataRaw) {
    
    // Assign number of rows to array
    this.titanicInfo = new String[COL][titanicDataRaw.length];
    
    // Store Titanic information in a Multi-Dimenstional array
    // Loop to assign each line of the array into the 2D array
    for (int i=0;i<titanicDataRaw.length; i++) {
      
      // Split the line into an array of 5 parts tab delimeted
      String[] parts = titanicDataRaw[i].split("\\t");
      
      for (int j=0;j<parts.length;j++) {

        // Assign each part to the 2D array
        // Column 1 = Passenger class (1,2,3)       byte/int
        // Column 2 = Survived (1=yes, 0=no)        byte/int
        // Column 3 = Passenger name                String  
        // Column 4 = male or female                String
        // Column 5 = Age (some values are blank)   byte/int
        // Column 6 = Fare (some values are blank)  double
        this.titanicInfo[j][i] = parts[j];
        
      } // End for loop j

    } // End for loop i
    
  } // End setInfo method
  
  public String[][] getInfo() {
    return this.titanicInfo;
  } // End getInfo method
  
  public void printAllInfo(String[][] titanicInfo) {
    
    System.out.print( "Class\tDeceased\tName\tSex\tAge\tTicket Cost\n" );
    
    for (int i=0;i<titanicInfo[0].length;i++) {
      
      for (int j=0;j<this.COL;j++) {
        
        System.out.print(titanicInfo[j][i] + "\t");
        
      } // End for loop j
      
      System.out.println( "" );
      
    } // End for loop i
    
  } // End printAllInfo method
  
  public String[] getOptions() {
    
    String[] titanicOptions = new String[13];
    
    titanicOptions[0] = "1) Total number of passengers on the Titanic";
    titanicOptions[1] = "2) Total number of passengers who perished on the Titanic";
    titanicOptions[2] = "3) Total number of Passengers who survived the sinking of the Titanic";
    titanicOptions[3] = "4) Number of passengers who survived the sinking of the Titanic as a function of the passenger class (e.g. 1,2,3)";
    titanicOptions[4] = "5) Number of passengers who survived the sinking of the Titanic as a function of the passenger gender (e.g., male, female)";
    titanicOptions[5] = "6) A list of the names of passengers who paid greater than $200 for their tickets";
    titanicOptions[6] = "7) A list of the names of passengers who were less than 10 years old who survived the sinking of the Titanic";
    titanicOptions[7] = "8) A list of the names of passengers who were less than 10 years old who perished on the Titanic";
    titanicOptions[8] = "9) The count of the number of passengers as a function of the first letter of their last name. (e.g., A: 13, B:33 …)";
    titanicOptions[9] = "10) Number of males who survived as a function of the passenger class";
    titanicOptions[10] = "11) Number of females who survived as a function of the passenger class";
    titanicOptions[11] = "12) Average cost of a passenger ticket";
    titanicOptions[12] = "Q) Exit";
      
    return titanicOptions;
  } // End method getOptions
  
  public boolean setOptions(String option) throws InterruptedException {
    
    switch (option) {
      
      case "1":
        getTotalPassengers();
        Thread.sleep(2000);
        return false;
      case "2":
        // Get total number of passengers who died
        getDeceased();
        Thread.sleep(2000);
        return false;
      case "3":
        // Get total number of survivers
        getSurvivors();
        Thread.sleep(2000);
        return false;
      case "4":
        // The passenger class of survivers
        getSurvivorsClass();
        Thread.sleep(2000);
        return false;
      case "5":
        // The sex of survivers
        getSexOfSurvivors();
        Thread.sleep(2000);
        return false;
      case "6":
        // Get names of passengers with >$200 tickets
        getPassengerTicketPrice();
        Thread.sleep(2000);
        return false;
      case "7":
        // Get names of passengers who are less than 10 who survived
        getSurvivorsLessThanTen();
        Thread.sleep(2000);
        return false;
      case "8":
        // Get names of passengers who are less than 10 who died
        getDeceasedLessThanTen();
        Thread.sleep(2000);
        return false;
      case "9":
        // Number of passengers with a last name starting with the character provided
        getLastName();
        Thread.sleep(2000);
        return false;
      case "10":
        // The class of the male passengers who survived
        getClassOfSurvivingMales();
        Thread.sleep(2000);
        return false;
      case "11":
        // The class of the female passengers who survived
        getClassOfSurvivingFemales();
        Thread.sleep(2000);
        return false;
      case "12":
        // Average cost of a ticket
        getAverageTicketPrice();
        Thread.sleep(2000);
        return false;
      case "q":       
        return true;
      default:
        System.out.println( "\nInvalid option!\n" );
        Thread.sleep(2000);
        return false;
        
    } // End switch
    
  } // End method doFunction 
  
  private void getTotalPassengers() { // print total number of passengers on the manifest
    
    int totalPassengers = this.titanicInfo[0].length;
    
    System.out.println( "The total number of passengers is: " + totalPassengers );
    
  }
  
  private void getDeceased() { // print total number of passengers that died
    
    int totalDeceased = 0;
    for (int i=0;i<this.titanicInfo[1].length;i++) {
      if ((Integer.parseInt(titanicInfo[1][i])) == 0) {
        totalDeceased++;
      }
    }
    
    System.out.println( "The total number of passengers who died is: " + totalDeceased );
    
  }
  
  private void getSurvivors() {
    
    int totalSurvivors = 0;
    for (int i=0;i<this.titanicInfo[1].length;i++) {
      if ((Integer.parseInt(titanicInfo[1][i])) == 1) {
        totalSurvivors++;
      }
    }
    
    System.out.println( "The total number of passengers who survived is: " + totalSurvivors );
    
  }
  
  private void getSurvivorsClass() {
    
    int firstClass = 0;
    int secondClass = 0;
    int thirdClass = 0;
    
    for (int i=0;i<this.titanicInfo[1].length;i++) {
      if ((Integer.parseInt(titanicInfo[1][i])) == 1) {
        switch (Integer.parseInt(titanicInfo[0][i])) {
          case 1:
            firstClass++;
            break;
          case 2:
            secondClass++;
            break;
          case 3:
            thirdClass++;
            break;
          default:
            System.out.println( titanicInfo[0][i] );
            System.out.println( "Invalid Class on line " + i + "!" );
            break;
        }
      }
    }
    
    System.out.println("Total number of 1st class survivors: " + firstClass);
    System.out.println("Total number of 2nd class survivors: " + secondClass);
    System.out.println("Total number of 3rd class survivors: " + thirdClass);
    
  }
  
  private void getSexOfSurvivors() {
    
    int sexMale = 0;
    int sexFemale = 0;
    
    for (int i=0;i<this.titanicInfo[1].length;i++) {
      if ((Integer.parseInt(titanicInfo[1][i])) == 1) {
        switch (titanicInfo[3][i].toLowerCase()) {
          case "male":
            sexMale++;
            break;
          case "female":
            sexFemale++;
            break;
          default:
            System.out.println( "Invalid sex on line " + i + "!" + titanicInfo[3][i] );
            break;
        }
      }
    }
    
    System.out.println("Total number of male survivors: " + sexMale);
    System.out.println("Total number of female survivors: " + sexFemale);
    
  }
  
  private void getPassengerTicketPrice() {
    
    int TwoHundredOrMore = 0;
    
    for (int i=0;i<this.titanicInfo[5].length;i++) {
      try {
        if ((Double.parseDouble(titanicInfo[5][i])) > 200) {
          System.out.println( titanicInfo[2][i] );
          TwoHundredOrMore++;
        }
      }
      catch (NullPointerException err) {
      }
    }
    System.out.println("\nTotal number of passengers who paid more than $200.00 for their ticket: " 
        + TwoHundredOrMore);
    
  }
  
  private void getSurvivorsLessThanTen() {
    
    int lessThanTen = 0;
    
    for (int i=0;i<this.titanicInfo[1].length;i++) {
      if ((Integer.parseInt(titanicInfo[1][i])) == 1) {
          try {
            double age = Double.parseDouble(titanicInfo[4][i]);
            if ( Math.round(age) < 10.0) {
              System.out.println( titanicInfo[2][i] );
              lessThanTen++;
            }
          }
          catch (NumberFormatException err) {
          }
      }
    }
    
    System.out.println( "\nTotal number of survivors less than 10 years old: " + lessThanTen );
  }
  
  private void getDeceasedLessThanTen() {
    
    int greaterThanTen = 0;
    
    for (int i=0;i<this.titanicInfo[1].length;i++) {
      if ((Integer.parseInt(titanicInfo[1][i])) == 0) {
        try {
          double age = Double.parseDouble(titanicInfo[4][i]);
          if ( Math.round(age) < 10.0) {
            System.out.println( titanicInfo[2][i] );
            greaterThanTen++;
          }
        }
        catch (NumberFormatException err) {
        }
      }
    }
    
    System.out.println( "\nTotal number of deceased less than 10 years old: " + greaterThanTen );
    
  }
  
  private void getLastName() {
    
    Scanner userInput = new Scanner(System.in);
    System.out.print( "Enter the first character of the lastname: " );
    String lastName = userInput.next().toLowerCase();
    System.out.println();
    
    if (lastName.matches("[A-Za-z]{1}")) {
      
      char firstChar = lastName.charAt(0);
      
      boolean foundName = false;
      for (int i=0;i<this.titanicInfo[2].length;i++) {
        if (titanicInfo[2][i].toLowerCase().charAt(0) == firstChar) {
          foundName = true;
          System.out.println( titanicInfo[2][i] );
        }
      }
      
      if (!foundName) {
        System.out.println( "No last name exists that begins with " + firstChar );
      }
      
    } else {
      System.out.println( "Invalid input! Enter one letter only." );
    }
    
  }
  
  private void getClassOfSurvivingMales() {
    
    int firstClass = 0;
    int secondClass = 0;
    int thirdClass = 0;
    
    for (int i=0;i<this.titanicInfo[1].length;i++) {
      if ((Integer.parseInt(titanicInfo[1][i])) == 1) {
        switch (titanicInfo[3][i].toLowerCase()) {
          case "male":
            switch (Integer.parseInt(titanicInfo[0][i])) {
              case 1:
                firstClass++;
                break;
              case 2:
                secondClass++;
                break;
              case 3:
                thirdClass++;
                break;
              default:
                System.out.println( "Invalid Class on line " + i + "!" + titanicInfo[0][i] );
                break;
            }
            break;
          case "female":          
            break;
          default:
            System.out.println( "Invalid sex on line " + i + "!" + titanicInfo[3][i] );
            break;
        }        
      }
    }
    
    System.out.println("Total number of male 1st class survivors: " + firstClass);
    System.out.println("Total number of male 2nd class survivors: " + secondClass);
    System.out.println("Total number of male 3rd class survivors: " + thirdClass);
    
  }
  
  private void getClassOfSurvivingFemales() {
    int firstClass = 0;
    int secondClass = 0;
    int thirdClass = 0;
    
    for (int i=0;i<this.titanicInfo[1].length;i++) {
      if ((Integer.parseInt(titanicInfo[1][i])) == 1) {
        switch (titanicInfo[3][i].toLowerCase()) {
          case "female":
            switch (Integer.parseInt(titanicInfo[0][i])) {
              case 1:
                firstClass++;
                break;
              case 2:
                secondClass++;
                break;
              case 3:
                thirdClass++;
                break;
              default:
                System.out.println( "Invalid Class on line " + i + "!" + titanicInfo[0][i] );
                break;
            }
            break;
          case "male":          
            break;
          default:
            System.out.println( "Invalid sex on line " + i + "!" + titanicInfo[3][i] );
            break;
        }        
      }
    }
    
    System.out.println("Total number of female 1st class survivors: " + firstClass);
    System.out.println("Total number of female 2nd class survivors: " + secondClass);
    System.out.println("Total number of female 3rd class survivors: " + thirdClass);
  }
  
  private void getAverageTicketPrice() {
    
    double totalPrice = 0;
    
    for (int i=0;i<this.titanicInfo[5].length;i++) {
      try {
        totalPrice = (totalPrice + Double.parseDouble(titanicInfo[5][i]));
      }
      catch (NullPointerException err) {
      }
    }
    
    double averagePrice = (totalPrice / titanicInfo[5].length);
    DecimalFormat df = new DecimalFormat("#.00");
    String priceFormatted = df.format(averagePrice);
    
    System.out.println("\nAverage cost of a passengers ticket: $" + priceFormatted);
    
  }
    
} // End class Titanic

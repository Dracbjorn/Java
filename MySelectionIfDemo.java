/*
Create a file named MySelectionIfDemo.java. Create an application that will return the total tax due
based on an individual’s income. The following logic should be applied. If the income is less than $20,000
the tax is calculated by income * 0.10. If the income is less than $40,000 the tax is calculated by income
* 0.12. If the income is less than $60,000 the tax is calculated by income * 0.14. For all other incomes
greater than or equal to $60,000 the tax is calculated by income * 0.15. If an income of less than 0 is
entered the program should exit with a friendly message informing the user income must be greater
than 0. After calculating the tax, the tax along with the user’s income should be printed to Standard
output. Be sure your modified code compiles and runs without issue. Test your application by making
sure each possible input range yields the correct output, including values less than 0. 
*/

// List Imports
import java.io.IOException;

public class MySelectionIfDemo {
  public static void main (String [] args) throws IOException {
    char taxClass = 'c';
    float taxRate;
    float salary = 45000.00f;
    float taxDue;

    switch(taxClass) {
      case 'a':
        taxRate = .10f;
        break;
      case 'b':
        taxRate = .075f;
        break;
      case 'c':
        taxRate = .055f;
        break;
      case 'd':
        taxRate = .0375f;
      default:
        taxRate = .015f;
    }

    taxDue = salary * taxRate;
    System.out.println("You owe " + taxDue + " in taxes.");
  }
}
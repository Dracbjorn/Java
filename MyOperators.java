/**
 * Possible Operators Lab Solution.
 */
public class MyOperators 
{	
    public static void main(String[] args) 
     { 
        System.out.println("Math Operators Exercise");
        
        // Place holders to store calculation
        int var1 = 4;
        int var2 = 2;
        double var3 = 10.0;
        double var4 = 20.0;
        double results = 0.0;
        int intresults = 0;

        // Addition (+)
        results =var3 + var4;
        System.out.println("var3 + var4 = " + results);
        
        //  Subtraction (-)
        results = var4 - var3;
        System.out.println("var4 - var3 = " + results);
       

	// Multiplication (*) 
        intresults = var1 * var2;
        System.out.println("var1 * var2 = " + intresults);
        

	// Division (/)
        results = var1 / var2; // Integer division
        System.out.println("var1 / var2 = " + results);
       
	// Modulus (%)
        intresults = var2 % var1;
        System.out.println("var2 % var1 = " + intresults);
        
         
 	// Precedence groupings 
       System.out.println("\n");   // New Line to separate Output
       System.out.println("*****Precedence Groupings*****");     
       results = var1 / (var3 + var3) * var4 + var2 % var1;
       System.out.println("var1 / (var3 + var3) * var4 + var2 % var1 = " + results); 
       System.out.println("*****************************");  
        System.out.println("\n"); 

       // Unary Operators       
       // Variables for demonstrating Unary Operators
        System.out.println("*****Unary Operators*****");  
        int varA = 20;
        int varB = 100;
       

        // Post Increment (++)
        intresults = varA++;      
        System.out.println("varA++ = " + intresults);
       
       // Pre increment (++)
       intresults = ++varB;
       System.out.println("++varB = " + intresults);

       // Post decrement (--)
       intresults = varA--;
       System.out.println("varA-- = " + intresults);

       // Pre decrement (--)
       intresults = --varB;
       System.out.println("--varB = " + intresults);

       // Not Operator (!)
       // This should be false since 20 < 100
       boolean flag = (varA >= varB);
       System.out.println("(varA >= varB) = " + flag);
       // This should be true since ! inverts the boolean value
       flag = !(varA >= varB);
       System.out.println("!(varA >= varB) = " + flag);
       System.out.println("*****************************");  
       System.out.println("\n"); 

	// Equality Operators
        // Equality (==)       
       System.out.println("*****Equality Operators*****");  
       flag = (var1 == var2);
       System.out.println("(var1 == var2) = " + flag);
       
        // Not Equal (!=)       
       flag = (var1 != var2);
       System.out.println("(var1 != var2) = " + flag);
       
        // Greater than (>)
        flag = (var1 > var2);
       System.out.println("(var1 > var2) = " + flag);
            
        // Greater than or equal to (>=)
       flag = (var1 >= var2);
       System.out.println("(var1 >= var2) = " + flag);     
     
 	// Less than (<)
         flag = (var1 < var2);
       System.out.println("(var1 < var2) = " + flag);
       
	// Less than or equal (<=)
       flag = (var1 <= var2);
       System.out.println("(var1 <= var2) = " + flag);        
        System.out.println("*****************************");  
       System.out.println("\n");

	// Conditional Operators
        // And (&&)
        System.out.println("*****Conditional Operators*****");
        flag = (var1 == var2 ) && (var2 >= var1) || (var2 < var1);
        System.out.println ("(var1 == var2 ) && (var2 >= var1) || (var2 < var1) = " + flag);       
        System.out.println("*****************************");  
       System.out.println("\n");

	// Bitwise Operators
        System.out.println("*****Bitwise Operators*****");
        int mask = 0b1010;
        int val =  0b0011; 
       
        int hmask = 0x00A4;
        int hval =  0x00F8;      
           
	// Apply the & to each bit
        System.out.println (" 0b0011 & 0b1010 = " + (val & mask) );
       
       // Apply the | to each bit
      System.out.println (" 0b0011 | 0b1010 = " + (val | mask) );

       // Apply the & to each bit
        System.out.println ("0x00F8 & 0x00A4 = " + (hval & hmask) );
       
       // Apply the | to each bit
      System.out.println ("0x00F8 | 0x00A4 = " + (hval | hmask) );      
       System.out.println("*****************************");  
       System.out.println("\n");

     }
}
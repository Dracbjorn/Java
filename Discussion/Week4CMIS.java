/*Fakher Ahmad
 *2/8/2015
 *Prof. Khattab
 *Discussion 4
*/

/**
 * Point is to create a program for discussion in week 4
 * that has one constructor and multiple methods and fields
 * @author Ahmed
 */
public class Week4CMIS141 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       methods methodsObject = new methods();
       methods methodsObject2 = new methods(5);
       methods methodsObject3 = new methods(5,13);
       methods methodsObject4 = new methods(5,13,43);
       
       //Display the methods
       System.out.printf("%s\n", methodsObject.toMilitary());
       System.out.printf("%s\n", methodsObject2.toMilitary());
       System.out.printf("%s\n", methodsObject3.toMilitary());
       System.out.printf("%s\n", methodsObject4.toMilitary());
   
       //Convert already given military time to regular time
       methodsObject.setTime(17, 13, 43);
       System.out.println(methodsObject.toMilitary());
       System.out.println(methodsObject.toString());
    }
    
}
import java.io.*;

public class UMUC_InputDemo {
	
	public static void main (String [] arges) throws IOException { // simple way to handle input errors
		int a;
		double b;

		BufferedReader stdin = new BufferedReader (  // BufferedReader is deprecated and you should use scanner class
			new InputStreamReader (System.in));

		System.out.print ("Type the value of a (integer): ");
		a = Integer.parseInt (stdin.readLine()); // Converts the string entered to an integer

		System.out.print ("Type the value of dB (double): ");
		b = Double.parseDouble (stdin.readLine()); // Converts the string entered to a double

		System.out.println ("a is: " + a);
		System.out.println ("b is: " + b);

	}	//	end method main
}	//	end class UMUC_InputDemo
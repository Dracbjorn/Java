import java.util.*;

public class UMUC_InputDemo2 {
	public static void main (String [] args) {
		int a;
		double b;

		Scanner stdin = new Scanner (System.in);
		System.out.print("Type the value of a (integer): ");
		a = stdin.nextInt();

		System.out.print("Type the value of b (double): ");
		b = stdin.nextDouble();

		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
	}
}
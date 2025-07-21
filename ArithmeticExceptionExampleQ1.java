package task7Package;

import java.util.Scanner;

public class ArithmeticExceptionExampleQ1 {

	public ArithmeticExceptionExampleQ1() {

		// User input through Scanner Class object
		Scanner obj = new Scanner(System.in);

		try {
			System.out.println("Enter the value of a: ");
			int a = obj.nextInt();

			System.out.println("Enter the value of b: ");
			int b = obj.nextInt();
			int c = a / b;

			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ArithmeticExceptionExampleQ1 obj = new ArithmeticExceptionExampleQ1();

	}

}

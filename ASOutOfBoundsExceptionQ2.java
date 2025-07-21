package task7Package;

import java.util.Scanner;

public class ASOutOfBoundsExceptionQ2 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		// String as User input
		String name = obj.nextLine();
		// ArrayIndexOutOfBoundsException
		try {
			int[] a = { 5, 6, 7, 8, 9 };
			int i = obj.nextInt();
			System.out.println(a[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		// StringIndexOutOfBoundsException

		try {
			int strSize = name.length();
			// trying to get the char at the lastIndex+1
			System.out.println(name.charAt(strSize));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}

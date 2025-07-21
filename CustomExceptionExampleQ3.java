package task7Package;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg) {
		System.out.println(msg);
	}
}

public class CustomExceptionExampleQ3 {
	static int age;

	public int userInput() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		age = obj.nextInt();
		return age;
	}

	public static void main(String[] args) throws InvalidAgeException {
		CustomExceptionExampleQ3 obj = new CustomExceptionExampleQ3();
		obj.userInput();
		try {
			vote(age);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}

	public static void vote(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("Not eligible for Vote");
		} else {
			System.out.println("Candidate is Eligible to vote");
		}
	}

}

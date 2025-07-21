package task7Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExampleQ4 {

	public static void main(String[] args) {
		File file = new File("data.txt");
		try {

			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: The file " + file + " was not found.");
			System.out.println(e);
		}

	}
}

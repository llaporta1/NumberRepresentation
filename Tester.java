package numberRepresentation;

import java.util.Scanner;

public class Tester {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If you would like to convert a decimal to a binary number, enter 'd'. If you would like to convert a binary number to a decimal, enter 'b'.");
		String choice = keyboard.nextLine();
		Converter c = new Converter(); 
		
		if (choice.equals("d")) {
			System.out.println("Enter the decimal you wish to convert: ");
			int value = keyboard.nextInt();
			System.out.println(c.decimal(value));
		}
		else if (choice.equals("b")) {
			System.out.println("Enter the binary number you wish to convert: ");
			String value2 = keyboard.nextLine();
			System.out.println(c.binary(value2));
		}
	}
}

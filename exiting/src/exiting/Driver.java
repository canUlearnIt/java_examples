package exiting;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please provide input (yes or no)");

		String response = scanner.nextLine();

		System.out.println(response);

		
		
		
		if("yes".equalsIgnoreCase(response)) {
			System.out.println("The user said YES");
			System.exit(0);
		}

		if ("no".equalsIgnoreCase(response)) {
			System.out.println("The user said NO");
		}
		
		if(!("yes".equalsIgnoreCase(response) || "no".equalsIgnoreCase(response))){
			System.out.println("The user provided invalid answer");
		}
		
		System.out.println("The user said YES");
		System.out.println("The user said YES");
		System.out.println("The user said YES");
		System.out.println("The user said YES");
		System.out.println("The user said YES");
		System.out.println("The user said YES");
		System.out.println("The user said YES");
		System.out.println("The user said YES");
	}

}

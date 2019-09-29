package user_input;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide your name");
		String name = scanner.nextLine();
		
		System.out.println("Please provide your animal's age");
		int age = scanner.nextInt();
		
		Animal animal = new Animal();
		animal.setAge(age);
		
		System.out.println("Please provide your last name");
		scanner.nextLine();
		String lastName = scanner.nextLine();
		
		
		System.out.println(String.format("Your name is %s, %nYour last name is %s, %nYour animal's age is %d", name, lastName, animal.getAge()));
		
		scanner.close();
	}

}

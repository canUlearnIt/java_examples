
public class Driver {
	public static void main(String[] args) {
		showExampleWithNumbers();

		showExampleWithChar();

		showExampleWithString();// strings in switch expression since Java SE 7.

	}

	
	// strings in switch expression since Java SE 7.
	private static void showExampleWithString() {
//Java allows us to use strings in switch expression since Java SE 7. The case statement should be string literal.
		
		
		// Declaring String variable
		String levelString = "Expert";
		int level = 0;
		// Using String in Switch expression
		switch (levelString) {
		// Using String Literal in Switch case
		case "Beginner":
			level = 1;
			break;
		case "Intermediate":
			level = 2;
			break;
		case "Expert":
			level = 3;
			break;
		default:
			level = 0;
			break;
		}
		System.out.println("Your Level is: " + level);
	}

	private static void showExampleWithChar() {
		// char grade = args[0].charAt(0);
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("You passed");
		case 'F':
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
	}

	private static void showExampleWithNumbers() {
		// Declaring a variable for switch expression
		int number = 20;
		// Switch expression
		switch (number) {
		// Case statements
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		// Default case statement
		default:
			System.out.println("Not in 10, 20 or 30");
		}
	}
}

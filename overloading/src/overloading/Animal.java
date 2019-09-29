package overloading;

public class Animal {
	public static void addNumbers() {
		System.out.println("empty");
	}

	public static void addNumbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static int addNumbers(int num1, String message) {
		System.out.println(num1 + " " + message);
		return num1;
	}
	
	public static String addNumbers(int num1, String message, int num2) {
		System.out.println(num1 + " " + message);
		return message;
	}

	public static void addNumbers(String message, int num1) {
		System.out.println(message + " " + num1);
	}
}

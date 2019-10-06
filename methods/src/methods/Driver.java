package methods;

public class Driver {

	public static void main(String[] args) {
		
		String message  = getMessage();
		System.out.println(message);
		
		printStaticMessage();
		
		printMessage("Hi");
		
		printNumber(7);
		
		printNumberAndMessage("Hello, ", 0);
		
		Animal animal = new Animal();
		animal.printmessage();

	}

	public static String getMessage() {
		return "Hello";
	}
	
	public static void printStaticMessage() {
		System.out.println("Static Hello");
	}	
	
	
	public static void printMessage(String message) {
		System.out.println(message);
	}	
	
	public static void printNumber(int number) {
		System.out.println(number);
	}	
	
	public static void printNumberAndMessage(String message, int number) {
		System.out.println(message + " your number is " + number);
	}
}

package overloading;

public class Driver {

	public static void main(String[] args) {
		Animal.addNumbers();
		Animal.addNumbers(2, 5);
		Animal.addNumbers(3, "Hello!");
		Animal.addNumbers("Hi", 9);
	}

	
	
}

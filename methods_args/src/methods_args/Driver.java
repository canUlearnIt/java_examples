package methods_args;

public class Driver {

	public static void main(String[] args) {
		
		int number = 9;
		
		System.out.println("number before we call method " + number);

		printMessage("Hello!", number);
		
		System.out.println("number after we call method " + number);
		
		
		
		Animal animal = new Animal();
		animal.setHeight(13);
		System.out.println("height before we call method " + animal.getHeight());
		
		
		printMessage(animal);
		
		
		System.out.println("height after we call method " + animal.getHeight());

	}
	
	public static void printMessage(String message, int number) {
		number = 10;
		System.out.println(message + " " + number);
	}

	public static void printMessage(Animal animal) {
		animal.setHeight(22);
		System.out.println("animal height is " + animal.getHeight());
	}
	
}

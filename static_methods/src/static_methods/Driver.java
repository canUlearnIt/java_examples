package static_methods;

public class Driver {

	public static void main(String[] args) {

		int sum = Animal.calculateTwoNumbers(1, 1);
		
		System.out.println(sum);
		
		Animal animal = new Animal();
		sum = animal.addTwoNumbers(1, 2);
		
		System.out.println(sum);
		
	}

}

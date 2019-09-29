package static_vars;

public class Driver {

	public static void main(String[] args) {

		Animal cat = new Animal();
		cat.age = 3;
		
		Animal.numOfLegs = 4;

		
		Animal dog = new Animal();
		dog.age = 7;
	

		System.out.println("cat " + cat.toString());
		
		System.out.println("dog " + dog.toString());
		
		
		Animal.numOfLegs = 3;
		
		System.out.println("---------------");
		System.out.println("cat " + cat.toString());
		
		System.out.println("dog " + dog.toString());
		
	}

}

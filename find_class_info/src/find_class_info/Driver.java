package find_class_info;

public class Driver {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		System.out.println(dog.getClass());


		System.out.println(dog.getClass().getName());
		System.out.println(dog.getClass().getSimpleName());
		
		if("Dog".equalsIgnoreCase(dog.getClass().getSimpleName())) {
			System.out.println("We found our dog!");
		}else {
			System.out.println("We did not find what we are looking for.");
		}
		
		if(dog instanceof Dog) {
			System.out.println("We found our dog!");
		}else {
			System.out.println("We did not find what we are looking for.");
		}

	}

}

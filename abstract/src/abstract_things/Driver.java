package abstract_things;

public class Driver {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Fish fish = new Fish();
		Bird bird = new Bird();
		
		dog.move();
		bird.move();
		fish.move();
		
		//Animal animal = new Animal();
		Animal.callStaticMethod();
		System.out.println(Animal.TYPE);

	}

}

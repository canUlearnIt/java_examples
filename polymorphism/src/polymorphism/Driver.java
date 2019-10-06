package polymorphism;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<>();
		
		Dog dog = new Dog();
		animals.add(dog);
		
		Fish fish = new Fish();
		fish.setFins(2);
		animals.add(fish);
		
		Bird bird = new Bird();
		animals.add(bird);
		
		MovementService.makeItMove(animals);
	}

}

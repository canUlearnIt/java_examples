package polymorphism;

import java.util.ArrayList;

public class MovementService {

	public static void makeItMove(ArrayList<Animal> animals) {
		for (Animal animal : animals) {
			animal.move();
			//know when animal is actually Fish
			if (animal instanceof Fish){
				System.out.println("current animal is fish");
				System.out.println(((Fish) animal).getFins());
			}

		}
	}
}

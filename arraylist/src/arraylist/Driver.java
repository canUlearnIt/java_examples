package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<Animal>();

		animals.add(new Animal(9));

		Animal animal8 = new Animal(8);
		animals.add(0, animal8);

		System.out.printf("(animal with height 8) is %sin the list%n", animals.contains(animal8) ? "" : "not ");

		System.out.printf("Size: %s%n", animals.size());

		System.out.printf(" %s%n", animals.get(0).height);

		System.out.print("Display list contents with counter-controlled loop:");
		for (int i = 0; i < animals.size(); i++) {
			System.out.printf(" %s", animals.get(i).height);
		}

		display(animals, "%nDisplay list contents with enhanced for statement:");

		Animal animal5 = new Animal(5);
		animals.add(animal5);
		animals.add(animal5);
		animals.add(new Animal(1));
		display(animals, "List with three new animals:");

		animals.remove(1);
		display(animals, "Remove second animal from the list (it has height 9):");

		animals.remove(animal5);
		display(animals, "Remove first instance of animal with height 5:");

	}

	public static void display(ArrayList<Animal> animals, String message) {
		System.out.printf(message);

		for (Animal item : animals) {
			System.out.printf(" %s", item.height);
		}
		System.out.println();
	}
}

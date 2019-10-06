package arraylist_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {

		ArrayList<String> months = new ArrayList<>(Arrays.asList("January", "February", "March"));
		
		System.out.println(months.size());
		System.out.println(months.get(0));
		
		
		Animal animal1= new Animal(9);
		ArrayList<Animal> anims = new ArrayList<>(Arrays.asList(animal1, new Animal(7)));
		
		System.out.printf("Size: %s%n", anims.size());
		System.out.println(anims.get(1).height);
		System.out.println();

	}

}

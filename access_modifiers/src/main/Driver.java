package main;

import animals.Dog;

public class Driver {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setColor("brown");
		dog.setType("dog");
		dog.setLegs(4);
		dog.legs = 4;
		
		System.out.println(dog);
		
	}

}

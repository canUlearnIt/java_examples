package inheritance_1;

public class Driver {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setColor("brown");
		dog.setType("dog");
		dog.setEyes(2);
		dog.setLegs(4);

		System.out.println(dog.getColor() + " " + dog.getEyes() + " " + dog.getLegs() + " " + dog.getType());

		Bird bird = new Bird();
		bird.setColor("blue");
		bird.setType("bird");
		bird.setEyes(2);
		bird.setLegs(4);
		bird.setWings(2);

		System.out.println(bird.getColor() + " " + bird.getEyes() + " " + bird.getLegs() + " " + bird.getWings() + " "
				+ bird.getType());
		
		dog.eat();
		bird.eat();
		dog.sleep();
		bird.sleep();
		
		dog.run();
		bird.fly();
		
		System.out.println(dog);
System.out.println(bird);
	}

}

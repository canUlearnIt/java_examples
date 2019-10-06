package polymorphism;

public class Dog extends Animal{

	public void move() {
		super.move();
		System.out.println("Dog is running.");
	}

}

package method_overriding;

public class Dog extends Animal {

	@Override
	public void move() {
		super.move();
		System.out.println("Dog is running.");
	}
}

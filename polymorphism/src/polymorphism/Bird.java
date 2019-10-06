package polymorphism;

public class Bird extends Animal {
	
	@Override
	public void move() {
		super.move();
		System.out.println("Bird is flying.");
	}
}

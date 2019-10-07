package abstract_things;

public abstract class Animal {
	final public static String TYPE = "ANIMAL";
	public abstract void move();
	
	public static void callStaticMethod() {
		System.out.println("I am in the Animal's static method.");
	}
}

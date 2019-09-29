package static_vars;

public class Animal {
	public int age;
	public static int numOfLegs;

	public Animal() {
		super();
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", numOfLegs=" + numOfLegs + "]";
	}

	
}

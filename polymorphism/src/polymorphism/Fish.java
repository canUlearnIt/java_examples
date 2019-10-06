package polymorphism;

public class Fish extends Animal{
	private int fins;
	
	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	public void move() {
		System.out.println("Fish is swimming.");
	}
}

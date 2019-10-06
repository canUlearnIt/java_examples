package animals;

public class Dog extends Animal {
	
	public int legs;

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		String text = super.toString();
		return "Dog [legs=" + legs + ", type=" + type + text;
	}
	
	

}

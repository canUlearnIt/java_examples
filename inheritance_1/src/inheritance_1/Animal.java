package inheritance_1;

public class Animal {
	private String type;
	private int eyes;
	private String Color;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public void eat() {
		System.out.println(type + " is eating");
	}
	
	public void sleep() {
		System.out.println(type + " is sleeping");
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", eyes=" + eyes + ", Color=" + Color + "]";
	}
	
	
}

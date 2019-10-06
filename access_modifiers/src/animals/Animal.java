package animals;

public class Animal {

	private String color;
	protected String type;

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return ", color=" + color ;
	}
	
	

}

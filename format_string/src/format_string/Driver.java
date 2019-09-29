package format_string;

public class Driver {

	public static void main(String[] args) {
		
		
		System.out.println(getNiceleyFormattedString("margaret", 7));
		
		Animal animal = new Animal();
		animal.setAge(13);
		animal.setName("Leaf");
		
		//String result = animal.getNiceleyFormattedString();
		
		System.out.println(animal.getNiceleyFormattedString());
		

	}
	
	
	public static String getNiceleyFormattedString(String name, int grade) {

		return String.format("My name is %s. I am in %d grade.", name, grade);
	}

}

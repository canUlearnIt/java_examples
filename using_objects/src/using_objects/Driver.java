package using_objects;

public class Driver {

	public static void main(String[] args) {

		Animal dog = new Animal();
		
		System.out.println(dog.getAge());
		System.out.println(dog.getName());
		System.out.println(dog.getType());
		
		dog.setAge(5);
		dog.setName("Rex");
		dog.setType("dog");
		
		
		System.out.println(dog.getAge());
		System.out.println(dog.getName());
		System.out.println(dog.getType());
		
		
		Animal cat = new Animal("Mew", "cat", 9);
		
		System.out.println(cat.getAge());
		System.out.println(cat.getName());
		System.out.println(cat.getType());
		
		cat.setName("Cup");
		
		System.out.println(cat.getName());
		System.out.println(dog.getName());
		
	}

}

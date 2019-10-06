package arrays;

public class Driver {

	public static void main(String[] args) {
		
		int[] array1 = new int[9]; // declare first and say what size it is (size =10)
		array1[0] = 5;// now set value 5 at 0 position
		array1[1] = 8;// set value to 8 at position 1
		
		System.out.println("array1.length= " + array1.length);
		System.out.println("at 0: " + array1[0]);
		System.out.println("at 1: " + array1[1]);
		System.out.println("at 2: " + array1[2]);
		System.out.println("at 5: " + array1[5]);
		
		
		char[] array2 = { 'A', 'H', 'S', 'L', 'I', 'O', 'P', 'W', 'R', 'E' };
		
		System.out.println("array2.length= " + array2.length);
		System.out.println("" + array2[1] + array2[9] + array2[3]  + array2[3]  + array2[5]  );
		
		
		Animal[] animals = new Animal[2];
		animals[0] = new Animal("Mew");
		animals[1] = new Animal("Lemon");
		
		System.out.println(animals[0].getName());
		

		System.out.println(animals[1].getName());
	}

}

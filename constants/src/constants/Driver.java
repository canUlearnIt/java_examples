package constants;

public class Driver {


	static String name = "Bob";
	
	public static void main(String[] args) {
		
		System.out.println(MobileConstatnts.NOKIA);
		System.out.println(MobileConstatnts.IPHONE);
		System.out.println(name);
		
		//NOKIA = "";
		name = "Nat";
		System.out.println(MobileConstatnts.NOKIA);
		System.out.println(MobileConstatnts.IPHONE);
		System.out.println(name);
	}

}

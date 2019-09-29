package decisions;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please provide input (yes or no)");

		String response = scanner.nextLine();

		System.out.println(response);

		
		
		
		if("yes".equalsIgnoreCase(response)) {
			System.out.println("The user said YES");
		}

		if ("no".equalsIgnoreCase(response)) {
			System.out.println("The user said NO");
		}
		
		if(!("yes".equalsIgnoreCase(response) || "no".equalsIgnoreCase(response))){
			System.out.println("The user provided invalid answer");
		}
		

//		if(!"yes".equalsIgnoreCase(response) && !"no".equalsIgnoreCase(response)){
//			System.out.println("The user provided invalid answer");
//		}
		
		
		
//		
//		if("yes".equalsIgnoreCase(response)) {
//			System.out.println("The user said YES");
//			if(!true) {
//				System.out.println("this is the true if statement");
//			}
//			
//			if(!false) {
//				System.out.println("this is the false if statement");
//			}
//		}else if ("no".equalsIgnoreCase(response)) {
//			System.out.println("The user said NO");
//		}else {
//			System.out.println("The user provided invalid answer");
//		}
		
		
		
		
//		if("yes".equalsIgnoreCase(response)) {
//			System.out.println("The user said YES");
//		}else {
//			System.out.println("The user must have said NO");
//		}


	}

}

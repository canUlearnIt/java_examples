package random;

import java.security.SecureRandom;

public class Driver {

	public static void main(String[] args) {
		
		SecureRandom randomGen = new SecureRandom();
		
		int randomValue = randomGen.nextInt(3);
		
		System.out.println("randomValue "  + randomValue);
		
		
		RandomNumberProvider numProvider = new RandomNumberProvider();
		
		numProvider.setRandomNumber(5);
		
		System.out.println("aaaaa " + numProvider.getRandomValue());
		
		numProvider.setRandomNumber(5, 1);
		
		System.out.println("bbbbb " + numProvider.getRandomValue());

		
		numProvider.setRandomNumber(5, 1, 2);
		
		System.out.println("ccccc " + numProvider.getRandomValue());
	}

}

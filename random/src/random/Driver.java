package random;

public class Driver {

	public static void main(String[] args) {
		RandomNumberProvider randomNumberProvider = new RandomNumberProvider();
		
		randomNumberProvider.setRandomNumber(5);
		System.out.println(randomNumberProvider.getRandomValue());
		
		randomNumberProvider.setRandomNumber(5);
		System.out.println(randomNumberProvider.getRandomValue());
		
		randomNumberProvider.setRandomNumber(5);
		System.out.println(randomNumberProvider.getRandomValue());
		
		//-------------------------------------------------------
		
		System.out.println("-------------------------------------------------");

		randomNumberProvider.setRandomNumber(5, 1);
		System.out.println(randomNumberProvider.getRandomValue());
		
		randomNumberProvider.setRandomNumber(5, 1);
		System.out.println(randomNumberProvider.getRandomValue());
		
		randomNumberProvider.setRandomNumber(5, 1);
		System.out.println(randomNumberProvider.getRandomValue());
		
		//--------------------------------------------------------------
		
		System.out.println("-------------------------------------------------");
		
		randomNumberProvider.setRandomNumber(5, 1, 3);
		System.out.println(randomNumberProvider.getRandomValue());
		
		randomNumberProvider.setRandomNumber(5, 1, 3);
		System.out.println(randomNumberProvider.getRandomValue());
		
		randomNumberProvider.setRandomNumber(5, 1, 3);
		System.out.println(randomNumberProvider.getRandomValue());
	}

}

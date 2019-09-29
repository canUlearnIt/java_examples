package random;

import java.security.SecureRandom;

public class RandomNumberProvider {
	private SecureRandom randomNumbers;
	private int randomValue;

	public RandomNumberProvider() {
		super();
		randomNumbers = new SecureRandom();	
		}

	public int getRandomValue() {
		return randomValue;
	}
	
	public void setRandomNumber(int scalingFactor) {
		randomValue = randomNumbers.nextInt(scalingFactor);
	}
	
	public void setRandomNumber(int scalingFactor, int shiftingValue) {
		randomValue = shiftingValue + randomNumbers.nextInt(scalingFactor);
	}
	
	public void setRandomNumber(int scalingFactor, int shiftingValue, int differenceBetweenValues) {
		randomValue = shiftingValue + differenceBetweenValues * randomNumbers.nextInt(scalingFactor);
	}
	
}

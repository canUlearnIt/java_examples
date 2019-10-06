package arrays_methods;

public class Driver {

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 4, 2, 6, 8, 0 };
		
		displyArrayNumbers(numbers);
		
		ArrayPrinter.displyArrayNumbers(numbers);

	}
	
	
	public static void displyArrayNumbers(int[] nums) {
		System.out.println(nums[0]);
		
		System.out.println(nums[3]);
		
		System.out.println(nums[5]);
	}

}

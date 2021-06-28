import java.util.Arrays;

public class ArraysHW {

	public static int sum(Integer[] arr) {
		int mySum = 0;
		
		for (int item : arr) {
			mySum += item;
		}
		
		return mySum;
	}
	
	public static double[] toPower(int size, double power) {
		double[] outputArr = new double[size];
		
		for (int i = 0; i < outputArr.length; i++) {
			outputArr[i] = Math.pow(i, power);
		}
		
		return outputArr;
	}
	
	public static void main(String[] args) {

		Integer[] myArray = {8, 3, 10, 8, 4, 6};
		
		System.out.printf("Sum: %s\n", sum(myArray));
		System.out.println("The answer to #2 is 2.");
		System.out.printf("Powers: %s\n", Arrays.toString(toPower(6, 3)));

	}

}

package Week2MethodPracticeProblems;

public class methodsPractice4 {
/*	Create a method to calculate the sum of the elements in an array. Inside main should look like this: 


		int[] example = {20, 10, 5, 2 }; 
		System.out.println("The sum of the example array is " + sumIt(example)); 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] example = {20,10,5,2};
		System.out.println("The sum of the example array is " + sumIt(example));
	}
	
	private static int sumIt (int[] example) {
		int sum = 0;
		for(int i : example) {
			sum += i;
		}
		return sum;
	}

}

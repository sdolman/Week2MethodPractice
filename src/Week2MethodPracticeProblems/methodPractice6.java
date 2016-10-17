package Week2MethodPracticeProblems;

public class methodPractice6 {
/*	Create a method called sumDigits that receives a number and returns the sum of its digits. For example, if the number is 123, the sum would be 6. 

	Inside main should look like this:


	System.out.println( sumDigits(123) );

*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumDigits(12345));
	}

	private static int sumDigits (int number) {
		int sum = 0;
		String digits = new Integer(number).toString(); //Why "new" here?
		for (char nChar : digits.toCharArray()) {
			int nInt = Character.getNumericValue(nChar); //but not here?
			sum += nInt;
		}
		return sum;
	}
}

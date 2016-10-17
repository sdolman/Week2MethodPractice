package Week2MethodPracticeProblems;

public class methodsPractice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {87,90,23};
		System.out.println(findMaximum(data));
	}

	private static int findMaximum (int [] xArray) {
		int nCompare = xArray[0]; 
		for(int i = 1; i < xArray.length; i++) {
			if (xArray[i] > nCompare) {
				nCompare = xArray[i];
			}
		}
		return nCompare;
	}
}

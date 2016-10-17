package Week2MethodPracticeProblems;

public class MethodsPractice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayHello ("John");
		sayGoodbye();
		
	}
	private static void sayHello(String name){ //this method doesn't return anything so use "void"
		System.out.println("Hello " + name);
	}
	
	private static void sayGoodbye() {
		System.out.println("Goodbye");
	}
	
}


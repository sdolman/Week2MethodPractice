package Week2MethodPracticeProblems;

public class MethodsPractice2 {
/*	Create a method to be called in main: 


		sayHello("John"); 
		sayGoodbye(); 


		sayHello and sayGoodbye are methods that you must define and that will be called from inside main. As you can see in the example, sayHello must accept a string as a parameter. 
*/
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


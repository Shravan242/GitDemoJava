package TrickyPograms;

public class LetsTry {

	public static void main(String[] args) {
		foo(null);
	}
		
	public static void foo(Object o) {
		System.out.println("Object");
	}
	
	public static void foo(String s) {
		System.out.println("String");
	}
	
}

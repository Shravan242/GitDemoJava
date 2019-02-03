package TrickyPograms;

public class Child extends StaticNonStaticCons{
	Child(){
		System.out.println("Hello Again! I'm child Constructor");
	}
	
	static {
		System.out.println("Hello Again! I'm child Static");
	}
	{
		System.out.println("Hello Again! I'm child Non-static");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("Main method");
		Child c1 = new Child();
	}
}

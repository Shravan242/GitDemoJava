package TrickyPograms;

public class StaticNonStaticCons {
	
	static {
		System.out.println("Hello! I'm super class Static block");
	}
	{
		System.out.println("Hello! I'm super class Non-static block");
	}
	StaticNonStaticCons(){
		System.out.println("Hello! I'm super class constructor");
	}	

}




package demo;

public class MyToString {	
	
	private String sname;
	private int sage;
	
	MyToString(String name,int age){
		this.sname= name;
		this.sage=age;		
	}

	@Override
	public String toString() {
		return "MyToString [sname=" + sname + ", sage=" + sage + "]";
	}
	

}

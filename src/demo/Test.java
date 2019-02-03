package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a = new ArrayList<>();
		
		List<String> b = Arrays.asList("as","ede");
		a.add("bet");
		a.add(1,"lets");
		a.set(0, "ka");
		a.add("fa");
		a.add("ya");
		
		/*
		 * System.out.println(a); for(int i=0;i<a.size();i++) {
		 * System.out.println(a.get(i));
		 * 
		 * } System.out.println("************"); for(String i:a) {
		 * System.out.println(i); } System.out.println("************");
		 * 
		 * int c=0; while(a.size()>c) { System.out.println(a.get(c)); c++; }
		 * 
		 * Iterator itr = a.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 * Enumeration<String> e = Collections.enumeration(a);
		 * System.out.println("ArrayList elements: "); while(e.hasMoreElements())
		 * System.out.println(e.nextElement());
		 * 
		 * ArrayList<MyToString> bk = new ArrayList<>(); bk.add(new
		 * MyToString("lux me",12)); bk.add(new MyToString("Hurry",13));
		 * System.out.println(bk);
		 */
		 
		Collections.sort(a);		
		for(String s:a)
			System.out.println(s);
			
		
		
	}

}

package demo;

public class AbstClass {

	 private static void printArgs(String... strings) {
	        for (int i = 0; i < strings.length; i++) {
	            String string = strings[i];
	            System.out.printf("Argument %d: %s", i, string);
	            System.out.println("");
	        }
	    }

	    public static void main(String[] args) {
	        printArgs("hello");
	        printArgs("hello", "world");
	    }

}

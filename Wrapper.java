// Wrapper class
// Integer, Float, etc

public class Wrapper {

	public static void main(String[] args) {
		int i = 5;	//Primitive	datatype
		Integer i1 = new Integer(i); //Boxing - Wrapping
		int j = i1.intValue();	//Unboxing - Unwrapping
		
		Integer value = 6;	//Autoboxing
		int val = value;	//Autounboxing
		
		String abc = "123";
		int n = Integer.parseInt(abc);
	}

}

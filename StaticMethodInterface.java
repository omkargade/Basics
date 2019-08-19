//	Static method in interface

interface Demo{
	double pi = 3.14; //variables in interface implicitly becomes final
	static void show() {
		System.out.println("Hello bois!");
	}
}

public class StaticMethodInterface {

	public static void main(String[] args) {
		Demo.show(); //no need to create any object
		
	}

}

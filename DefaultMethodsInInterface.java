// Defining methods in interface 
// The method can also be overrided

interface defmethinter{
	void abc();
	default void show() {	//default keyword is used to define method
		System.out.println("in show");
	}
}

public class DefaultMethodsInInterface {

	public static void main(String[] args) {
		defmethinter obj = () -> System.out.println("in abc");
		obj.abc();
		obj.show();
	}

}

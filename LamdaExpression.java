// Lambda expression is used when there is only 1 method in the interface.
// Interface with 1 method is called Functional Interface
interface Abc1{
	void show();
}

public class LamdaExpression {
	public static void main(String[] args) {
		Abc1 obj = () -> System.out.println("Using lambda"); // -> expression is used to define statements of show() method.
		obj.show();
	}
}

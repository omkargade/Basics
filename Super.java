/*	Super method and Method overriding
 * 
 * When the object of the child class is created
 * 	it executes the constructors of both the classes
 * 	first the parent class and then the child class
 * 
 * 	When an argument is passed the child(int i) constructor
 * 	will get executed and the parent() constructor is
 * 	executed.
 * 	
 * 	To execute parent(int i) super() is used with argument 
 * 	int in the child(int i) constructor.
 */

class parent{
	parent(){
		System.out.println("Parent");
	}
	parent(int i){
		System.out.println(i);
	}
	public void show() {
		System.out.println("Parent");
	}
}
class child extends parent{
	child(){
		System.out.println("Child");
	}
	child(int i){
		super(i);
		System.out.println(i);
	}
	@Override	//Checks for method overriding. If not then gives compilation error rather than logical error.
	public void show() {	//Child method overrides parents method.
		//super.show(); 	//executes both the methods
		System.out.println("Child");
	}
}

public class Super {

	public static void main(String[] args) {
		child c = new child(1);
		c.show();
	}

}

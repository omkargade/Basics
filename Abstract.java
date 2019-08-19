/*
 * 	Abstract class doesn't have object.
 * 	Abstract class can be use as reference for defining obj.
 * 	Can define both abstract and non-abstract method in abstract class.
 * 	Abstract method doesn't have body.
 * 	Abstract method must be implemented in the class in which it extends.
 *  Cannot extend multiple classes.
 */
abstract class Writer{
	abstract void write();
	void what() {
		System.out.print("What");
	}
}

class Pen extends Writer{
	void write() {
		System.out.print("write");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen ws = new Pen();
		ws.what();
	}

}

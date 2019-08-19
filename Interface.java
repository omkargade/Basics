/*
 * 	Methods can only be declared and not defined in interface.
 * 	Methods in interface are by default abstract.
 * 	Interface doesn't have object.
 * 	implements is used to implement interface.
 * 	Interface can be used as reference for creating obj.
 */
interface Writer1{
	void write();
}

class Pen1 implements Writer1{
	public void write() {
		System.out.print("Write");
	}
}

public class Interface {

	public static void main(String[] args) {
		Pen pn = new Pen();
		pn.write();
	}

}

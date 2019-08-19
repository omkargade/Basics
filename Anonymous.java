interface Xyz{
	void show();
}

class Abc{
	public void show() {
		System.out.println("in abc");
	}
}

public class Anonymous {

	public static void main(String[] args) {
		Abc obj = new Abc() { //anonymous class
			public void show() { //method overloading
				System.out.println("in Anonymous class");
								}
							};
		obj.show();
		
		Xyz obj1 = new Xyz() {
			public void show() { //anonymous class that implements interface
				System.out.println("in Anonymous interface class");
									}
								};
	}

}

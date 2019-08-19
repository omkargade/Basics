//	Checking out inner and outer classes

class Outer{
	static int a=5;
	public void show() {
		System.out.println(a++);
	}
	
	class Inner{
		public void display() {
			System.out.println(a++);
		}
	}
	static class Inner1{
		public void display() {
			System.out.println(a);
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.show();
		
		Outer.Inner inn = out.new Inner();
		inn.display();
		
		Outer.Inner1 inn1 = new Outer.Inner1();
		inn1.display();
	}
}


class calc1{					//super class
	public int add() {
		return 1+2;
	}
}

class advCalc extends calc1{	// sub class
	public int sub() {
		return 1-2;
	}
}

public class Inheritence {

	public static void main(String[] args) {
		advCalc cl = new advCalc();
		System.out.println(cl.add());
	}

}

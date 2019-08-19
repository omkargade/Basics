//	Trying out objects,contructors,overloading,
//	this,static

class Calc
{
	int num1,num2;
	static int i = 0;//does nothing
	
	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		//does nothing
	}
	
	public int add(int number1, int number2) {
		return number1+number2;
	}
	public double add(double number1, double number2) {
		return number1+number2;
	}
}

public class Object {

	public static void main(String[] args) {
		
		Calc obj = new Calc(12,4);
		System.out.print(obj.add(3, 4));
		System.out.println(obj.add(1,2.2));
	}

}

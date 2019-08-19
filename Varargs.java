
public class Varargs {

	public static int add(int ... n) {
		int sum=0;
		for(int i : n)
			sum = sum + i;
		return sum;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		System.out.print(add(1,2,3,4));
	}

}

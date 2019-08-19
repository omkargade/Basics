// Arrays and enhanced for loop


public class Arrayy {

	public static void main(String[] args) {
		int num[] = new int[4];
		int twod[][] = {
						{1,2,3},
						{4,5,6}
						};
		for(int i = 0;i<twod.length;i++)
			for (int j = 0;j<twod[i].length;j++)
				System.out.print(twod[i][j]);
		
		for(int[] k : twod)
			for(int l : k)
			System.out.print(l);
		
	}

}

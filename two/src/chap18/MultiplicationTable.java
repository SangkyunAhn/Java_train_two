package chap18;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i += 4) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d * %2d = %2d  %2d * %2d = %2d  %2d * %2d = %2d  %2d * %2d = %2d",
					i, j, i*j, i+1, j, (i+1)*j, i+2, j, (i+2)*j, i+3, j, (i+3)*j);
				System.out.println();
			}
			System.out.println();
		}
	}

}

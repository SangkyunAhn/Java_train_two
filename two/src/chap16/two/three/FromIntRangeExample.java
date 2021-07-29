package chap16.two.three;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 10);
		
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
	}

}

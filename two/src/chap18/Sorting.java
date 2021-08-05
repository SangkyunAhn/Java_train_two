package chap18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {

	public static void main(String[] args) {
		List<Integer> k = Arrays.asList(3, 7, 2, 7, 9, 10, 11);
		int temp;
		int swapCount = 0;
		Stream<Integer> stream = k.stream();
		
		while (true) {
			for (int i = 0; i < k.size() - 1; i++) {
				if (k.get(i) > k.get(i+1)) {
					temp = k.get(i+1);
					k.set(i+1, k.get(i));
					k.set(i, temp);
					swapCount++;
				}
			}
			
			if (swapCount == 0) break;
			swapCount = 0;
		}
		
		stream.forEach(value -> System.out.print(value + " "));
	}

}

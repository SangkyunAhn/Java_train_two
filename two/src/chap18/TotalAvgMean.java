package chap18;

import java.util.Scanner;

public class TotalAvgMean {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] values = new int[9];
		
		System.out.print("수 9개를 넣으세요: ");
		for (int i = 0; i < 9; i++) {
			values[i] = sc.nextInt();
		}
		
		int totalVal = total(values);
		float avgVal = average(values);
		
		sort(values);
		
		int medianVal = median(values);
		
		System.out.printf("총점: %d\n", totalVal);
		System.out.printf("평균: %.2f\n", avgVal);
		System.out.printf("중앙값: %d\n", medianVal);
	}
	
	public static int total(int[] values) {
		int sum = 0;
		
		for (int val : values) {
			sum += val;
		}
		
		return sum;
	}
	
	public static float average(int[] values) {
		int sum = 0;
		float avg;
		
		for (int val : values) {
			sum += val;
		}
		
		avg = (float) sum / values.length;
		
		return avg;
	}
	
	public static int[] sort(int[] values) {
		int temp;
		int swapCount = 0;
		
		while (true) {
			for (int i = 0; i < values.length - 1; i++) {
				if (values[i] > values[i+1]) {
					temp = values[i+1];
					values[i+1] = values[i];
					values[i] = temp;
					swapCount++;
				}
			}
			
			if (swapCount == 0) break;
			swapCount = 0;
		}
		
		return values;
	}
	
	public static int median(int[] values) {	
		int ret = values[values.length/2];
		
		return ret;
	}

}

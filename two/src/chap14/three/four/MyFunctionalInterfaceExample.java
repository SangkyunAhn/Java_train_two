package chap14.three.four;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 유형 1
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		// 유형 2
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2,  5));
		
		// 유형 3
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		// 유형 4
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}

}

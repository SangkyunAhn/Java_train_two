package chap13.one;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); // 자동
		String name = (String) box.get(); // 강제
		
		box.set(new Apple()); // 자동
		Apple apple = (Apple) box.get(); // 강제
	}

}

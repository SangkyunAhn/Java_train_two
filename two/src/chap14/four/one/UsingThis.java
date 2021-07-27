package chap14.four.one;

public class UsingThis {
	
	public int outterfield = 10;
	
	class Inner {
		int innerfield = 20;
		
		void method() {
			// 람다식
			MyFunctionalInterface fi = () -> {
				System.out.println("outterfield: " + outterfield);
				System.out.println("outterfield: " + UsingThis.this.outterfield + "\n");
				
				System.out.println("innerfield: " + innerfield);
				System.out.println("innerfield: " + this.innerfield + "\n");
			};
			
			fi.method();
		}
		
	}

}

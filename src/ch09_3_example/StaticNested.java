package ch09_3_example;

class OuterClass{
	private static int num = 0;
	
	static class Nested1{
		void add(int n) {num += n;}
	}
	
	static class Nested2{
		int getNum() { return num;}
	}
}

public class StaticNested {
	public static void main(String[] args) {
		OuterClass.Nested1 nst1 = new OuterClass.Nested1(); //static중첩 클래스를 접근하는 방법 일반 클래스보다 좀 더 간결하다.
		nst1.add(5);
		
		OuterClass.Nested2 nst2 = new OuterClass.Nested2();
		System.out.println(nst2.getNum());
	}
}

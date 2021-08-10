package ch09_1_inner;

//멤버 클래스에서의 사용 제한
public class A2 {
	
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B2{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();   //모든 필드와 메소드에 접근가능
		}
	}
	
	static class C2{
		void method() {
//			field1 = 10;
//			method1();   //인스턴스 필드와 메소드는 접근할 수 없음(당연한 얘기)
			
			field2 = 20;
			method2();
		}
	}
}

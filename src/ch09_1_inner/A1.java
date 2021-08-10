package ch09_1_inner;

//바깥 필드와 메소드에서 사용 제한
public class A1 {
	// 인스턴스 멤버 클래스
	class B1 {}
	
	// 정적 멤버 클래스
	static class C1 {}

	// 인스턴스 필드
	B1 field1 = new B1();
	C1 field2 = new C1(); //얘 왜되냐...A1소속으로 보면 C1도 static이지만 결국은 멤버 클래스라서 된다

	// 인스턴스 메소드
	void method1() {
		B1 var1 = new B1();
		C1 var2 = new C1();
	}

	// 정적필드 초기화
//	static B1 field3 = new B1();
	                      //여기서 안맞는거지(static에 인스턴스 객체를 넣었으니)
	static C1 field4 = new C1();

	// 정적 메소드
	static void method2() {
//		B1 var1 = new B1(); 얘도 당연히 안되는거징
		C1 var2 = new C1();
	}
}

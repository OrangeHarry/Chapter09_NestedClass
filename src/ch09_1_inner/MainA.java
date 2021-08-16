package ch09_1_inner;

public class MainA {
	public static void main(String[] args) {
		A a = new A();

		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 2;
		b.method1();

		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C(); //어차피 형태니깐 그냥 외우자 
		c.field1 = 4;
		c.method1();
		c.field2 = 5;
		c.method2();

		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}

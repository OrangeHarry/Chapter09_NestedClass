package ch09_1_inner;

//바깥 클래스
public class A {
	// 필드
	// 생성자
	A() {
		System.out.println("A 객체가 생성됨");
	}

	// 인스턴스멤버 클래스
	class B {
		// 필드
		int field1;
//		static field2;
		// 생성자
		B() {
			System.out.println("B 객체가 생성됨");
		}

		// 메소드
		void method1() {}
//		static void method2() {}
	}
	
	// 정적멤버 클래스
	static class C {
		// 필드
		int field1;
		static int field2;

		// 생성자
		C() {
			System.out.println("C 객체가 생성됨");
		}

		// 메소드
		void method1() {}
		static void method2() {}
	}

	// A메소드
	void method() {
		// 로컬 클래스
		class D {
			// 필드
			int field1;
			// static int field2;
			// 생성자
			D() {
				System.out.println("D 객체가 생성됨");
			}
			// 메소드
			void method1() {}
//			static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}

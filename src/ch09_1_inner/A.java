package ch09_1_inner;

//�ٱ� Ŭ����
public class A {
	// �ʵ�
	// ������
	A() {
		System.out.println("A ��ü�� ������");
	}

	// �ν��Ͻ���� Ŭ����
	class B {
		// �ʵ�
		int field1;
//		static field2;
		// ������
		B() {
			System.out.println("B ��ü�� ������");
		}

		// �޼ҵ�
		void method1() {}
//		static void method2() {}
	}
	
	// ������� Ŭ����
	static class C {
		// �ʵ�
		int field1;
		static int field2;

		// ������
		C() {
			System.out.println("C ��ü�� ������");
		}

		// �޼ҵ�
		void method1() {}
		static void method2() {}
	}

	// A�޼ҵ�
	void method() {
		// ���� Ŭ����
		class D {
			// �ʵ�
			int field1;
			// static int field2;
			// ������
			D() {
				System.out.println("D ��ü�� ������");
			}
			// �޼ҵ�
			void method1() {}
//			static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}

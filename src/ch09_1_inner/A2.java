package ch09_1_inner;

//��� Ŭ���������� ��� ����
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
			method2();   //��� �ʵ�� �޼ҵ忡 ���ٰ���
		}
	}
	
	static class C2{
		void method() {
//			field1 = 10;
//			method1();   //�ν��Ͻ� �ʵ�� �޼ҵ�� ������ �� ����(�翬�� ���)
			
			field2 = 20;
			method2();
		}
	}
}

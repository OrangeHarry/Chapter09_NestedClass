package ch09_1_inner;

//�ٱ� �ʵ�� �޼ҵ忡�� ��� ����
public class A1 {
	// �ν��Ͻ� ��� Ŭ����
	class B1 {}
	
	// ���� ��� Ŭ����
	static class C1 {}

	// �ν��Ͻ� �ʵ�
	B1 field1 = new B1();
	C1 field2 = new C1(); //�� �ֵǳ�...A1�Ҽ����� ���� C1�� static������ �ᱹ�� ��� Ŭ������ �ȴ�

	// �ν��Ͻ� �޼ҵ�
	void method1() {
		B1 var1 = new B1();
		C1 var2 = new C1();
	}

	// �����ʵ� �ʱ�ȭ
//	static B1 field3 = new B1();
	                      //���⼭ �ȸ´°���(static�� �ν��Ͻ� ��ü�� �־�����)
	static C1 field4 = new C1();

	// ���� �޼ҵ�
	static void method2() {
//		B1 var1 = new B1(); �굵 �翬�� �ȵǴ°�¡
		C1 var2 = new C1();
	}
}

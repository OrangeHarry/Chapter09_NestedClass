package ch09_1_inner;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();

		// ���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 4;
		c.method1();
		c.field2 = 5;
		c.method2();

		// ���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}

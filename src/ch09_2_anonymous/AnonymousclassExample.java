package ch09_2_anonymous;

public class AnonymousclassExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// �͸�ü �ʵ� ���
		anony.field.wake();
//		anony.field.work(); Person�� ����� ���� ��ü�̴ϱ� �翬�� Anonymous���� �ִ� work()�� ����� �� ����(�翬�� ���)
		
		// �͸�ü ���ú��� ���
		anony.method1();
		
		// �͸�ü �Ű��� ���
		anony.method2(
				new Person() {  //�Ű������� �͸� ��ü ����
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}
}

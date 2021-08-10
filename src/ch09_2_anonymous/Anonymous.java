package ch09_2_anonymous;

//class ChildPerson extends Person{
//	void work() {System.out.println("����մϴ�.");}
//	@Override
//	void wake() {
//		System.out.println("6�ÿ� �Ͼ�ϴ�.");
//		work();
//	}
//} �׳� �̰Ŷ� �����ž� ���� �̸����� �͸����� ������� ��

public class Anonymous {
	// �ʵ� �ʱⰪ���� ����
//	Person field = new ChildPerson(); Ŭ������ ������ �̷��� ���°Ŷ� �����Ŵ�.
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	}; // �̰� �͸�ü�� ������ ���̴�. �� �ٿ��� �� ����Ŭ��

	void method1() {
		// ���� ���������� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("11�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		// ���� �������
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}

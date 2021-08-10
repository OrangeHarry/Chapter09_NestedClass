package ch09_2_anonymous;

class AnonymousImpl{
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	void method1() {
		//���ú��������� ����
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
		//���� ���� ���
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}

public class AnonymousImplExample {
	public static void main(String[] args) {
		AnonymousImpl anony = new AnonymousImpl();
		// �͸� ��ü �ʵ� ���
		anony.field.turnOn();

		// �͸� ��ü ���� ���� ���
		anony.method1();

		// �͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Smart-TV�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Smart-TV�� ���ϴ�.");
			}
		});
	}
}

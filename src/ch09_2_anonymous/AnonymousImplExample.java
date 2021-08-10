package ch09_2_anonymous;

class AnonymousImpl{
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	void method1() {
		//로컬변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		//로컬 변수 사용
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}

public class AnonymousImplExample {
	public static void main(String[] args) {
		AnonymousImpl anony = new AnonymousImpl();
		// 익명 객체 필드 사용
		anony.field.turnOn();

		// 익명 객체 로컬 변수 사용
		anony.method1();

		// 익명 객체 매개값 사용
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Smart-TV를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Smart-TV를 끕니다.");
			}
		});
	}
}

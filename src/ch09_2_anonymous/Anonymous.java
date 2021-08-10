package ch09_2_anonymous;

//class ChildPerson extends Person{
//	void work() {System.out.println("출근합니다.");}
//	@Override
//	void wake() {
//		System.out.println("6시에 일어납니다.");
//		work();
//	}
//} 그냥 이거랑 같은거야 단지 이름없이 익명으로 만들었을 뿐

public class Anonymous {
	// 필드 초기값으로 대입
//	Person field = new ChildPerson(); 클래스가 있으면 이렇게 쓰는거랑 같은거다.
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	}; // 이게 익명객체를 생성한 것이다. 꼭 붙여야 해 세미클론

	void method1() {
		// 로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("11시에 일어납니다.");
				walk();
			}
		};
		// 로컬 변수사용
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}

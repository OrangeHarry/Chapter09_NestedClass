package ch09_2_anonymous;

public class AnonymousclassExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명객체 필드 사용
		anony.field.wake();
//		anony.field.work(); Person을 사용한 구현 객체이니깐 당연히 Anonymous에만 있는 work()는 사용할 수 없지(당연한 얘기)
		
		// 익명객체 로컬변수 사용
		anony.method1();
		
		// 익명객체 매개값 사용
		anony.method2(
				new Person() {  //매개값으로 익명 객체 대입
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}
}

package ch09_2_anonymous;

class Animal {
	void sound() {System.out.println("~~");}
}

//class Dog extends Animal {
//	@Override
//	void sound() {System.out.println("멍멍");}
//	void run() {System.out.println("달린다~~");}
//}

class Cat extends Animal {
	@Override
	void sound() {System.out.println("야옹");}
	void jump() {System.out.println("담을 넘는다~~");}
}

class Fish extends Animal {
	@Override
	void sound() {System.out.println("뻐끔~");}
	void swim() {System.out.println("헤엄친다.");}
}

public class Example {
	public static void main(String[] args) {
//	Animal ani = new Animal() {}; Animal을 상속받은 구현체를 내가 구현하겠다는 의미 (이런 형식도 가능하구나)
		Animal ani = new Animal() {
			@Override
			void sound() {
				System.out.println("멍멍");
				run();
				}
			void run() {System.out.println("달린다~~");}
		};
		ani.sound();
		
		ani = new Animal() {}; //여기다가 cat의 내용이나 아무런 동물들을 구현할 수도 있다.
	}
}

package ch09_2_anonymous;

class Animal {
	void sound() {System.out.println("~~");}
}

//class Dog extends Animal {
//	@Override
//	void sound() {System.out.println("�۸�");}
//	void run() {System.out.println("�޸���~~");}
//}

class Cat extends Animal {
	@Override
	void sound() {System.out.println("�߿�");}
	void jump() {System.out.println("���� �Ѵ´�~~");}
}

class Fish extends Animal {
	@Override
	void sound() {System.out.println("����~");}
	void swim() {System.out.println("���ģ��.");}
}

public class Example {
	public static void main(String[] args) {
//	Animal ani = new Animal() {}; Animal�� ��ӹ��� ����ü�� ���� �����ϰڴٴ� �ǹ� (�̷� ���ĵ� �����ϱ���)
		Animal ani = new Animal() {
			@Override
			void sound() {
				System.out.println("�۸�");
				run();
				}
			void run() {System.out.println("�޸���~~");}
		};
		ani.sound();
		
		ani = new Animal() {}; //����ٰ� cat�� �����̳� �ƹ��� �������� ������ ���� �ִ�.
	}
}

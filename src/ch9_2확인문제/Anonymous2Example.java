package ch9_2확인문제;

public class Anonymous2Example {
	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
}

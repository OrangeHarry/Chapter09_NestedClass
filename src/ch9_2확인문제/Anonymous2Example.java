package ch9_2Ȯ�ι���;

public class Anonymous2Example {
	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
			}
		});
	}
}

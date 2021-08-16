package ch09_3_example;

interface Printable3 {
	void print();
}

class Papers3 {
	private String contents;

	public Papers3(String s) {
		contents = s;
	}

	public Printable3 getPrinter() {
		return new Printable3() {
			@Override
			public void print() {
				System.out.println(Papers3.this.contents);
			}
		};
	}
}

public class UseAnonymousInner {
	public static void main(String[] args) {
		Papers3 papers3 = new Papers3("�� ������ ������������ ���۵Ǿ�....");
		Printable3 prn = papers3.getPrinter();
		prn.print();
	}
}

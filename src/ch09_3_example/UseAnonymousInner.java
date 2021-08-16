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
		Papers3 papers3 = new Papers3("이 편지는 영국에서부터 시작되어....");
		Printable3 prn = papers3.getPrinter();
		prn.print();
	}
}

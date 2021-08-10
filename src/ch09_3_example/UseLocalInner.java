package ch09_3_example;

interface Printable2 {
	void print();
}

class Papers2 {
	private String contents;

	public Papers2(String s) {
		contents = s;
	}

	public Printable2 getPrinter() {
		class Printer2 implements Printable2 {
			@Override
			public void print() {
				System.out.println(Papers2.this.contents);
			}
		}
		return new Printer2();
	}
}

public class UseLocalInner {
	public static void main(String[] args) {
		Papers papers = new Papers("My Document contenes are....");
		Printable prn = papers.getPrinter();
		prn.print();
	}
}

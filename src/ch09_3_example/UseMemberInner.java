package ch09_3_example;

interface Printable{
	void print();
}

class Papers {
	private String contents;

	public Papers(String s) {
		contents = s;
	}
	public Printable getPrinter() {
		return new Printer();
	}
	
	private class Printer implements Printable{
		@Override
		public void print() {
			System.out.println(Papers.this.contents); 
		}                        //Papers 클래스의 this를 나타낸다(이런식으로 사용!)
	}
}

public class UseMemberInner {
	public static void main(String[] args) {
		Papers papers = new Papers("Document : I am happy");
		Printable prn = papers.getPrinter();
		prn.print();
	}
}

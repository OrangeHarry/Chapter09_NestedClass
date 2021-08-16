package ch09_3_example;

interface Readable {
	void read(String s);
}

public class Lambda4 {
	public static void main(String[] args) {
			
		Readable r1 =  
				(s)->{System.out.println("\"" + s + "\"" + " 을(를) 읽는다.");}; 
				// ㅋㅋㅋ미치것다 진짜 String도 이미 추론이 가능한 타입이었어
		r1.read("What is Lambda?");
	}
}

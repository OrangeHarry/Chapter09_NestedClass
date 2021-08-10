package ch09_2_anonymous;

interface Calculatable{public int sum();}

class Anonymous2{
	private int field;
	
	public void method(final int arg1, int arg2) {//final이 결국은 붙어있다는 뜻
		final int var1 = 0;
		int var2 = 0;
		field = 10;
		
//		final 이건 아니건을 떠나서 스택 메모리에 저장이 되는거고 다음번에는 바껴서 값이 들어올 수 있어
//		arg1 = 20;
//		arg2 = 20;
//		var1 = 30;
//		var2 = 30;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2; 
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}

public class AnonymousSumExample {
	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();
		anony.method(0, 0); //10이 나오는건 field값
	}
}

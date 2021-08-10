package ch09_3_example;

class Outer{
	int num = 0;
	
	class Member{
		//메소드
		void add(int n) {
			num += n;
		}
		int getNum() {
			return num;
		}
	}
}

public class MemberInner {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		Outer o2 = new Outer();
	
		//o1기반으로 두개의 인스턴스 생성
		Outer.Member o1m1 = o1.new Member();
		Outer.Member o1m2 = o1.new Member();
		
		//o2기반으로 두 인스턴스 생성
		Outer.Member o2m1 = o2.new Member();
		Outer.Member o2m2 = o2.new Member(); 
		                   //Outter에 있는 num은 그대로 있는거고 Member에 대한 것만 새로 객체화 시킨것이다.
		
		//o1기반으로 생성된 두 인스턴스의 메소드 호출
		o1m1.add(5);
		System.out.println(o1m1.getNum());
		
		//o2기반으로 생성된 두 인스턴스의 메소드 호출
		o2m1.add(7);
		System.out.println(o2m2.getNum());
	}
}

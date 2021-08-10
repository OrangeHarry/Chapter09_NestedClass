package ch09_2_anonymous;

class Button {
	//중첩 인터페이스
	static interface OnClickListener{void onClick();}
	
	OnClickListener listener; //인터페이스 타입 필드
	
	void setOnClikListener(OnClickListener listener) { //매개변수의 다형성
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); //구현객체의 onClick()메소드 호출
	}
}

class Window{
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() { //필드값으로 익명 객체 대입
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	public Window(){
		button1.setOnClikListener(listener); //매개값으로 필드대입
		button2.setOnClikListener(new Button.OnClickListener() {//매개값으로 익명 객체 대입
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
public class Main{
	public static void main(String[] args) {
		Window w = new Window();
		w.button1.touch();
		w.button2.touch();
	}
}
package ch09_2_anonymous;

class Button {
	//��ø �������̽�
	static interface OnClickListener{void onClick();}
	
	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	void setOnClikListener(OnClickListener listener) { //�Ű������� ������
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); //������ü�� onClick()�޼ҵ� ȣ��
	}
}

class Window{
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() { //�ʵ尪���� �͸� ��ü ����
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	public Window(){
		button1.setOnClikListener(listener); //�Ű������� �ʵ����
		button2.setOnClikListener(new Button.OnClickListener() {//�Ű������� �͸� ��ü ����
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
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
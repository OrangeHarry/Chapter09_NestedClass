package ch09_1_inner;

public class Button {
	static interface OnClickListener{
		void onClick();
	}

	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {//�Ű������� ������
		this.listener = listener;   
	}
	
	void touch() {
		listener.onClick(); //���� ��ü�� onClick()�޼ҵ� ȣ��
	}
}

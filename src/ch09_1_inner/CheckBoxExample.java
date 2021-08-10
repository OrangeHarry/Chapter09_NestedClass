package ch09_1_inner;

import ch09_1_inner.CheckBox.OnSelectListener;

class CheckBox{
	static interface OnSelectListener{
		void onSelect();
	}
	
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
}

class BackgroundChangeListener implements CheckBox.OnSelectListener{
	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
}

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}

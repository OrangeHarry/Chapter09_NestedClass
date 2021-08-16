package ch9_2확인문제;

public class CheckBoX {
	static interface OnSelectListener {
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

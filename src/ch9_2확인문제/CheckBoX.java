package ch9_2Ȯ�ι���;

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

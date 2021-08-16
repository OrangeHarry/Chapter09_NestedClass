package ch9_2확인문제;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBoX checkBoX = new CheckBoX();
		checkBoX.setOnSelectListener(new CheckBoX.OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");
			}
		});
		checkBoX.select();
	}
}

package ch9_2Ȯ�ι���;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBoX checkBoX = new CheckBoX();
		checkBoX.setOnSelectListener(new CheckBoX.OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("����� �����մϴ�.");
			}
		});
		checkBoX.select();
	}
}

package ch09_1_inner;

import javax.jws.Oneway;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new CallListener());
		btn.touch();

		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}

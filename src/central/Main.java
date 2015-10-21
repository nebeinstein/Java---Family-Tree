package central;

import control.HomeUIController;
import ui.HomeUI;

public class Main {

	public static DummyClass DUMDUM;

	public static void main(String[] args) {
		DUMDUM = new DummyClass();
		new HomeUI(new HomeUIController());
	}
}

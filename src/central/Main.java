package central;

import control.HomeUIController;
import ui.HomeUI;

public class Main {
	public static void main(String[] args) {
		new HomeUI(new HomeUIController());
	}
}

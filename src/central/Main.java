package central;

import model.Archivist;
import control.HomeUIController;
import ui.HomeUI;

public class Main {

	public static DummyClass DUMDUM;
	public static Archivist librarian;

	public static void main(String[] args) {
		DUMDUM = new DummyClass();
		librarian = new Archivist();
		new HomeUI(new HomeUIController());
	}
}

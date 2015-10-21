package ui;

import javax.swing.JComponent;

import control.Controller;
import control.NewPersonUIController;

public class NewPersonUI extends NewPersonUIHeader implements UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 922169374318770403L;

	public NewPersonUI(Controller c) {
		addController(c);
		ctrl.addUI(this);
		buildUI();
		setVisible(true);
	}

	@Override
	public void addController(Controller c) {
		ctrl = (NewPersonUIController) c;

	}

	@Override
	public void buildUI() {
		// Creating the window
		setSize(500, 553);
		setTitle("New Person");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}

package ui;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;

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
		setSize(500, 400);
		setTitle("New Person");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		personPanel.setSize(500,400);
		personPanel.setLayout(null);
		add(personPanel, BorderLayout.CENTER);

		firstNameLabel.setLocation(39, 39);
		firstNameLabel.setSize(96, 25);
		firstNameLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(firstNameLabel);

		firstNameBox.setLocation(145, 39);
		firstNameBox.setSize(274, 25);
		personPanel.add(firstNameBox);

		midNameLabel.setLocation(39, 79);
		midNameLabel.setSize(96, 25);
		midNameLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(midNameLabel);

		midNameBox.setLocation(145, 79);
		midNameBox.setSize(274, 25);
		personPanel.add(midNameBox);

		lastNameLabel.setLocation(39, 119);
		lastNameLabel.setSize(96, 25);
		lastNameLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(lastNameLabel);

		lastNameBox.setLocation(145, 119);
		lastNameBox.setSize(274, 25);
		personPanel.add(lastNameBox);

		motherLabel.setLocation(39, 159);
		motherLabel.setSize(96, 25);
		motherLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(motherLabel);

		motherBox.setLocation(145, 159);
		motherBox.setSize(274, 25);
		motherBox.addItem("--- Unknown ---");
		personPanel.add(motherBox);

		fatherLabel.setLocation(39, 199);
		fatherLabel.setSize(96, 25);
		fatherLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(fatherLabel);

		fatherBox.setLocation(145, 199);
		fatherBox.setSize(274, 25);
		fatherBox.addItem("--- Unknown ---");
		personPanel.add(fatherBox);

		cancelButton.setLocation(373, 325);
		cancelButton.setSize(96, 25);
		cancelButton.addActionListener(ctrl);
		personPanel.add(cancelButton);

		saveAndCloseButton.setLocation(202, 325);
		saveAndCloseButton.setSize(146, 25);
		saveAndCloseButton.addActionListener(ctrl);
		personPanel.add(saveAndCloseButton);
		
		saveAndAnotherButton.setLocation(31, 325);
		saveAndAnotherButton.setSize(146, 25);
		saveAndAnotherButton.addActionListener(ctrl);
		personPanel.add(saveAndAnotherButton);
	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}

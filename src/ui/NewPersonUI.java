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

		personPanel.setSize(500, 400);
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

		genderLabel.setLocation(39, 159);
		genderLabel.setSize(95, 25);
		genderLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(genderLabel);

		genderBox.setLocation(145, 159);
		genderBox.setSize(274, 25);
		personPanel.add(genderBox);

		motherLabel.setLocation(39, 199);
		motherLabel.setSize(96, 25);
		motherLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(motherLabel);

		motherBox.setLocation(145, 199);
		motherBox.setSize(274, 25);
		motherBox.addItem("Unknown");
		personPanel.add(motherBox);

		fatherLabel.setLocation(39, 239);
		fatherLabel.setSize(96, 25);
		fatherLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(fatherLabel);

		fatherBox.setLocation(145, 239);
		fatherBox.setSize(274, 25);
		fatherBox.addItem("Unknown");
		personPanel.add(fatherBox);

		isMeLabel.setLocation(39, 279);
		isMeLabel.setSize(96, 25);
		isMeLabel.setHorizontalAlignment(JLabel.CENTER);
		personPanel.add(isMeLabel);

		yesLabel.setLocation(145, 279);
		yesLabel.setSize(75, 25);
		yesLabel.setHorizontalAlignment(JLabel.LEFT);
		personPanel.add(yesLabel);

		yesButton.setLocation(170, 282);
		yesButton.setSize(20, 20);
		personPanel.add(yesButton);

		noLabel.setLocation(200, 279);
		noLabel.setSize(75, 25);
		noLabel.setHorizontalAlignment(JLabel.LEFT);
		personPanel.add(noLabel);

		noButton.setLocation(225, 282);
		noButton.setSize(20, 20);
		personPanel.add(noButton);

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

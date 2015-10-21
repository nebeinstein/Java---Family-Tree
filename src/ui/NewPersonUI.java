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

		panel.setSize(500,400);
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		nameLabel1.setLocation(39, 39);
		nameLabel1.setSize(96, 25);
		nameLabel1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(nameLabel1);

		nameBox1.setLocation(145, 39);
		nameBox1.setSize(274, 25);
		panel.add(nameBox1);

		nameLabel2.setLocation(39, 79);
		nameLabel2.setSize(96, 25);
		nameLabel2.setHorizontalAlignment(JLabel.CENTER);
		panel.add(nameLabel2);

		nameBox2.setLocation(145, 79);
		nameBox2.setSize(274, 25);
		panel.add(nameBox2);

		nameLabel3.setLocation(39, 119);
		nameLabel3.setSize(96, 25);
		nameLabel3.setHorizontalAlignment(JLabel.CENTER);
		panel.add(nameLabel3);

		nameBox3.setLocation(145, 119);
		nameBox3.setSize(274, 25);
		panel.add(nameBox3);

		motherLabel.setLocation(39, 159);
		motherLabel.setSize(96, 25);
		motherLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(motherLabel);

		motherBox.setLocation(145, 159);
		motherBox.setSize(274, 25);
		motherBox.addItem("--- Unknown ---");
		panel.add(motherBox);

		fatherLabel.setLocation(39, 199);
		fatherLabel.setSize(96, 25);
		fatherLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(fatherLabel);

		fatherBox.setLocation(145, 199);
		fatherBox.setSize(274, 25);
		fatherBox.addItem("--- Unknown ---");
		panel.add(fatherBox);

		cancel.setLocation(373, 325);
		cancel.setSize(96, 25);
		cancel.addActionListener(ctrl);
		panel.add(cancel);

		save1.setLocation(202, 325);
		save1.setSize(146, 25);
		save1.addActionListener(ctrl);
		panel.add(save1);
		
		save2.setLocation(31, 325);
		save2.setSize(146, 25);
		save2.addActionListener(ctrl);
		panel.add(save2);
	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}

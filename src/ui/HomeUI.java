package ui;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import control.Controller;
import control.HomeUIController;

public class HomeUI extends HomeUIHeader implements UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8285917393050606962L;

	public HomeUI(Controller c) {
		addController(c);
		ctrl.addUI(this);
		buildUI();
		setVisible(true);
	}

	@Override
	public void addController(Controller c) {
		ctrl = (HomeUIController) c;

	}

	@Override
	public void buildUI() {
		// Creating the window
		setSize(800, 600);
		setTitle("My Family Tree");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		bar.add(file);
		bar.add(help);
		file.add(New);
		file.add(options);
		file.add(new JSeparator());
		file.add(exit);
		New.add(pers);
		help.add(howto);
		help.add(about);
		add(bar, BorderLayout.NORTH);

		options.addActionListener(ctrl);
		exit.addActionListener(ctrl);
		pers.addActionListener(ctrl);
		howto.addActionListener(ctrl);
		about.addActionListener(ctrl);

		panelhome.setSize(this.getWidth(), this.getHeight());
		panelhome.setLayout(null);
		add(panelhome);

		labelhome.setLocation(0, 0);
		labelhome.setSize(this.getWidth(), 25);
		labelhome.setHorizontalAlignment(JLabel.CENTER);
		panelhome.add(labelhome);

	}

	@Override
	public JComponent getComponentByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}

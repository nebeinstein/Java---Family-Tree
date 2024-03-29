package ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import central.Main;
import control.NewPersonUIController;

public class NewPersonUIHeader extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8644490432157613240L;

	// Controller
	public NewPersonUIController ctrl;

	JPanel personPanel = new JPanel();

	JLabel firstNameLabel = new JLabel("First Name");
	public JTextField firstNameBox = new JTextField();
	JLabel midNameLabel = new JLabel("Middle Name");
	public JTextField midNameBox = new JTextField();
	JLabel lastNameLabel = new JLabel("Last Name");
	public JTextField lastNameBox = new JTextField();

	JLabel genderLabel = new JLabel("Sex");
	public JComboBox<String> genderBox = new JComboBox<String>(new String[] {
			"Male", "Female" });

	JLabel motherLabel = new JLabel("Mother");
	public JComboBox<String> motherBox = new JComboBox<String>(
			Main.DUMDUM.peopleNames);

	JLabel fatherLabel = new JLabel("Father");
	public JComboBox<String> fatherBox = new JComboBox<String>(
			Main.DUMDUM.peopleNames);

	JLabel isMeLabel = new JLabel("Is this you?");
	JLabel yesLabel = new JLabel("Yes");
	public JRadioButton yesButton = new JRadioButton();
	JLabel noLabel = new JLabel("No");
	public JRadioButton noButton = new JRadioButton();

	JButton browseButton = new JButton("Browse");
	public JButton cancelButton = new JButton("Cancel");
	public JButton saveAndCloseButton = new JButton("Save and Close");
	public JButton saveAndAnotherButton = new JButton("Save and Make Another");
}

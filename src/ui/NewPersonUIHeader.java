package ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import central.Main;
import control.NewPersonUIController;

public class NewPersonUIHeader extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8644490432157613240L;

	// Controller
	NewPersonUIController ctrl;

	JPanel panel = new JPanel();
	
	JLabel nameLabel1 = new JLabel("First Name");
	JTextField nameBox1 = new JTextField();
	JLabel nameLabel2 = new JLabel("Middle Name");
	JTextField nameBox2 = new JTextField();
	JLabel nameLabel3 = new JLabel("Last Name");
	JTextField nameBox3 = new JTextField();
	
	JLabel motherLabel = new JLabel("Mother");
	JComboBox<String> motherBox = new JComboBox<String>(Main.DUMDUM.peopleNames);
	
	JLabel fatherLabel = new JLabel("Father");
	JComboBox<String> fatherBox = new JComboBox<String>(Main.DUMDUM.peopleNames);

	JButton browse = new JButton("Browse");
	public JButton cancel = new JButton("Cancel");
	public JButton save1 = new JButton("Save and Close");
	public JButton save2 = new JButton("Save and Make Another");
}

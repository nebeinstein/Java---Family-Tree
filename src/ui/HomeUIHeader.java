package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import control.HomeUIController;

public class HomeUIHeader extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8814348590854814800L;

	// Controller
	HomeUIController ctrl;

	// Menu things
	JMenuBar bar = new JMenuBar();

	// File menu
	JMenu file = new JMenu("File");
	public JMenuItem options = new JMenuItem("Options");
	public JMenuItem exit = new JMenuItem("Exit");

	// New menu in file menu
	JMenu New = new JMenu("New");
	public JMenuItem pers = new JMenuItem("Person");

	// Help menu
	JMenu help = new JMenu("Help");
	public JMenuItem about = new JMenuItem("About");
	public JMenuItem howto = new JMenuItem("How to Use");

	// For main window
	JPanel panelhome = new JPanel();
	JLabel labelhome = new JLabel();

}

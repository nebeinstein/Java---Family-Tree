package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import ui.NewPersonUI;
import ui.UI;

public class NewPersonUIController implements Controller {

	NewPersonUI ui;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.cancelButton)
			ui.dispose();

	}

	public String[] getPersonInformation() {
		String[] personData = new String[6];
		personData[0] = getName();
		personData[1] = getGender();
		personData[2] = getLived();
		personData[3] = (String) ui.motherBox.getSelectedItem();
		personData[4] = (String) ui.fatherBox.getSelectedItem();
		personData[5] = getIsMe();
		return personData;
	}

	private String getName() {
		String name = "";
		name += ui.firstNameBox.getText() + ", ";
		if (!(ui.midNameBox.getText().equals("")))
			name += ui.midNameBox.getText() + ", ";
		name += ui.lastNameBox.getText();
		return name;
	}

	private String getGender() {
		String gender = "false";
		return gender;
	}

	private String getLived() {
		String lived = "";

		return lived;
	}

	private String getIsMe() {
		String isMe = "false";
		return isMe;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUI(UI u) {
		ui = (NewPersonUI) u;

	}

}

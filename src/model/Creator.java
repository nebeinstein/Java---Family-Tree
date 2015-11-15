package model;

import central.Main;
import tree.Person;
import ui.NewPersonUI;

public class Creator {
	boolean verboseOutputEnabled = true;

	public Creator() {

	}

	public void createPerson(NewPersonUI ui) {
		say("Getting person information...");
		String[] personData = ui.ctrl.getPersonInformation();		
		say("Done.");
		
		say("Creating person...");
		Person guy = new Person(personData);
		say("Done.");
		
		say("Sending to Archivist...");
		Main.librarian.savePayload("person", guy);
		say("Done.");
	}

	private void say(String s) {
		if (verboseOutputEnabled)
			System.out.println("Creator: " + s);
	}

}

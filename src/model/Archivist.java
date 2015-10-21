package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import tree.Person;

public class Archivist {
	ArrayList<String> lines;
	public ArrayList<Person> people;
	int location;
	private boolean verboseOutputEnabled = true;
	private final String datafile = "data";
	
	/**
	 * Constructor for the archivist class.
	 */
	public Archivist() {
		this.lines = new ArrayList<String>();
		this.people= new ArrayList<Person>();
		this.location = 0;
		this.loadFile(datafile);
		this.interpret();
	}
	
	/**
	 * Interprets lines loaded from the file into usable data.
	 */
	public void interpret() {
		this.say("Interpreting...");
		while (location < lines.size()) {
			String s = lines.get(location);
			if (s.contains("person")) {
				this.loadPerson();
			}
			location++;
		}
		this.say("Done.");
		this.say(this.people.size() + " People Loaded...");
	}
	
	/**
	 * Loads all the lines in the datafile at the given filepath.
	 * 
	 * @param fp
	 */
	public void loadFile(String fp) {
		say("Loading File...");
		try {
			Scanner s = new Scanner(new File(fp));
			while (s.hasNext())
				lines.add(s.nextLine());
			say("File Loaded.");
			s.close();
			say("File Closed.");
		} catch (FileNotFoundException e) {
			say("File not found!");
			e.printStackTrace();
		}
	}
	
	/**
	 * Person loader
	 */
	public void loadPerson() {
		String s = this.lines.get(location);
		String[] personData = new String[7];
		int depth = 0;
		while (depth<6) {
			s = this.lines.get(location);
			if (s.contains(";")) {
				if(s.contains("{"))
					s = s.substring(s.indexOf("{") + 1);
				String[] data = s.split(";");
				for (String point : data) {
					personData[depth] = point;
					depth++;
				}
			}
			location++;
		}
		people.add(new Person(personData));
		say(people.get(people.size()-1).toString());
	}
	
	/**
	 * Saves the given object's toString() data in the datafile as the type
	 * specified by the given String in the file.
	 * 
	 * @param type
	 *            - The name of the type.
	 * @param payload
	 *            - The Object whose data you want to save
	 */
	public void savePayload(String type, Object payload) {
		say("Saving...");
		try {
			say("Opening file...");
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					datafile),true));
			say("Writing header...");
			bw.newLine();
			bw.write(type + "{");
			say("Done.");
			bw.newLine();
			say("Writing data...");
			bw.write(payload.toString());
			say("Done.");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			say("Closing file...");
			bw.close();
			say("File closed.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		say("Save complete.");
		if(type.equals("person")){
			people.add((Person)payload);
		}
	}
	
	private void say(String s) {
		if (verboseOutputEnabled)
			System.out.println("Archivist: " + s);
	}
}

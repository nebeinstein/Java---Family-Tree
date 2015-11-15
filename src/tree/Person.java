package tree;

import central.Main;

public class Person implements Tree {

	private String name;
	private boolean gender;
	String lived;
	boolean me;
	Tree mom;
	Tree dad;

	public Person(String Name, String Gender, String Lived, String Mother,
			String Father, String Me) {
		name = Name;
		gender = Boolean.getBoolean(Gender);
		lived = Lived;
		mom = findPersonByName(Mother);
		dad = findPersonByName(Father);
		me = Boolean.getBoolean(Me);

	}

	public Person(String[] personData) {
		int i = 0;
		name = personData[i++];
		gender = Boolean.getBoolean(personData[i++]);
		lived = personData[i++];
		mom = findPersonByName(personData[i++]);
		dad = findPersonByName(personData[i++]);
		me = Boolean.getBoolean(personData[i++]);

	}

	public String toString() {
		String s = name;
		s += ";" + gender;
		s += ";" + lived;
		s += ";" + mom.getName();
		s += ";" + dad.getName();
		s += ";" + me;
		s += ";";
		return s;
	}

	private Tree findPersonByName(String personName) {
		Tree person = new Unknown();
//		if (!(personName.equals("Unknown"))) {
//			int i = 0;
//			while (i < Main.DUMDUM.people.size()) {
//				Tree tree = Main.DUMDUM.people.get(i);
//				if (tree.getName().equals(personName))
//					person = tree;
//				i++;
//			}
//		}
		return person;
	}

	@Override
	public int count() {
		return (1 + mom.count() + dad.count());
	}

	@Override
	public int gens() {
		if (mom.gens() > dad.gens()) {
			return (1 + mom.gens());
		} else {
			return (1 + dad.gens());
		}
	}

	@Override
	public String getName() {
		return name;
	}

	public boolean getGender() {
		return gender;
	}

}

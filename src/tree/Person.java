package tree;

import central.Main;

public class Person implements Tree {

	private String name;
	String gender;
	String lived;
	String mother;
	String father;
	String me;

	Tree mom;
	Tree dad;

	public Person(String Name, String Gender, String Lived, String Mother,
			String Father, String Me) {
		name = Name;
		gender = Gender;
		lived = Lived;
		mother = Mother;
		father = Father;
		me = Me;
	}

	public Person(String[] personData) {
		int i = 0;
		name = personData[i++];
		gender = personData[i++];
		lived = personData[i++];
		mother = personData[i++];
		father = personData[i++];
		me = personData[i++];
	}

	public String toString() {
		String s = name;
		s += ";" + gender;
		s += ";" + lived;
		s += ";" + mother;
		s += ";" + father;
		s += ";" + me;
		s += ";";
		return s;
	}

	private Tree findPersonByName(String personName) {
		Tree p = new Unknown();
		int i = 0;
		while (i < Main.DUMDUM.people.size()) {
			Tree t = Main.DUMDUM.people.get(i);
			if (t.getName().equals(personName))
				p = t;
			i++;
		}
		return p;

	}

	public Tree findMum() {
		Tree p = findPersonByName(mother);
		return p;
	}

	public Tree findDad() {
		Tree p = findPersonByName(father);
		return p;
	}

	@Override
	public int count() {
		mom = findMum();
		dad = findDad();
		return (1 + mom.count() + dad.count());
	}

	@Override
	public int gens() {
		mom = findMum();
		dad = findDad();
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

}

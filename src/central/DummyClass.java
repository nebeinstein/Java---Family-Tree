package central;

import java.util.ArrayList;

import tree.Person;
import tree.Tree;

public class DummyClass {
	Person mom;
	Person dad;
	Person me;
	public ArrayList<Tree> people = new ArrayList<Tree>();
	public String[] peopleNames;

	public DummyClass() {
		mom = new Person("Claudia, Ross, Beinstein", "true", "1965- ",
				"Unknown", "Unknown", "false");
		dad = new Person("David, Lloyd, Beinstein", "false", "1962- ",
				"Unknown", "Unknown", "false");
		me = new Person("Nicole, Elizabeth, Beinstein", "true", "1994- ",
				"Claudia, Ross, Beinstein", "David, Lloyd, Beinstein", "true");
		people.add(mom);
		people.add(dad);
		people.add(me);
		peopleNames = new String[people.size()];
		int i = 0;
		while (i < peopleNames.length) {
			peopleNames[i] = people.get(i).getName();
			i++;
		}
	}
}

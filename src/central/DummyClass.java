package central;

import tree.Person;
import tree.Unknown;

public class DummyClass {
	Person mom;
	Person dad;
	Person me;

	public DummyClass() {
		mom = new Person(new String[] { "Claudia", "Ross", "Beinstein" }, true,
				new String[] { "1965", " " }, new Unknown(), new Unknown(),
				false);
		dad = new Person(new String[] { "David", "Lloyd", "Beinstein" }, false,
				new String[] { "1962", " " }, new Unknown(), new Unknown(),
				false);
		me = new Person(new String[] { "Nicole", "Elizabeth", "Beinstein" },
				true, new String[] { "1994", " " }, mom, dad, true);
	}
}

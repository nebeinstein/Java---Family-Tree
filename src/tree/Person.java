package tree;

public class Person implements Tree {

	private String[] name;
	public boolean gender;
	String[] lived;
	Tree mother;
	Tree father;
	boolean me;

	public Person(String[] Name, boolean Gender, String[] Lived, Tree Mother,
			Tree Father, boolean Me) {
		name = Name;
		gender = Gender;
		lived = Lived;
		mother = Mother;
		father = Father;
		me = Me;
	}

	@Override
	public int count() {
		return (1 + mother.count() + father.count());
	}

	@Override
	public int gens() {
		if (mother.gens() > father.gens()) {
			return (1 + mother.gens());
		} else {
			return (1 + father.gens());
		}
	}

	@Override
	public String getName() {
		String finalName = "";
		for (String s:name){
			finalName += s + " ";
		}
//		System.out.println(finalName);
		return finalName;
	}

}

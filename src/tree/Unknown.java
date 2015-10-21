package tree;

public class Unknown implements Tree {

	public Unknown() {

	}

	@Override
	public int count() {
		return 0;
	}

	@Override
	public int gens() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

}

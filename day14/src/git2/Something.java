package git2;

public class Something {
	
	// public int addOne(final int x) {
	// return ++x;// return x + 1;
	// }

	public static void main(String[] args) {
		Other o = new Other();
		new Something().addOne(o);
	}

	public void addOne(final Other o) {
		// o = new Other();
		o.i++;
	}
}

class Other {
	public int i;
}

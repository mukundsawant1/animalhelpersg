package animalmodelling.model;

import animalmodelling.behavior.Singable;

public class Parrot extends Bird {

	private Singable singable;
	
	public Parrot() {}
	
	public Parrot(Singable singable) {
		this.singable=singable;
	}
	
	@Override
	public void sing() {
		this.singable.sing();
	}
	
}

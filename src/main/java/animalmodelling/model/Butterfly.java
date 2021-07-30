package animalmodelling.model;

import animalmodelling.behavior.Singable;
import animalmodelling.constant.Messages;

public class Butterfly extends Arthropoda implements Singable{

	@Override
	public void fly() {
		System.out.println(Messages.BUTTERFLY_FLYING.getMessage());
	}

	@Override
	public void sing() {
		System.out.println(Messages.BUTTERFLY_SINGING.getMessage());
	}
	
}

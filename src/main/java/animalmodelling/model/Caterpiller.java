package animalmodelling.model;

import animalmodelling.behavior.Metamorphosable;
import animalmodelling.constant.Messages;

public class Caterpiller extends Butterfly implements Metamorphosable<Butterfly> {

	@Override
	public void fly() {
		System.out.println(Messages.CATERPILLER_FLYING.getMessage());
	}

	@Override
	public void walk() {
		System.out.println(Messages.CATERPILLER_WALKING.getMessage());
	}

	@Override
	public Butterfly metamorphosis() {
		return new Butterfly();
	}

}

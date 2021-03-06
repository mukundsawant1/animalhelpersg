package animalmodelling.model;

import animalmodelling.behavior.Singable;
import animalmodelling.constant.Messages;

public class Bird extends Animal implements Singable{

	public void fly() {
		System.out.println(Messages.BIRD_FLYING.getMessage());
	}

	public void sing() {
		System.out.println(Messages.BIRD_SINGING.getMessage());
	}

}

package animalmodelling.model;

import animalmodelling.behavior.Flyable;
import animalmodelling.constant.Messages;

public class Arthropoda extends Animal implements Flyable{

	@Override
	public void fly() {
		System.out.println(Messages.DEFAULT_FLYING.getMessage());
	}
	
}

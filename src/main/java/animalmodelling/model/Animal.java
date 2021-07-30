package animalmodelling.model;

import animalmodelling.behavior.Walkable;
import animalmodelling.constant.Messages;

public class Animal implements Walkable{

	public void walk() {
		System.out.println(Messages.ANIMAL_WALKING.getMessage());
	}

}

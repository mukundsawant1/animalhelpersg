package animalmodelling.model;

import animalmodelling.behavior.Flyable;
import animalmodelling.constant.Messages;

public class Chicken extends Bird implements Flyable{

	@Override
	public void sing() {
		System.out.println(Messages.CHICKEN_SINGING.getMessage());
	}

	public void fly() {
		System.out.println(Messages.CHICKEN_FLYING.getMessage());
	}
	
}

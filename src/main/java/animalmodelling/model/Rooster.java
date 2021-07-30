package animalmodelling.model;

import animalmodelling.constant.Messages;

public class Rooster extends Chicken{
	
	@Override
	public void sing() {
		System.out.println(Messages.ROOSTER_SINGING.getMessage());
	}

}

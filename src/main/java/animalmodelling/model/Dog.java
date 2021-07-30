package animalmodelling.model;

import animalmodelling.constant.Messages;

public class Dog extends Carnivora{

	@Override
	public void sing() {
		System.out.println(Messages.DOG_SINGING.getMessage());
	}
	
}

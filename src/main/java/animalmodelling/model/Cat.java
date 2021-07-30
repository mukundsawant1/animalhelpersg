package animalmodelling.model;

import animalmodelling.constant.Messages;

public class Cat extends Carnivora{

	@Override
	public void sing() {
		System.out.println(Messages.CAT_SINGING.getMessage());
	}
	
}

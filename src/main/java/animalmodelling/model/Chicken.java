package animalmodelling.model;

import animalmodelling.constant.Messages;

public class Chicken extends Bird {

	@Override
	public void sing() {
		System.out.println(Messages.CHICKEN_SINGING.getMessage());
	}

}

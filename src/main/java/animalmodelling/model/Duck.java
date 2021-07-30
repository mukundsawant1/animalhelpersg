package animalmodelling.model;

import animalmodelling.constant.Messages;

public class Duck extends Bird{
	
	@Override
	public void sing() {
		System.out.println(Messages.DUCK_SINGING.getMessage());
	}

}

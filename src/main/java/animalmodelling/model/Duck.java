package animalmodelling.model;

import animalmodelling.behavior.Swimmable;
import animalmodelling.constant.Messages;

public class Duck extends Bird implements Swimmable{
	
	@Override
	public void sing() {
		System.out.println(Messages.DUCK_SINGING.getMessage());
	}

	@Override
	public void swim() {
		System.out.println(Messages.DUCK_SWIMMING.getMessage());
		
	}

}

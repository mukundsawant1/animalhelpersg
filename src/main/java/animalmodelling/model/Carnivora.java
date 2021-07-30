package animalmodelling.model;

import animalmodelling.behavior.Singable;
import animalmodelling.constant.Messages;

public class Carnivora extends Animal implements Singable{

	@Override
	public void sing() {
		System.out.println(Messages.DEFAULT_SINGING);
	}
	
}
package animalmodelling.model;

import animalmodelling.constant.Messages;

public class Dolphin extends Cetaceans {

	@Override
	public void swim() {
		System.out.println(Messages.CETACEANS_SWIMMING.getMessage());
	}

}

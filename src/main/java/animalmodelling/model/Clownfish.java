package animalmodelling.model;

import animalmodelling.behavior.Jokable;
import animalmodelling.constant.Constants;
import animalmodelling.constant.Messages;

public class Clownfish extends Fish implements Jokable {

	public Clownfish() {
		super(Constants.DEFAULT_CLOWNFISH_SIZE, Constants.DEFAULT_CLOWNFISH_COLOR);
	}

	@Override
	public void makejoak() {
		System.out.println(Messages.CLOWNFISH_JOKING.getMessage());
	}

}

package animalmodelling.model;

import animalmodelling.behavior.Singable;
import animalmodelling.behavior.Swimmable;
import animalmodelling.constant.Messages;

public class Fish extends Animal implements Singable,Swimmable{

	@Override
	public void walk() {
		System.out.println(Messages.DEFAULT_WALKING);
	}

	public void sing() {
		System.out.println(Messages.DEFAULT_SINGING);
	}

	public void swim() {
		System.out.println(Messages.DEFAULT_FISH_SWIMMING.getMessage());
	}

}
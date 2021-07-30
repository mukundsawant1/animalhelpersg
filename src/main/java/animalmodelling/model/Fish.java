package animalmodelling.model;

import animalmodelling.behavior.Singable;
import animalmodelling.behavior.Swimmable;
import animalmodelling.constant.Messages;

public class Fish extends Animal implements Singable,Swimmable{

	protected String size,color;
	
	public Fish() {}
	
	public Fish(String size, String color) {
		super();
		this.size = size;
		this.color = color;
	}

	@Override
	public void walk() {
		System.out.println(Messages.FISH_DEFAULT_WALKING);
	}
	
	public void sing() {
		System.out.println(Messages.FISH_DEFAULT_SINGING);
	}
	
	public void swim() {
		System.out.println(Messages.FISH_DEFAULT_SWIMMING);
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getSize() {
		return this.size;
	}
	
}

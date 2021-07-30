package animalmodelling.behavior;

import animalmodelling.model.Fish;

@FunctionalInterface
public interface Eatable {
	public void eat(Fish fish);
}

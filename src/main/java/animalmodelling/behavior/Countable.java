package animalmodelling.behavior;

import java.util.List;

import animalmodelling.model.AnimalCount;

@FunctionalInterface
public interface Countable {
	public List<AnimalCount> getAnimalCount();
}

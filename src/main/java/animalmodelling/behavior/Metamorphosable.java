package animalmodelling.behavior;

import animalmodelling.model.Butterfly;

@FunctionalInterface
public interface Metamorphosable<T extends Butterfly> {
	public T metamorphosis();
}

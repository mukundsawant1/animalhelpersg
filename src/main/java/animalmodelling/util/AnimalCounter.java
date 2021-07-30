package animalmodelling.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import animalmodelling.behavior.Countable;
import animalmodelling.behavior.Flyable;
import animalmodelling.behavior.Singable;
import animalmodelling.behavior.Swimmable;
import animalmodelling.behavior.Walkable;
import animalmodelling.constant.Constants;
import animalmodelling.model.Animal;
import animalmodelling.model.AnimalCount;

public class AnimalCounter implements Countable{

	private Animal[] animals;

	public AnimalCounter(Animal[] animals) {
		this.animals = animals;
	}

	public List<AnimalCount> getAnimalCount() {

		AtomicInteger flyableCount = new AtomicInteger(0);
		AtomicInteger walkableCount = new AtomicInteger(0);
		AtomicInteger singableCount = new AtomicInteger(0);
		AtomicInteger swimmableCount = new AtomicInteger(0);

		Arrays.stream(animals).forEach(animal -> {
			if (animal instanceof Flyable) {
				flyableCount.incrementAndGet();
			}
			if (animal instanceof Walkable) {
				walkableCount.incrementAndGet();
			}
			if (animal instanceof Singable) {
				singableCount.incrementAndGet();
			}
			if (animal instanceof Swimmable) {
				swimmableCount.incrementAndGet();
			}
		});

		return getAnimalCountDto(flyableCount.get(), walkableCount.get(), swimmableCount.get(), singableCount.get());

	}

	public List<AnimalCount> getAnimalCountDto(int flyableCount, int walkableCount, int swimmableCount,
			int singableCount) {

		List<AnimalCount> animalCountList = new ArrayList<AnimalCount>();
		AnimalCount animalCount = new AnimalCount(Constants.FLYING_COUNT, flyableCount);
		animalCountList.add(animalCount);
		animalCount = new AnimalCount(Constants.WALKING_COUNT, walkableCount);
		animalCountList.add(animalCount);
		animalCount = new AnimalCount(Constants.SWIMMING_COUNT, swimmableCount);
		animalCountList.add(animalCount);
		animalCount = new AnimalCount(Constants.SINGING_COUNT, singableCount);
		animalCountList.add(animalCount);

		return animalCountList;

	}

}

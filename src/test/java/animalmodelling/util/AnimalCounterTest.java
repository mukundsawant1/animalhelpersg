package animalmodelling.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import animalmodelling.behavior.Countable;
import animalmodelling.constant.Constants;
import animalmodelling.model.Animal;
import animalmodelling.model.AnimalCount;
import animalmodelling.model.Bird;
import animalmodelling.model.Butterfly;
import animalmodelling.model.Cat;
import animalmodelling.model.Chicken;
import animalmodelling.model.Clownfish;
import animalmodelling.model.Dog;
import animalmodelling.model.Dolphin;
import animalmodelling.model.Duck;
import animalmodelling.model.Fish;
import animalmodelling.model.Parrot;
import animalmodelling.model.Rooster;
import animalmodelling.model.Shark;

public class AnimalCounterTest {

	Countable cnt = null;
	Animal[] animals = null;

	@BeforeEach
	public void init() {
		animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(),
				new Shark(), new Clownfish(), new Dolphin(), new Dog(), new Butterfly(), new Cat() };
		cnt = new AnimalCounter(animals);
	}

	@Test
	public void check_number_of_singing_animals() {
		List<AnimalCount> animalCount = cnt.getAnimalCount();
		animalCount.stream().filter(ac -> ac.getBehaviorType().equalsIgnoreCase(Constants.SINGING_COUNT)).forEach(animalCnt -> {
			assertEquals(animalCnt.getCount(), 11);
		});
	}
	
	@Test
	public void check_number_of_walking_animals() {
		List<AnimalCount> animalCount = cnt.getAnimalCount();
		animalCount.stream().filter(ac -> ac.getBehaviorType().equalsIgnoreCase(Constants.WALKING_COUNT)).filter(ac -> ac.getBehaviorType().equalsIgnoreCase(Constants.WALKING_COUNT)).forEach(animalCnt -> {
			assertEquals(animalCnt.getCount(), 12);
		});
	}
	
	@Test
	public void check_number_of_swimming_animals() {
		List<AnimalCount> animalCount = cnt.getAnimalCount();
		animalCount.stream().filter(ac -> ac.getBehaviorType().equalsIgnoreCase(Constants.SWIMMING_COUNT)).forEach(animalCnt -> {
			assertEquals(animalCnt.getCount(), 5);
		});
	}
	
	@Test
	public void check_number_of_flying_animals() {
		List<AnimalCount> animalCount = cnt.getAnimalCount();
		animalCount.stream().filter(ac -> ac.getBehaviorType().equalsIgnoreCase(Constants.FLYING_COUNT)).forEach(animalCnt -> {
			assertEquals(animalCnt.getCount(), 3);
		});
	}

}

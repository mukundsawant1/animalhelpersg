package animalmodelling.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import animalmodelling.behavior.Eatable;
import animalmodelling.constant.Constants;

public class Shark extends Fish implements Eatable{

	private List<Fish> eatenFishes= null;
	
	public Shark() {
		super(Constants.DEFAULT_SHARK_SIZE, Constants.DEFAULT_SHARK_COLOR);
	}
	
	public void eat(Fish fish) {
		if(Objects.isNull(eatenFishes))
			eatenFishes = new ArrayList<Fish>();
		eatenFishes.add(fish);
	}

	public List<Fish> getEatenFishes() {
		return eatenFishes;
	}

}

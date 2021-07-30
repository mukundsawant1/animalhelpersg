package animalmodelling.model;

public class AnimalCount {

	private String behaviorType;
	private int count;

	public AnimalCount(String behaviorType, int count) {
		this.behaviorType = behaviorType;
		this.count = count;
	}

	public String getBehaviorType() {
		return behaviorType;
	}

	public void setBehaviorType(String behaviorType) {
		this.behaviorType = behaviorType;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

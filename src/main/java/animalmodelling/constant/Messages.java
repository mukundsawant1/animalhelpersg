package animalmodelling.constant;

public enum Messages {

	BIRD_FLYING("I am flying"), BIRD_SINGING("I am singing"),ANIMAL_WALKING("I am walking");

	private String message;

	Messages(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
package animalmodelling.constant;

public enum Messages {

	BIRD_FLYING("I am flying"), BIRD_SINGING("I am singing"),ANIMAL_WALKING("I am walking")
	,DUCK_SINGING("Quack , quack"),DUCK_SWIMMING("I can swim"),CHICKEN_SINGING("Cluck, cluck"),	CHICKEN_FLYING("I cannot fly"),
	ROOSTER_SINGING("Cock-a-doodle-doo");

	private String message;

	Messages(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}

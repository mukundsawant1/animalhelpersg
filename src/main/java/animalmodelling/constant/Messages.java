package animalmodelling.constant;

public enum Messages {

	BIRD_FLYING("I am flying"), BIRD_SINGING("I am singing"),ANIMAL_WALKING("I am walking")
	,DUCK_SINGING("Quack , quack"),DUCK_SWIMMING("I can swim"),CHICKEN_SINGING("Cluck, cluck"),	CHICKEN_FLYING("I cannot fly"),
	ROOSTER_SINGING("Cock-a-doodle-doo"),DOG_SINGING("Woof, woof"),DEFAULT_SINGING(""),CAT_SINGING("Me ow"),
	DEFAULT_WALKING(""),DEFAULT_SWIMMING(""),DEFAULT_FISH_SWIMMING("I can swim");

	private String message;

	Messages(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}

package animalmodelling.constant;

public enum Messages {

	BIRD_FLYING("I am flying"), BIRD_SINGING("I am singing"), ANIMAL_WALKING("I am walking"),
	DUCK_SINGING("Quack , quack"), DUCK_SWIMMING("I can swim"), CHICKEN_SINGING("Cluck, cluck"),
	CHICKEN_FLYING("I cannot fly"), ROOSTER_SINGING("Cock-a-doodle-doo"), DOG_SINGING("Woof, woof"),
	DEFAULT_SINGING(""), CAT_SINGING("Me ow"), DEFAULT_WALKING(""), DEFAULT_SWIMMING(""),
	DEFAULT_FISH_SWIMMING("I can swim"), CLOWNFISH_JOKING("I can make jokes"), FISH_DEFAULT_SINGING("I don't sing"),
	FISH_DEFAULT_WALKING("I don't walk"), FISH_DEFAULT_SWIMMING("I can swim"), CETACEANS_SWIMMING("I can swim"),
	DEFAULT_FLYING(""), BUTTERFLY_FLYING("I am flying"), BUTTERFLY_SINGING("I cannot sing"),CATERPILLER_FLYING("I cannot fly"),
	CATERPILLER_WALKING("I can walk");

	private String message;

	Messages(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}

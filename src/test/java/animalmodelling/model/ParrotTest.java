package animalmodelling.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import animalmodelling.util.StringUtil;

public class ParrotTest {

	private final ByteArrayOutputStream content = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(content));
	}

	@Test
	public void check_if_parrot_living_with_dog_can_sing_a_song_of_dog() {
		new Parrot(new Dog()).sing();
		String res = StringUtil.removeLineEndChars.apply(content.toString());
		assertEquals(res, "Woof, woof");
	}
	
	@Test
	public void check_if_parrot_living_with_cat_can_sing_a_song_of_cat() {
		new Parrot(new Cat()).sing();
		String res = StringUtil.removeLineEndChars.apply(content.toString());
		assertEquals(res, "Me ow");
	}
	
	@Test
	public void check_if_parrot_living_with_rooster_can_sing_a_song_of_rooster() {
		new Parrot(new Rooster()).sing();
		String res = StringUtil.removeLineEndChars.apply(content.toString());
		assertEquals(res, "Cock-a-doodle-doo");
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

}

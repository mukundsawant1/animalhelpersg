package animalmodelling.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import animalmodelling.util.StringUtil;


public class RoosterTest {

	private final ByteArrayOutputStream content = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(content));
	}

	@Test
	public void check_if_rooster_can_sing() {
		new Rooster().sing();
		String res = StringUtil.removeLineEndChars.apply(content.toString());
		assertEquals(res, "Cock-a-doodle-doo");
	}
	
	@Test
	public void check_if_rooster_can_sing_in_german() {
		new Rooster().singInLanguage("GE");
		String res = StringUtil.removeLineEndChars.apply(content.toString());
		assertEquals(new Rooster().singInLanguage("GE"), "kikeriki");
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	
}

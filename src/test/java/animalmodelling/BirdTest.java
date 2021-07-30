package animalmodelling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import animalmodelling.model.Bird;
import animalmodelling.util.StringUtil;

public class BirdTest {

	private final ByteArrayOutputStream content = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(content));
	}

	@Test
	public void check_if_bird_can_sing() {
		new Bird().sing();
		String res = StringUtil.removeLineEndChars.apply(content.toString());
		assertEquals(res, "I am singing");
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

}

package animalmodelling.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import animalmodelling.model.Duck;
import animalmodelling.util.StringUtil;

public class DuckTest {

	private final ByteArrayOutputStream content = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(content));
	}

	@Test
	public void check_if_duck_can_sing() {
		new Duck().sing();
		String res = StringUtil.removeLineEndChars.apply(content.toString());
		assertEquals(res, "Quack , quack");
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

}

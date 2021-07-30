package animalmodelling.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SharkTest {

	@Test
	public void check_if_shark_has_a_grey_color() {
		assertEquals(new Shark().getColor(), "GREY");
	}
	
}

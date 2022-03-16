package week04;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		Square test = new Square();
		int output = test.square(5);
		assertEquals(25, output);
	}

}

package week04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class maxJunit {

	@Test
	void test() {
		MaxTest maxTest = new MaxTest();
		
		int output = maxTest.max(10, 9, 8);
		int output1 = maxTest.max(10, 100, 8);
		assertEquals(10, output);
		assertEquals(100, output1);
	}

}

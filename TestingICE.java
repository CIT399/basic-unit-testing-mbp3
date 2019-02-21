import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingICE {

	@Test
	void testOne() {
		String testStringOne = "(570)323-8600";

		assertEquals(true, Telephone.isFormatted(testStringOne), "isFormatted working incorrectly.");
	}
	
	@Test
	void testTwo() {
		String testStringTwo = "570.323.8600";
		
		assertEquals(false, Telephone.isFormatted(testStringTwo), "isFormatted working incorrectly");
	}
	
	@Test
	void testThree() {
		String testStringThree = "(57 )32 -abcd";
		
		assertEquals(false, Telephone.isFormatted(testStringThree), "isFormatted working incorrectly. Accepts spaces and character input.");
	}

}

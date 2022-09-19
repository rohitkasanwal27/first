package assignm0;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicsTest {

	@Test
	public void largerNumberTest() {
		Basics assignm0 = new Basics();
		assertEquals(2, assignm0.getLargerNumber(1, 2));
		assertEquals(-1, assignm0.getLargerNumber(-1, -3));
		assertEquals(3, assignm0.getLargerNumber(0, 3));
		assertEquals(1,assignm0.getLargerNumber(1, 1));
	}

	@Test
	public void largestNumberTest() {
		Basics assignm0 = new Basics();
		assertEquals(3, assignm0.largestNumber(1, 2, 3));

		assertEquals(3, assignm0.largestNumber(1, 3, 2));

		assertEquals(3, assignm0.largestNumber(2, 1, 3));

		assertEquals(3, assignm0.largestNumber(2, 3, 1));

		assertEquals(3, assignm0.largestNumber(3, 1, 2));

		assertEquals(3, assignm0.largestNumber(3, 2, 1));
		
		assertEquals(4, assignm0.largestNumber(3, 3, 4));
		
		assertEquals(4, assignm0.largestNumber(4, 4, 4));
	}

	@Test
	public void sumOfArrayElementsTest() {

		Basics assignm0 = new Basics();
		assertEquals(10, assignm0.getSumOfArrayElements(new int[] { 0, 1, 2, 3, 4 },5));

		assertEquals(-2, assignm0.getSumOfArrayElements(new int[] { -1, 1, -2 }, 3));
		
	}
	
	@Test
	public void sumOfArrayElementsTest1() {

		Basics assignm0 = new Basics();
		assertEquals(10, assignm0.getSumOfArrayElements1(new int[] { 0, 1, 2, 3, 4 },5));

		assertEquals(-2, assignm0.getSumOfArrayElements1(new int[] { -1, 1, -2 }, 3));
		
	}

	@Test
	public void primeTest() {
		Basics assignm0 = new Basics();

		assertTrue(assignm0.isPrime(5));

		assertFalse(assignm0.isPrime(10));
		
		assertFalse(assignm0.isPrime(0));

		assertFalse(assignm0.isPrime(1));
		
		assertTrue(assignm0.isPrime(2));


	}

	@Test
	public void numbersInARangeTest() {
		Basics assignm0 = new Basics();
		assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 8, 9 },

		assignm0.getArrayOfRangeOfNumbers(3, 9));
		
		assertArrayEquals(new int[] { 9, 8, 7, 6 },

		assignm0.getArrayOfRangeOfNumbers(9, 6));
		
		assertArrayEquals(new int[] { 19 },

		assignm0.getArrayOfRangeOfNumbers(19, 19));

		assertArrayEquals(new int[] { -3, -2, -1 },

		assignm0.getArrayOfRangeOfNumbers(-3, -1));

		assertArrayEquals(new int[] { -3, -2, -1, 0, 1 },

		assignm0.getArrayOfRangeOfNumbers(-3, 1));
	}

	@Test
	public void primeNumbersInARangeTest() {
		Basics assignm0 = new Basics();
		assertArrayEquals(new int[] { 2, 3, 5, 7 }, assignm0.primeNumbersInARange( 0,9));

		assertArrayEquals(new int[] { 3, 5, 7 }, assignm0.primeNumbersInARange( 3,9));
		
		assertArrayEquals(new int[] {},assignm0.primeNumbersInARange(-5, 1));
		
		assertArrayEquals(new int[] {2,3,5,7,11},assignm0.primeNumbersInARange(-5, 11));
		
		assertArrayEquals(new int[] {},assignm0.primeNumbersInARange(-5, -3));
		
		
	}

	@Test
	public void sumTest() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.getSum(3, 9));

		assertEquals(6, assignm0.getSum(-3, 9));

		assertEquals(-12, assignm0.getSum(-3, -9));
	}

	@Test
	public void reverseDigitsTest() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.reverseDigits(21));

		assertEquals(4321, assignm0.reverseDigits(1234));
		
		assertEquals(4, assignm0.reverseDigits(40));
	}
	
	@Test
	public void reverseDigitsTest1() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.reverseDigits1(21,0));

		assertEquals(4321, assignm0.reverseDigits1(1234,0));
		
		assertEquals(4, assignm0.reverseDigits1(40,0));
	}
	
	@Test
	public void reverseDigitsTest2() {
		Basics assignm0 = new Basics();
		assertEquals(12, assignm0.reverseDigits2(21));

		assertEquals(4321, assignm0.reverseDigits2(1234));
		
		//assertEquals(4, assignm0.reverseDigits2(40));
	}
	
//	 @Test 
//	 	public void helloWorldTest() { 
//		 Basics assignm0 = new Basics();
//		 assertEquals("HelloWorld", assignm0.printHelloWorld());
//	 }


	@Test
	public void factorialTest() {
		Basics ass0 = new Basics();
		assertEquals(6, ass0.getFactorial(3));
		
		assertEquals(1, ass0.getFactorial(0));

        assertEquals(1, ass0.getFactorial(1));
        
        assertEquals(-1, ass0.getFactorial(-1));
	}
	@Test
	public void getFactorialWithoutLoop() {
		Basics ass0 = new Basics();
		assertEquals(6, ass0.getFactorialWithoutLoop(3));
		
		assertEquals(1, ass0.getFactorialWithoutLoop(0));

        assertEquals(1, ass0.getFactorialWithoutLoop(1));
        
        assertEquals(-1, ass0.getFactorial(-1));
		
	}
	@Test
	public void testFindNumberOfOccurences(){
		Basics ass0 = new Basics();
		assertEquals(3, ass0.findNumberOfOccurences(new int[]{1, 1, 1}, 1));

		assertEquals(2, ass0.findNumberOfOccurences(new int[]{1, 2, 1}, 1));
		assertEquals(1, ass0.findNumberOfOccurences(new int[]{1, 2, 3}, 1));
		assertEquals(0, ass0.findNumberOfOccurences(new int[]{2, 3, 4}, 1));

	}
	
	@Test
	public void testFindFirstOccurence(){
		Basics ass0 = new Basics();
		
		assertEquals(-1, ass0.findFirstOccurence(new int[]{2, 2, 2}, 1));
		assertEquals(0, ass0.findFirstOccurence(new int[]{1, 1, 1}, 1));
		assertEquals(2, ass0.findFirstOccurence(new int[]{2, 2, 1}, 1));


		
	}
	//add more test case
	
	@Test
	public void testGetNumberLessThanTenInWords(){
		Basics ass0 = new Basics();
		assertEquals("one", ass0.getNumberLessThanTenInWords(1).toLowerCase());
		assertEquals("four", ass0.getNumberLessThanTenInWords(4).toLowerCase());
		assertEquals("please fill number less than 10", ass0.getNumberLessThanTenInWords(11).toLowerCase());
		assertEquals("eight", ass0.getNumberLessThanTenInWords(8).toLowerCase());
		
	}
	@Test
	public void testGetNumberInWords(){
		Basics ass0 = new Basics();
		assertEquals("thirty four", ass0.getNumberInWords(34).toLowerCase());
		assertEquals("-thirty four", ass0.getNumberInWords(-34).toLowerCase());
		assertEquals("two hundred and thirty four", ass0.getNumberInWords(234).toLowerCase());
		assertEquals("one thousand two hundred and thirty four", ass0.getNumberInWords(1234).toLowerCase());
		assertEquals("forty five thousand six hundred and fifty two", ass0.getNumberInWords(45652).toLowerCase());

		assertEquals("two hundred and nine", ass0.getNumberInWords(209).toLowerCase());
		assertEquals("one thousand and five", ass0.getNumberInWords(1005).toLowerCase());
		assertEquals("thirty five thousand seven hundred and four", ass0.getNumberInWords(35704).toLowerCase());

		assertEquals("five hundred and fifty thousand four hundred and ninety two", ass0.getNumberInWords(550492).toLowerCase());

	}
	
	@Test
	public void testRombus() {
		Basics ass0 = new Basics();
		assertArrayEquals(new String [][] { {" ","*"," "},{"*"," ","*"},
			{" ","*"," "}}
		, ass0. printRhombus1(1));
		
		assertArrayEquals(new String [][] { {" "," ","*"," "," "},{" ","*"," ","*"," "},
			{"*"," "," "," ","*"},{	" ","*"," ","*"," "},{" "," ","*"," "," "}}
		, ass0. printRhombus1(2));
		
		assertArrayEquals(new String [][] {}
		, ass0.printRhombus1(0));
		
		assertArrayEquals(new String [][] {}
		, ass0.printRhombus1(-5));
	}
	
	@Test
	public void testTriangle() {
		Basics ass0 = new Basics();
		assertArrayEquals(new String [][] { {"*"," "," "},{"*","*"," "},
			{"*"," ","*"},{"*","*"," "},{"*"," "," "}}
		, ass0.printTrianglePointingRight1(4));
		
		assertArrayEquals(new String [][] { {"*"," "},{"*","*"},
			{"*"," "}}
		, ass0.printTrianglePointingRight1(2));
		
		assertArrayEquals(new String [][] {}
		, ass0.printTrianglePointingRight1(3));
		
		assertArrayEquals(new String [][] {}
		, ass0.printTrianglePointingRight1(0));
		
		assertArrayEquals(new String [][] {}
		, ass0.printTrianglePointingRight1(-5));
	}
}


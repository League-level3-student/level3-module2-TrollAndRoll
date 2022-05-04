package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

	/*
	 * A minimum of 3 tests are required for each method
	 */

	@Test
	public void testLinearSearch() {
		// 1. Use the assertEquals() method to test your linear search method
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		assertEquals(3, _02_BinarySearch.binarySearch(arr, 0, arr.length, 4));// Q: In what slot is the value 4? A: 3
		assertEquals(4, _02_BinarySearch.binarySearch(arr, 0, arr.length, 5));// Q: In what slot is the value 5? A: 4
		assertEquals(0, _02_BinarySearch.binarySearch(arr, 0, arr.length, 1));// Q: In what slot is the value 1? A: 0
	}

	@Test
	public void testBinarySearch() {
		// 2. Use the assertEquals() method to test your binary search method
		// remember that the array must be sorted
		String[] arr = {"a", "b", "c", "d", "e"};
		
		assertEquals(0, _01_LinearSearch.linearSearch(arr, "a"));// Q: In what slot is the the letter "a"? A: 0
		assertEquals(1, _01_LinearSearch.linearSearch(arr, "b"));// Q: In what slot is the the letter "b"? A: 1
		assertEquals(2, _01_LinearSearch.linearSearch(arr, "c"));// Q: In what slot is the the letter "c"? A: 2
	}
}

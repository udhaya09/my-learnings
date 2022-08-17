package io.mylearnings;

import io.mylearnings.algo.utils.InfiniteSortedArray;

public class DefaultRunner {
	
	
	
	
	public static void main(String[] args) {
		
		int[] sortedArray = { 2, 4, 6, 9, 12, 16, 20, 25, 30, 36, 42, 49, 56, 63, 72, 80, 88 };
		
		InfiniteSortedArray infiniteSortedArray = new InfiniteSortedArray();
		infiniteSortedArray.checkElementExists(sortedArray, 88);
		
	}

}

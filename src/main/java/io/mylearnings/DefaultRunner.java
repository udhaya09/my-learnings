package io.mylearnings;

import io.mylearnings.algo.programs.InfiniteSortedArray;
import io.mylearnings.algo.programs.PeakArray;

public class DefaultRunner {

	public static void main(String[] args) {

		int[] sortedArray = { 2, 4, 6, 9, 12, 16, 20, 25, 30, 36, 42, 49, 56, 63, 72, 80, 88 };

		int[] mountainArray = { 1, 2, 3, 5, 6, 4, 3, 2 };

		// InfiniteSortedArray infiniteSortedArray = new InfiniteSortedArray();
		// infiniteSortedArray.checkElementExists(sortedArray, 88);

		
		PeakArray peakArray = new PeakArray();
		peakArray.findPeekElementIndex(mountainArray);
		
	}

}

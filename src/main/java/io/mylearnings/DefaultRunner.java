package io.mylearnings;

import io.mylearnings.algo.programs.InfiniteSortedArray;
import io.mylearnings.algo.programs.MountainArray;
import io.mylearnings.algo.programs.RotatedArray;
import io.mylearnings.algo.programs.SearchMountainArray;

public class DefaultRunner {

	public static void main(String[] args) {

		int[] sortedArray = { 2, 4, 6, 9, 12, 16, 20, 25, 30, 36, 42, 49, 56, 63, 72, 80, 88 };

		int[] reverseSortedArray = { 88, 80, 72, 63, 56, 49, 42, 36, 30, 25, 20, 16, 12, 9, 6, 4, 2 };

		int[] mountainArray = { 1, 3, 5, 6, 4, 3, 2 };

		int[] rotatedArray = { 1,3,5 };

		int target = 0;

		// InfiniteSortedArray infiniteSortedArray = new InfiniteSortedArray();
		// infiniteSortedArray.checkElementExists(sortedArray, 88);

		// MountainArray mntnArray = new MountainArray();
		// mntnArray.findPeekElementIndex(mountainArray);

		// SearchMountainArray searchMountainArray = new SearchMountainArray();
		// searchMountainArray.searchTarget(mountainArray, target);
		
		RotatedArray rotatedArrayService = new RotatedArray();
		rotatedArrayService.findTargetExist(rotatedArray, target);

	}

}

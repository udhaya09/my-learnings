package io.mylearnings.algo.programs;

import io.mylearnings.algo.utils.BinarySearchImpl;
import io.mylearnings.algo.utils.BinarySearchable;

public class InfiniteSortedArray {

	public int findANumber(int[] arr, int target) {

		BinarySearchable searchable = new BinarySearchImpl();
		
		int result = -1;

		int start = 0;
		int end = 1;

		try {
			while (target > arr[end]) {
				start = end + 1;
				end = (start * 2) + 1;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			end = arr.length - 1;
		}

		result = searchable.findIndex(arr, target, start, end);

		return result;
	}

	public void checkElementExists(int[] arr, int target) {
		
		int index = findANumber(arr, target);

		if (index >= 0) {
			System.out.println("Element found at the index: " + index);
		} else {
			System.out.println("Element not found in the given array.");
		}
		
	}

}

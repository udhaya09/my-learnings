package io.mylearnings.algo.programs;

import io.mylearnings.algo.utils.BinarySearchImpl;
import io.mylearnings.algo.utils.BinarySearchable;
import io.mylearnings.algo.utils.SearchUtil;

public class RotatedArray extends SearchUtil {

	public void findTargetExist(int[] arr, int target) {

		int index = -1;

		
		int	pivot = findPivot(arr);
		

		BinarySearchable searchable = new BinarySearchImpl();
		int start = 0;
		int end = pivot;

		int firstTry = searchable.findIndexInOrderAgnostic(arr, target, start, end);

		if (firstTry != -1) {
			index = firstTry;
		} else {
			start = pivot + 1;
			end = arr.length - 1;
			index = searchable.findIndexInOrderAgnostic(arr, target, start, end);
		}

		if (index >= 0) {
			System.out.println("Element found at the index: " + index);
		} else {
			System.out.println("Element not found in the given array.");
		}

	}

	private int findPivot(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		int mid = 0;

		int pivot = 0;

		while (start <= end) {

			mid = findMid(start, end);

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			} 
			
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			
			if (arr[start] <= arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return pivot;
	}

}

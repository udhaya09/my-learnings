package io.mylearnings.algo.utils;

public class BinarySearchImpl implements Searchable {

	public int findIndex(int[] arr, int target, int start, int end) {
		int mid = 0;
		int result = -1;

		while (start <= end) {

			mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			} else if (target >= arr[mid]) {
				start = mid + 1;
			} else if (target <= arr[mid]) {
				end = mid - 1;
			}

		}

		return result;
	}

}

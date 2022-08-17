package io.mylearnings.algo.utils;

public class BinarySearchImpl implements BinarySearchable {

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

	public int findPeekElementIndex(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		int mid = 0;

		while (start != end) {

			mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			}

		}

		return start;
	}

}

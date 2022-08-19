package io.mylearnings.algo.programs;

import io.mylearnings.algo.utils.BinarySearchImpl;
import io.mylearnings.algo.utils.BinarySearchable;
import io.mylearnings.algo.utils.SearchUtil;

public class RotatedArray extends SearchUtil {

	public void findTargetExist(int[] arr, int target) {

		int index = findIndex(arr, target);

		if (index > 0) {
			System.out.println("Element found in the index: " + index);
		} else {
			System.out.println("Element not found in the given array.");
		}
	}

	private int findIndex(int[] arr, int target) {


		int start = 0;
		int end = arr.length - 1;
		
		BinarySearchable searchable = new BinarySearchImpl();

		// first we are finding the pivot
		int pivot = findPivot(arr);		
        
        // System.out.println(pivot);
		
		// case 1 - array is not rotated or rotated at length - 1 times 
			// if pivot is -1 means array is not rotated
			// which means it is normal sorted array
			// then we can execute find the number from sorted array using binary search as usual
		if(pivot == -1) {
			return searchable.findIndex(arr, target, start, end);
		}
        
        // case 2 - pivot element is the target
			// if pivot element is the target means just return the pivot index
		if(arr[pivot] == target) {
			return pivot;
		}
		
		// case 3 - searching from start element to pivot - 1 element
			// why - because we know pivot element is not target -- so, till pivot - 1
			// we confirmed array is rotated, which means we need to find target in rotated array
			// target is greater than start element, so, from start element till pivot - 1 it is a sorted array
		if(target >= arr[0]) {			
			return searchable.findIndex(arr, target, start, pivot-1);
		}
		
		// case 4 - search from pivot + 1 element to end element
			// because - we know the above three cases like
			// 2 - pivot element is not target
			// 1 - array is rotated
			// 3 - element not found between start element to pivot - 1 element 
		return searchable.findIndex(arr, target, pivot + 1, end);

	}

	private int findPivot(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		int mid = 0;

		while (start <= end) {

			mid = start + (end - start) / 2;

			// case 1 - will return o/p when condition passed
			// checking mid element is greater than mid + 1 element
			// if above condition true means, mid element will be the pivot. so, we can
			// return it
			// whenever we are checking mid+1 or mid-1 in the array,
			// we must check the value is between start and end to avoid
			// ArrayIndexOutOfBound exception
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}

			// case 2 - will return o/p when condition passed
			// checking mid element is smaller than the mid-1 element
			// if above condition true means, mid-1 element will be the pivot. so, we can
			// return it
			// whenever we are checking mid+1 or mid-1 in the array,
			// we must check the value is between start and end to avoid
			// ArrayIndexOutOfBound exception
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			// case 3 - will not return any output, instead changing the assignment for
			// start to iterate further
			// if start element is less than mid element and not caught in case 1 & 2 means,
			// then the biggest / pivot element must be lie in the right side of mid element
			// so, narrow down the search to right side by changing start = mid + 1
			if (arr[start] <= arr[mid]) {
				start = mid + 1;
			}
			// case 4 - will not return any output, instead changing the assignment for end
			// to iterate further
			// if start element is greater than mid element and not caught in case 1 & 2
			// means,
			// then the biggest / pivot element must be lie in the left side of mid element
			// so, narrow down the search to left side by changing end = mid - 1
			else {
				end = mid - 1;
			}

		}

		// this will execute when array is not rotated and there no pivot is found
		return -1;
	}

}

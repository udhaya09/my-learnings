package io.mylearnings.algo.utils;

public interface BinarySearchable {

	int findIndex(int[] arr, int target, int start, int end);
	
	int findPeekElementIndex(int[] arr);
	
	int findIndexInOrderAgnostic(int[] arr, int target, int start, int end);
	
}

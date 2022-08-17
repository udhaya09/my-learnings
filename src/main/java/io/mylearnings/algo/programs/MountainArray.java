package io.mylearnings.algo.programs;

import io.mylearnings.algo.utils.BinarySearchImpl;
import io.mylearnings.algo.utils.BinarySearchable;

/*
 * Leetcode problem: https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * 
 * Pattern: Binary search
 * 
 * Tricky is: no target, sorted in two halves where 1st one is ascending and followed by descending set
 * 
 * Solution logic: 
 * 		- 1: 
 * 			Element at mid > mid+1 means we are at decreasing part or second half.
 * 			Then answer might be mid element or at left side of the mid element.
 * 			Now we can change end as middle to change the range bound as start to middle.
 * 		- 2:
 * 			Element at mid < mid+1 means we are at increasing part or first half.
 * 			Then answer might be mid element or at right side of the mid element. 
 * 			Now we can change start as mid + 1.
 * 			Why here mid+1 means, we are going to find greatest element of the array.
 * 			we know mid is smaller than mid+1, then no use considering mid in our range bound
 * 		- 3:
 * 			When we need to terminate loop?
 * 			When both start and end equals to each other. 	 
 * 			Because both start and end trying to find max of the array
 * 			when they pointing to each other means, that element is the max and that is the answer
 *  
 * 
 * 
 * */

public class MountainArray {

	public void findPeekElementIndex(int[] arr) {

		BinarySearchable searchable = new BinarySearchImpl();
		int index = searchable.findPeekElementIndex(arr);

		System.out.println("Peek element is at index: " + index);

	}

}

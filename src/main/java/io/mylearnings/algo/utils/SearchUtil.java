package io.mylearnings.algo.utils;

public abstract class SearchUtil {

	public abstract void findTargetExist(int[] arr, int target);

	public int findMid(int start, int end) {
		return (start + (end - start) / 2);
	}

}

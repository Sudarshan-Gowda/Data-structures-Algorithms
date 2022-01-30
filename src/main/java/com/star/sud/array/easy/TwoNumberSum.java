package com.star.sud.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

	// time - O(n) | space - O(1)
	public static int[] twoNumberSum(int[] array, int targetSum) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {

			int sumToCheck = targetSum - array[i];
			if (map.containsKey(sumToCheck)) {
				return new int[] { array[i], sumToCheck };
			} else {
				map.put(array[i], -1);
			}
		}

		return new int[0];
	}

	public static void main(String[] args) {
		int[] array = { 3, 5, -4, 8, 11, 1, -1, 6, 4 };
		int targetSum = 10;
		int[] twoNumberSum = twoNumberSum(array, targetSum);
		System.out.println(Arrays.toString(twoNumberSum));
	}

}

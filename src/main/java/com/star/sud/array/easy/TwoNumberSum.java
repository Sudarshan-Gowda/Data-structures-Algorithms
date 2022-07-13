package com.star.sud.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoNumberSum {

	// time - O(n) | space - O(1)
	public static List<int[]> twoNumberSum(int[] array, int targetSum) {

		Map<Integer, Integer> map = new HashMap<>();
		List<int[]> results = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {

			int sumToCheck = targetSum - array[i];
			if (map.containsKey(sumToCheck)) {
				int[] result = { array[i], sumToCheck };
				results.add(result);
			} else {
				map.put(array[i], -1);
			}
		}

		return results;
	}

	public static void main(String[] args) {
		// int[] array = { 3, 5, -4, 8, 11, 1, -1, 6, 4 };
		int[] array = { 2, 5, 6, 7, 1, 3 };
		int targetSum = 8;
		List<int[]> twoNumberSum = twoNumberSum(array, targetSum);
		twoNumberSum.forEach(element -> {
			System.out.println(Arrays.toString(element));
		});
	}

}

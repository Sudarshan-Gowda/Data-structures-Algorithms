package com.star.sud.other.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoNumberSum {

	public static void main(String[] args) {

		int[] input = { 5, 2, 3, 6, 1, 7 };

		List<int[]> twoNumberSum = twoNumberSum(input, 8);
		twoNumberSum.forEach(a -> {
			String string = Arrays.toString(a);
			System.out.println(string);
		});

	}

	public static List<int[]> twoNumberSum(int[] input, int targetSum) {

		Set<Integer> store = new HashSet<>();
		List<int[]> result = new ArrayList<>();

		for (int number : input) {
			int numberToCheck = targetSum - number;
			int[] elements = { numberToCheck, number };
			if (store.contains(numberToCheck)) {
				result.add(elements);
			} else {
				store.add(number);
			}
		}

		return result;
	}

}

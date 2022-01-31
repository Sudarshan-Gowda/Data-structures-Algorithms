package com.star.sud.array.easy;

import java.util.Arrays;

public class SortedSquaredArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 5, 6, 8, 9 };
		int[] sortedSquaredArray = sortedSquaredArray_02(array);
		System.out.println(Arrays.toString(sortedSquaredArray));

	}

	// time - O(nlogn) and space - O(n)
	public static int[] sortedSquaredArray(int[] array) {

		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			int num = array[i] * array[i];
			result[i] = num;
		}

		Arrays.sort(result);
		return result;

	}

	public static int[] sortedSquaredArray_02(int[] array) {

		int[] result = new int[array.length];

		int smallerIdx = 0;
		int largerIdx = array.length - 1;

		for (int i = array.length - 1; i >= 0; i--) {

			int smallerVal = array[smallerIdx];
			int largerVal = array[largerIdx];

			if (Math.abs(smallerVal) > Math.abs(largerVal)) {
				result[i] = smallerVal * smallerVal;
				smallerIdx++;

			} else {
				result[i] = largerVal * largerVal;
				largerIdx--;
			}

		}

		return result;

	}

}

package com.star.sud.array;

import java.util.Arrays;
import java.util.List;

public class ValidateSubSequence {

	// time - O(n) | space - O(1)
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

		int seqIdx = 0;

		for (Integer arrElement : array) {

			if (seqIdx == sequence.size())
				break;

			if (sequence.get(seqIdx).equals(arrElement))
				seqIdx++;

		}

		return seqIdx == sequence.size();
	}

	public static void main(String[] args) {

		List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
		List<Integer> sequence = Arrays.asList(1, 6, -1, 10);

		boolean validSubsequence = isValidSubsequence(array, sequence);
		System.out.println(validSubsequence);

	}

}

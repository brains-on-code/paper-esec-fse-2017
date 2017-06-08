package com.fmri.words;

/**
 * This class contains source code snippets to calculate how many of the same
 * characters are at the same position in two strings.
 * Used tool for the scrambling (A=2, b=0):
 * http://rumkin.com/tools/cipher/affine.php
 */
public class CountSameCharsAtSamePosition {

	// original/clean code
	public int countSameCharsAtSamePositionTD(String word1, String word2) {
		int shortestLength;

		if (word1.length() < word2.length())
			shortestLength = word1.length();
		else
			shortestLength = word2.length();

		int sameCharsAtSamePosition = 0;

		for (int i = 0; i < shortestLength; i++) {
			if (word1.charAt(i) == word2.charAt(i)) {
				sameCharsAtSamePosition++;
			}
		}

		return sameCharsAtSamePosition;
	}

	// bottom-up countSameCharsAtSamePosition
	public int purple(String string1, String string2) {
		int length;

		if (string1.length() < string2.length())
			length = string1.length();
		else
			length = string2.length();

		int counter = 0;

		for (int i = 0; i < length; i++) {
			if (string1.charAt(i) == string2.charAt(i)) {
				counter++;
			}
		}

		return counter;
	}

	// syntax
	// missing closing bracket at word1.charAt(i
	// : instead of ; at the sameCharsAtSamePosition init
	// incorrect then at the end of the second if condition
	/*
	public int countSameCharsAtSamePositionTD(String word1, String word2) {
		int shortestLength;

		if (word1.length() < word2.length())
			shortestLength = word1.length();
		else
			shortestLength = word2.length();

		int sameCharsAtSamePosition = 0:

		for (int i = 0; i < shortestLength; i++) {
			if (word1.charAt(i == word2.charAt(i)) then
				sameCharsAtSamePosition++;
		}

		return sameCharsAtSamePosition;
	}
	*/
}

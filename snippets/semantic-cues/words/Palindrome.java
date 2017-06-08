package com.fmri.words;

/**
 * This class contains source code snippets to check if a word is a palindrome.
 * Used tool for the scrambling (A=16, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class Palindrome {

    // original/clean code
    public boolean isPalindromeTD(String word) {
        boolean isPalindrome = true;

        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    // bottom-up isPalindromeBU
    public boolean darkgreen(String input) {
        boolean result = true;

        for (int i = 0, j = input.length() - 1; i < input.length() / 2; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                result = false;
                break;
            }
        }

        return result;
    }

    // syntax
    // bool init with "true" instead of true
    // stop instead of break;
    // isPalindrome = 0; instead of = false;
    /*
    public boolean isPalindromeTD(String word) {
        boolean isPalindrome = "true";

        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = 0;
                stop;
            }
        }

        return isPalindrome;
    }
    */
}

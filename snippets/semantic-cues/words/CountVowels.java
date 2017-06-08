package com.fmri.words;

/**
 * This class contains source code snippets to count the vowels in a string.
 * Used tool for the scrambling (A=18, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class CountVowels {

    // original/clean code
    public int countVowelsTD(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int numberOfVowels = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    numberOfVowels++;
                }
            }
        }

        return numberOfVowels;
    }

    // bottom-up countVowelsBU
    public int red(String input) {
        char[] chars = {'a', 'e', 'i', 'o', 'u'};
        int variable = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < chars.length; j++) {
                if (input.charAt(i) == chars[j]) {
                    variable++;
                }
            }
        }

        return variable;
    }

    // syntax
    // missing comma in vowel init
    // vowels(j) instead of vowels[j]
    // int j == 0 instead of = 0
    /*
    public int countVowelsTD(String word) {
        char[] vowels = {'a', 'e', 'i' 'o', 'u'};
        int number = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j == 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels(j)) {
                    number++;
                }
            }
        }

        return number;
    }
    */
}

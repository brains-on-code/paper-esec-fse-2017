package com.fmri.words;

/**
 * This class contains source code snippets to check whether a substring is contained in a word.
 * Used tool for the scrambling (A=15, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class ContainsSubstring {

    // original, clean code
    public boolean containsSubstring(String word, String substring) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < substring.length(); j++) {
                if (i + j >= word.length())
                    break;
                if (word.charAt(i + j) != substring.charAt(j)) {
                    break;
                } else {
                    if (j == substring.length() - 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // bottom-up containsSubstringBU
    public boolean shadow(String word1, String word2) {
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (i + j >= word1.length())
                    break;
                if (word1.charAt(i + j) != word2.charAt(j)) {
                    break;
                } else {
                    if (j == word2.length() - 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // syntax
    // missing commma between parameters
    // second for loop has a { instead of (
    // = instead of == at j == substring check
    /*
    public boolean containsSubstring(String word String substring) {
        for (int i = 0; i < word.length(); i++) {
            for {int j = 0; j < substring.length(); j++) {
                if (i + j >= word.length())
                    break;
                if (word.charAt(i + j) != substring.charAt(j)) {
                    break;
                } else {
                    if (j = substring.length() - 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
    */
}

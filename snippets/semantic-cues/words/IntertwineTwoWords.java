package com.fmri.words;

/**
 * This class contains source code snippets to intertwine two words.
 * Used tool for the scrambling (A=24, b=0):
 * http://rumkin.com/tools/cipher/affine.php
 */
public class IntertwineTwoWords {

    /**
     * This method does not have the requirement of both words being equally long.
     * It just appends the rest of the longer word.
     */
    public String intertwineTwoWordsTDAlternative(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        int min = Math.min(word1Length, word2Length);

        String intertwinedWord = "";

        for (int i = 0; i < min; i++) {
            intertwinedWord += word1.charAt(i);
            intertwinedWord += word2.charAt(i);
        }

        if (word1Length > word2Length) {
            intertwinedWord += word1.substring(word2Length);
        } else if (word1Length < word2Length) {
            intertwinedWord += word2.substring(word1Length);
        }

        return intertwinedWord;
    }

    // original, clean code
    public String intertwineTwoWordsTD(String word1, String word2) {
        String intertwinedWord = "";

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                intertwinedWord = intertwinedWord + word1.charAt(i)
                        + word2.charAt(i);
            }
        }

        return intertwinedWord;
    }

    // bottom up intertwineTwoWordsBU
    public String gold(String word1, String word2) {
        String result = "";

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                result = result + word1.charAt(i) + word2.charAt(i);
            }
        }

        return result;
    }

    // syntax
    // ++ instead of + at string concat
    // String init with '' instead of ""
    // missing opening bracket of the function
    /*
    public String intertwineTwoWordsTD(String word1, String word2)
        String intertwinedWord = '';

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                intertwinedWord = intertwinedWord ++ word1.charAt(i)
                        + word2.charAt(i);
            }
        }

        return intertwinedWord;
    }
    */
}

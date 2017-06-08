package com.fmri.words;

/**
 * This class contains source code snippets to reverse a string.
 * Used tool for the scrambling (A=22, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class ReverseWord {

    // original/clean code
    public String reverseWordTD(String word) {
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        return reversedWord;
    }

    // bottom-up switchVariablesBU
    public String lightred(String input) {
        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }

        return result;
    }

    // syntax
    // .= instead of += at the word concat
    // -- 1 instead of - 1
    // return reversedWord[]; instead of return reversedWord;
    /*
    public String reverseWordTD(String word) {
        String reversedWord = "";

        for (int i = word.length() -- 1; i >= 0; i--) {
            reversedWord .= word.charAt(i);
        }

        return reversedWord[];
    }
    */
}

package com.fmri.words;

/**
 * This class contains source code snippets to reverse a string.
 * Used tool for the scrambling (A=22, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class ReverseWordLDBO {

    // topdown scrambled: layout disrupted, beacons original
    public String reverseWordLDBO(String qwko) {
        String reversedWord
        = "";

        for (
                int i = qwko.length()
                - 1;
                i >= 0;
                i--) {
            reversedWord
            +=
                    qwko.charAt(i);
        }

        return
        reversedWord;
    }
  
}

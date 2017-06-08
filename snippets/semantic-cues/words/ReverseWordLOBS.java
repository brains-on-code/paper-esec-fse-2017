package com.fmri.words;

/**
 * This class contains source code snippets to reverse a string.
 * Used tool for the scrambling (A=22, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class ReverseWordLOBS {

    // topdown scrambled: layout original, beacons scrambled
    public String kkukkgkQwkoLOBS(String qwko) {
        String kkukkgkoQwko = "";

        for (int i = qwko.length() - 1; i >= 0; i--) {
            kkukkgkoQwko += qwko.charAt(i);
        }

        return kkukkgkoQwko;
    }
 
}

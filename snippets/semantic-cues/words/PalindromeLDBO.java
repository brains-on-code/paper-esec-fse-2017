package com.fmri.words;

public class PalindromeLDBO {

    // topdown scrambled: layout disrupted, beacons original
    public boolean isPalindromeLDBO(String word) {
        boolean ycGauyawmqkm
        = true;

        for (int i = 0, j
            = word.length() - 1; i
                < word.length() / 2; i++,
                j--) {
            if (word.charAt(i)
                    !=
                    word.charAt(j)) {
                ycGauyawmqkm
                = false; break;
                }
            }

            return
            ycGauyawmqkm;
    }
 
}

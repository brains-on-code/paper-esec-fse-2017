package com.fmri.words;

public class PalindromeLDBS {

    // topdown scrambled: layout disrupted, beacons scrambled
    public boolean ycGauyawmqkmLDBS(String oqmw) {
        boolean ycGauyawmqkm
                = true;

        for (int i = 0, j
             = oqmw.length() - 1; i
                     < oqmw.length() / 2; i++,
                     j--) {
            if (oqmw.charAt(i)
                    !=
                    oqmw.charAt(j)) {
                ycGauyawmqkm
                        = false; break;
            }
        }

        return
                ycGauyawmqkm;
    }

}

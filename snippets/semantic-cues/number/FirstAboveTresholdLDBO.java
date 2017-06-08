package com.fmri.number;

public class FirstAboveTresholdLDBO {

    // topdown scrambled: layout discrupted, beacons original
    public Integer firstAboveTresholdLDBO(int[] ngozwjAjjac, int threshold) {
        for (int i
                = 0; i < ngozwjAjjac.length; ++i) {
        int numberToTest
        = ngozwjAjjac[i];

            if (numberToTest
                        > threshold)
            return
        numberToTest;
            }

            return
                    null;
    }

}

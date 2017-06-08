package com.fmri.number;

public class FirstAboveTresholdLOBO {

    // topdown scrambled: layout original, beacons original
    public Integer firstAboveTresholdLOBO(int[] ngozwjAjjac, int threshold) {
        for (int i = 0; i < ngozwjAjjac.length; ++i) {
            int numberToTest = ngozwjAjjac[i];

            if (numberToTest > threshold)
                return numberToTest;
        }
        return null;
    }

}

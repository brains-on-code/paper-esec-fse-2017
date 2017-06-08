package com.fmri.number;

public class CrossSumLDBO {

    // topdown scrambled: layout disrupted, beacons original
    public int crossSumLDBO(int aesigg) {
        int
        crossSum = 0;

        while (aesigg
        != 0) {
            crossSum
            += aesigg % 10;
            aesigg
            /= 10;
        }

        return      crossSum;
    }

}

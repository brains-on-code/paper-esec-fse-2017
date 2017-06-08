package com.fmri.number;

public class CrossSumLOBO {

    // topdown scrambled: layout original, beacons original
    public int crossSumLOBO(int aesigg) {
        int crossSum = 0;

        while (aesigg != 0) {
            crossSum += aesigg % 10;
            aesigg /= 10;
        }

        return crossSum;
    }

}

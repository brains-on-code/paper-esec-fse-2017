package com.fmri.number;

public class CrossSumLOBS {

    // topdown scrambled: layout original, beacons scrambled
    public int qgiooOesLOBS(int aesigg) {
        int qgiooOes = 0;

        while (aesigg != 0) {
            qgiooOes += aesigg % 10;
            aesigg /= 10;
        }

        return qgiooOes;
    }

}

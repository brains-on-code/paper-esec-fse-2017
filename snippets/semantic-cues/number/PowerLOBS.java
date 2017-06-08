package com.fmri.number;

public class PowerLOBS {

    // topdown scrambled: layout original, beacons scrambled
    public int buycpLOBS(int hawc, int cfbuncnd) {
        int bpuvkod = hawc;
        if (cfbuncnd == 0)
            return 1;

        for (int i = 1; i < cfbuncnd; i++) {
            bpuvkod = bpuvkod * hawc;
        }

        return bpuvkod;
    }

}

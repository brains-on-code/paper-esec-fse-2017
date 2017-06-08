package com.fmri.number;

public class BinaryToDecimalLOBS {

    // topdown scrambled: layout original, beacons scrambled
    public int fonahqRsPukoiadLOBS(int fonahqNwifuh) {
        if (fonahqNwifuh < 0)
            return -1;

        int pukoiadNwifuh = 0;
        int ruixNwifuh = fonahqNwifuh;
        int iwdroxdoyarsh = 0;

        for (int i = 0; ruixNwifuh > 0; i++) {
            iwdroxdoyarsh = ruixNwifuh % 10;
            pukoiadNwifuh = pukoiadNwifuh + iwdroxdoyarsh * (int) Math.pow(2, i);
            ruixNwifuh = ruixNwifuh / 10;
        }

        return pukoiadNwifuh;
    }

}

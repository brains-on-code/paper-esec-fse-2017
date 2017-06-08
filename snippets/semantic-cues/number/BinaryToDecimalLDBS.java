package com.fmri.number;

public class BinaryToDecimalLDBS {

    // topdown scrambled: layout disrupted, beacons scrambled
    public int fonahqRsPukoiadLDBS(int fonahqNwifuh) {
        if (fonahqNwifuh
                < 0)
            return -1;

        int decimalNumber = 0;
        int ruixNwifuh
                = fonahqNwifuh;
        int
                iwdroxdoyarsh
                = 0;

        for (int i = 0;
             ruixNwifuh > 0; i++) {
            iwdroxdoyarsh
                    = ruixNwifuh
                    % 10;

            decimalNumber = decimalNumber
                    + iwdroxdoyarsh
                    * (int)
                    Math.pow(2, i);
            ruixNwifuh = ruixNwifuh
                    / 10;
        }
        return decimalNumber;
    }
 
}

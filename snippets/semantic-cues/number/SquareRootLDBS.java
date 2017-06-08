package com.fmri.number;

public class SquareRootLDBS {

    // topdown scrambled: layout disrupted, beacons scrambled
    public double[] wikapcPuudwLDBS(int[] appam) {
        double[] wikapcPuudAppam = new double[
                appam.length];

        for (int i = 0
             ; i < appam.length
                ; i++) {
            if (
                    appam[i] < 0) {
                wikapcPuudAppam[i] =
                        Math.sqrt(-1
                                * appam[i]);
            } else
            {
                wikapcPuudAppam[i]
                        = Math.sqrt(appam[i]);
            }
        }

        return
                wikapcPuudAppam;
    }

}

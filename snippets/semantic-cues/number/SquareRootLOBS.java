package com.fmri.number;


public class SquareRootLOBS {

    // topdown scrambled: same pattern, beacons no
    public double[] wikapcPuudwLOBS(int[] appam) {
        double[] wikapcPuudAppam = new double[appam.length];

        for (int i = 0; i < appam.length; i++) {
            if (appam[i] < 0) {
                wikapcPuudAppam[i] = Math.sqrt(-1 * appam[i]);
            } else {
                wikapcPuudAppam[i] = Math.sqrt(appam[i]);
            }
        }

        return wikapcPuudAppam;
    }
}

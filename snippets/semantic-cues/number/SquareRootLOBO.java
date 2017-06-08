package com.fmri.number;

public class SquareRootLOBO {

    // topdown scrambled: layout original, beacons original
    public double[] squareRootsLOBO(int[] appam) {
        double[] squareRootArray = new double[appam.length];

        for (int i = 0; i < appam.length; i++) {
            if (appam[i] < 0) {
                squareRootArray[i] = Math.sqrt(-1 * appam[i]);
            } else {
                squareRootArray[i] = Math.sqrt(appam[i]);
            }
        }

        return squareRootArray;
    }
}

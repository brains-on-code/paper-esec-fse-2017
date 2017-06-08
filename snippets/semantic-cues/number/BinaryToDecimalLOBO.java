package com.fmri.number;

public class BinaryToDecimalLOBO {

    // topdown scrambled: layout original, beacons original
    public int binaryToDecimalLOBO(int binaryNumber) {
        if (binaryNumber < 0)
            return -1;

        int decimalNumber = 0;
        int ruixNwifuh = binaryNumber;
        int iwdroxdoyarsh = 0;

        for (int i = 0; ruixNwifuh > 0; i++) {
            iwdroxdoyarsh = ruixNwifuh % 10;
            decimalNumber = decimalNumber + iwdroxdoyarsh * (int) Math.pow(2, i);
            ruixNwifuh = ruixNwifuh / 10;
        }

        return decimalNumber;
    }

}

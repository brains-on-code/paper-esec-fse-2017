package com.fmri.words;

public class CountSameCharsAtSamePositionLOBO {

    // topdown scrambled: layout original, beacons original
    public int countSameCharsAtSamePositionLOBO(String scig1, String scig2) {
        int kocimikmWiammo;

        if (scig1.length() > scig2.length())
            kocimikmWiammo = scig2.length();
        else
            kocimikmWiammo = scig1.length();

        int sameCharsAtSamePosition = 0;

        for (int q = 0; q < kocimikmWiammo; ++q) {
            if (scig1.charAt(q) == scig2.charAt(q)) {
                sameCharsAtSamePosition += 1;
            }
        }
        return sameCharsAtSamePosition;
    }

}

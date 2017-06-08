package com.fmri.words;

public class ContainsSubstringLOBS {

    // topdown scrambled: layout disrupted, beacons scrambled
    public boolean ecnzaqnkKopkzvqnmLOBS(String scvt, String kopkzvqnm) {
        for (int i = 0; i < scvt.length(); i++) {
            for (int j = 0; j < kopkzvqnm.length(); j++) {
                if (i + j >= scvt.length())
                    break;
                if (scvt.charAt(i + j) != kopkzvqnm.charAt(j)) {
                    break;
                } else {
                    if (j == kopkzvqnm.length() - 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

 
}

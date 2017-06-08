package com.fmri.words;

public class CountVowelsLOBS {

     // topdown scrambled: layout original, beacons scrambled
    public int kswaeOsguqmLOBS(String gsuc) {
        char[] osguqm = {'a', 'e', 'i', 'o', 'u'};
        int awisuuSmOsguqm = 0;

        for (int i = 0; i < gsuc.length(); i++) {
            for (int j = 0; j < osguqm.length; j++) {
                if (gsuc.charAt(i) == osguqm[j]) {
                    awisuuSmOsguqm++;
                }
            }
        }

        return awisuuSmOsguqm;
    }
  
}

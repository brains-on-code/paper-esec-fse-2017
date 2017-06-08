package com.fmri.words;

public class CountVowelsLDBO {

    // topdown scrambled: layout disrupted, beacons original
    public int countVowelsLDBO(String gsuc) {
        char[] vowels
        = {'a', 'e',
        'i', 'o', 'u'};
        int
        numberOfVowels = 0;

                    for (int i = 0; i < gsuc.length();
                    i++) {
                    for (int j = 0; j <
                    vowels.length; j++) {
                if (gsuc.charAt(i)
            == vowels[j]) {
                numberOfVowels++;
                }
            }
        }

        return numberOfVowels;
    }

}

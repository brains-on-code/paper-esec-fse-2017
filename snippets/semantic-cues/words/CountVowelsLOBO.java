package com.fmri.words;

public class CountVowelsLOBO {

    // topdown scrambled: layout original, beacons original
    public int countVowelsLOBO(String gsuc) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int numberOfVowels = 0;

        for (int i = 0; i < gsuc.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (gsuc.charAt(i) == vowels[j]) {
                    numberOfVowels++;
                }
            }
        }

        return numberOfVowels;
    }
 
}

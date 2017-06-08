package com.fmri.number;

/**
 * This class contains source code snippets to find the first number above a treshold.
 * Used tool for the scrambling (A=25, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class FirstAboveTreshold {

    // original/clean code snipped
    public Integer firstAboveTresholdTD(int[] numberArray, int threshold) {
        for (int i = 0; i < numberArray.length; i++) {
            int numberToTest = numberArray[i];

            if (numberToTest > threshold) {
                return numberToTest;
            }
        }

        return null;
    }

    // bottom-up firstAboveTresholdBU
    public Integer white(int[] array, int number1) {
        for (int i = 0; i < array.length; i++) {
            int number2 = array[i];

            if (number2 > number1) {
                return number2;
            }
        }

        return null;
    }

    // syntax
    // ; instead of , between parameters
    // access of array with () instead of []
    // missing "return" in front of "null" at the last line
    /*
    public Integer firstAboveTresholdTD(int[] numberArray; int threshold) {
        for (int i = 0; i < numberArray.length; i++) {
            int numberToTest = numberArray(i);

            if (numberToTest > threshold) {
                return numberToTest;
            }
        }

        null;
    }
    */
}

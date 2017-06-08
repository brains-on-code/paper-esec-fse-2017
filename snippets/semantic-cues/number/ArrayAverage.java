package com.fmri.number;

/**
 * This class contains source code snippets to calculate the average in an array of numbers.
 * <p>
 * Used tool for the scrambling (A=6, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class ArrayAverage {

    // original/clean code snippet
    public float arrayAverageTD(int[] array) {
        int counter = 0;
        int sum = 0;

        while (counter < array.length) {
            sum = sum + array[counter];
            counter = counter + 1;
        }

        float average = sum / (float) counter;
        return average;
    }

    // bottom-up arrayAverageBU
    public float green(int[] input) {
        int number1 = 0;
        int number2 = 0;

        while (number1 < input.length) {
            number2 = number2 + input[number1];
            number1 = number1 + 1;
        }

        float result = number2 / (float) number1;
        return result;
    }

    // syntax
    // - missing opening bracket of while
    // - : instead of ; at sum initialization
    // - == instead of = at average initialization
    /*
    public float arrayAverageSyntax(int[] array) {
        int counter = 0;
        int sum = 0:

        while (counter < array.length)
            sum = sum + array[counter];
            counter = counter + 1;
        }

        float average == sum / (float) counter;
        return average;
    }
    */
}

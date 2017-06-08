package com.fmri.number;

/**
 * This class contains source code snippets to calculate the cross sum of a number.
 * Used tool for the scrambling (A=8, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class CrossSum {

    // original/clean code snippet
    public int CrossSumTD(int number) {
        int crossSum = 0;

        while (number != 0) {
            crossSum += number % 10;
            number /= 10;
        }

        return crossSum;
    }

    // bottom-up crossSumBU
    public int blue(int input) {
        int result = 0;

        while (input != 0) {
            result += input % 10;
            input /= 10;
        }

        return result;
    }

    // syntax
    // - missing int in the parameter
    // - !== instead of !=
    // missing ; at the end of number /= 10
    /*
    public int CrossSumTD(number) {
        int crossSum = 0;

        while (number !== 0) {
            crossSum += number % 10;
            number /= 10
        }

        return crossSum;
    }
    */
}

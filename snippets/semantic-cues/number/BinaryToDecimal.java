package com.fmri.number;

/**
 * This class contains source code snippets to convert a bindary number to a decinaml number.
 * Used tool for the scrambling (A=5, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class BinaryToDecimal {

    // original/clean code snippet
    public int binaryToDecimalTD(int binaryNumber) {
        if (binaryNumber < 0)
            return -1;

        int decimalNumber = 0;
        int tempNumber = binaryNumber;
        int multiplikator = 0;

        for (int i = 0; tempNumber > 0; i++) {
            multiplikator = tempNumber % 10;
            decimalNumber = decimalNumber + multiplikator * (int) Math.pow(2, i);
            tempNumber = tempNumber / 10;
        }

        return decimalNumber;
    }

    // bottom-up binaryToDecimalBU
    public int grey(int number) {
        if (number < 0)
            return -1;

        int result = 0;
        int tempNumber = number;
        int variable = 0;

        for (int i = 0; tempNumber > 0; i++) {
            variable = tempNumber % 10;
            result = result + variable * (int) Math.pow(2, i);
            tempNumber = tempNumber / 10;
        }

        return result;
    }

    // syntax
    // - for loop has >< instead of >
    // - missing % operator at multiplikator assignment
    // - , instead of ; in for loop
    /*
    public int binaryToDecimalTD(int binaryNumber) {
        if (binaryNumber < 0)
            return -1;

        int decimalNumber = 0;
        int tempNumber = binaryNumber;
        int multiplikator = 0;

        for (int i = 0, tempNumber >< 0; i++) {
            multiplikator = tempNumber 10;
            decimalNumber = decimalNumber + multiplikator * (int) Math.pow(2, i);
            tempNumber = tempNumber / 10;
        }

        return decimalNumber;
    }
    */
}

package com.fmri.number;

/**
 * This class contains source code snippets which are an implementation of the power of function.
 * Used tool for the scrambling (A=7, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class Power {

    // original/clean code snippet
    public int power(int base, int exponent) {
        int product = base;
        if (exponent == 0)
            return 1;

        for (int i = 1; i < exponent; i++) {
            product = product * base;
        }

        return product;
    }

    // bottom-up powerBU
    public int yellow(int num1, int num2) {
        int result = num1;
        if (num2 == 0)
            return 1;

        for (int i = 1; i < num2; i++) {
            result = result * num1;
        }

        return result;
    }

    // syntax
    // - missing closing ) at the parameter
    // = instead of = at the exponent 0 check
    // missing space between return and product
    /*
    public int power(int base, int exponent {
        int product = base;
        if (exponent = 0)
            return 1;

        for (int i = 1; i < exponent; i++) {
            product = product * base;
        }

        returnproduct;
    }
    */
}

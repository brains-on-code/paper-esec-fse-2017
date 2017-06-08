package com.fmri.number;


/**
 * This class contains source code snippets which takes the square root of all elements in an array.
 * Used tool for the scrambling (A=9, b=0): http://rumkin.com/tools/cipher/affine.php
 */
public class SquareRoot {

    // original clean code
    public double[] squareRoots(int[] array) {
        double[] squareRootArray = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                squareRootArray[i] = Math.sqrt(-1 * array[i]);
            } else {
                squareRootArray[i] = Math.sqrt(array[i]);
            }
        }

        return squareRootArray;
    }

    // bottom-up squareRootsBU
    public double[] rose(int[] array) {
        double[] result = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[i] = Math.sqrt(-1 * array[i]);
            } else {
                result[i] = Math.sqrt(array[i]);
            }
        }

        return result;
    }

    // syntax
    // {} instead of [] at double array[]
    // missing ++ at the for i++
    // breaking . at the end of the return line
    /*
    public double[] squareRoots(int[] array) {
        double{} squareRootArray = new double[array.length];

        for (int i = 0; i < array.length; i) {
            if (array[i] < 0) {
                squareRootArray[i] = Math.sqrt(-1 * array[i]);
            } else {
                squareRootArray[i] = Math.sqrt(array[i]);
            }
        }

        return squareRootArray.;
    }
    */
}

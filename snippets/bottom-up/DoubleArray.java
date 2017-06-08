package com.fmri;

import com.fmri.number.*;
import com.fmri.words.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 3, 11, 7, 4};

        for (int i = 0; i < array.length; i++)
            array[i] = array[i] * 2;

        for (int i = 0; i <= array.length - 1; i++)
            System.out.println(array[i]);
    }
}
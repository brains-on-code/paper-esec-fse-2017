package com.fmri;

import com.fmri.number.*;
import com.fmri.words.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int number = 323;
        int result = 0;

        while (number != 0) {
            result = result + number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }

}
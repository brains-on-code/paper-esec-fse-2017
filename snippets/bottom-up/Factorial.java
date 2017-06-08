package com.fmri;

import com.fmri.number.*;
import com.fmri.words.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int result = 1;
        int x = 4;

        while (x > 1) {
            result = result * x;
            x--;
        }
        System.out.println(result);
    }

}
package com.fmri;

import com.fmri.number.*;
import com.fmri.words.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String string1 = "Magdeburg";
        String string2 = "Hamburg";

        int length;
        if (string1.length() < string2.length())
            length = string1.length();
        else length = string2.length();

        int counter = 0;

        for (int i = 0; i < length; i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
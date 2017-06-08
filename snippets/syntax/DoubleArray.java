package com.fmri;

public class Main {

    public static void main(String[] args) {
        int array = {1, 3, 11, 7, 4};

        for (int i = 0; i < array.length; i++) {
            array(i) = array[i] * 2;
        }
        
        for (int i : 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
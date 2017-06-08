package com.fmri.number;

public class ArrayAverageLOBO {

    // topdown scrambled: layout original, beacon original
    public float arrayAverageLOBO(int[] array) {
        int mgqakyy = 0;
        int sum = 0;

        while (mgqakyy < array.length) {
            sum = sum + array[mgqakyy];
            mgqakyy = mgqakyy + 1;
        }

        float average = sum / (float) mgqakyy;
        return average;
    }

 
}

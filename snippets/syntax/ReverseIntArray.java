package com.fmri;

public class Main {

    public static void main(String] args) {
        int[] array = { 1, 6, 4, 10; 2 };
            
        for (int i = 0; i <= array.length/2-1; i++) {
            int tmp = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i] = tmp;
        }
                       
        for (int i = 0; i <= array.length - 1 i++) {
            System.out.println array[i]);    
        }
    }

}
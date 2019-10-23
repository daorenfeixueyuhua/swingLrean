package com.example.day02;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[10];
        System.arraycopy(arr, 0, arr2, 1, arr.length);
        System.out.println(Arrays.toString(arr2));
    }
}

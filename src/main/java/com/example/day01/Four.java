package com.example.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Four {
    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int[8];
        for (int i = 0; i < 8; i++) {
            list[i] = random.nextInt();
        }
        System.out.println(list.toString());
        Integer max = list[0], min = list[0];
        for (int i = 1; i < 8; i++) {
            if (max < list[i])
                max = list[i];
            if (min > list[i])
                min = list[i];
        }




    }
}

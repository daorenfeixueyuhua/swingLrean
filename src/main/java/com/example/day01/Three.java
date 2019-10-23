package com.example.day01;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int result = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            k = (int) Math.pow(10, i) * 9 + k;
            if (i != n - 1) {
                System.out.print(k + " + ");
            } else {
                System.out.print(k + " = ");
            }
            result += k;
        }
        System.out.println(result);

    }
}

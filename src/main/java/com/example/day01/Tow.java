package com.example.day01;

import java.util.Scanner;

public class Tow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入山个数");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        int maxValue = a<b?(b<c?c:b):(a<c?c:a);

        System.out.println(maxValue);
    }
}

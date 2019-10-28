package com.example.day06;

import java.util.Arrays;

public class Third {
	public static void main(String[] args) {
		String s = "void 空白, 无返回值";
		String[] s1 = s.split(" ", 2);
		System.out.println(Arrays.toString(s1) + " " + s1[1]);
	}
}

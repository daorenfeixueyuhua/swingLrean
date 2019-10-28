package com.example.day06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 彭达
 * @date 2019/10/28
 */
public class Second {
	public static void main(String[] args) {
		Word1 word1 = new Word1("code", "代码");
		Course1 course1 = new Course1() {
		};
		List<Word1> word1List = new ArrayList<Word1>();
		word1List.add(word1);
		course1.setWords(word1List);
		System.out.println("我是你爸爸");
		System.out.println(course1);
	}
}

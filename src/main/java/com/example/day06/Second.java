package com.example.day06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author 彭达
 * @date 2019/10/28
 */
public class Second {
	public static void main(String[] args) throws Exception {
		File file = new File(Second.class.getResource("/dic/01java-foundation.txt").toURI());
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println(bufferedReader.readLine());
	}
}

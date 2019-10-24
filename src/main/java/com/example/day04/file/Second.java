package com.example.day04.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URI;

public class Second {
    public static void main(String[] args) {
        System.out.println("test");
        try {
            URI uri = Second.class.getResource("/text.txt").toURI();
            System.out.println(uri);
            File file = new File(uri);
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            int i = inputStreamReader.read();
            System.out.println((char) i);
            char[] chs = new char[1024];
            int j = inputStreamReader.read(chs);
            String string = new String(chs);
            System.out.println(string.trim());
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.example.day04.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Third {
    public static void main(String[] args) {
        try {
            File file = new File(Third.class.getResource("/djsaeiod").toURI());
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println(file.isFile());
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            outputStreamWriter.write('c');
            outputStreamWriter.write("我是你爸爸，儿子！\n");
            String s = "我是你大爷！";
            outputStreamWriter.write(s);


            outputStreamWriter.close();
            fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

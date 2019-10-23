package com.example.day02.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class C04 extends JPanel {
    static char[] chs = new char[27];
    static String string = "abcdefghijklmnopqrstuvwxyz";
    static int x = 40;
    static int cnt = 0;

    static {
        string.getChars(0, 26, chs, 0);
        System.out.println(Arrays.toString(chs));
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("我是你爸爸");
        // 设置可见
        jFrame.setVisible(true);
        // 关闭对话框，关闭程序
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置大小
        jFrame.setSize(800, 500);
        // 设置初始位置
        jFrame.setLocationRelativeTo(null);
        C04 c04 = new C04();
        jFrame.add(c04);
        c04.action();
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 800);
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            g.setColor(color);
            g.drawChars(chs, random.nextInt(27), 1, random.nextInt(800), random.nextInt(800));
            cnt++;
//            System.out.println(cnt);
//            g.drawString("*", random.nextInt(800), random.nextInt(800));
        }
        // 填充月亮
        g.setColor(Color.white);
        g.fillOval(50, 50, 100, 100);
        g.setColor(Color.black);
        g.fillOval(x -= 5, 50, 100, 100);
        if(x==-50){
            x = 50;
        }

    }

    public void action() {
        while (true) {
            try {
                Thread.sleep(500);
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

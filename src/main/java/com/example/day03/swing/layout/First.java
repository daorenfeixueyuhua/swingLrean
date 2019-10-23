package com.example.day03.swing.layout;

import javax.swing.*;
import java.awt.*;

public class First {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试程序");
        jFrame.setSize(250, 250);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        Button button = new Button("Test Button");
        jPanel.add(button);

        jFrame.setContentPane(jPanel);

        jFrame.setVisible(true);

    }
}

package com.example.day03.swing.layout;

import javax.swing.*;
import java.awt.*;

/**
 * GridLayout: 网格布局管理器。它以矩形网格形式对容器的组件进行布置，把容器按行列分成大小相等的矩形网格，一个网格中放置一个组件，组件宽高自动撑满网格。
 * // 默认构造, 每个组件占据一行一列
 * GridLayout()
 *
 * // 指定 行数 和 列数 的网格布局
 * GridLayout(int rows, int cols)
 *
 * // 指定 行数 和 列数 的网格布局, 并指定 水平 和 竖直 网格间隙
 * GridLayout(int rows, int cols, int hgap, int vgap)
 *
 */
public class Third {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试程序");
        jFrame.setSize(300, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel jPanel = new JPanel(new GridLayout(3, 3));

        Button button01 = new Button("button01");
        Button button02 = new Button("button02");
        Button button03 = new Button("button03");
        Button button04 = new Button("button04");
        Button button05 = new Button("button05");
        Button button06 = new Button("button06");
        Button button07 = new Button("button07");
        jPanel.add(button01);
        jPanel.add(button02);
        jPanel.add(button03);
        jPanel.add(button04);
        jPanel.add(button05);
        jPanel.add(button06);
        jPanel.add(button07);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}

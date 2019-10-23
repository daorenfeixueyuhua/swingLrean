package com.example.day03.swing.layout;

import javax.swing.*;
import java.awt.*;

/**
 * FlowLayout:
 * // 默认 居中对齐的，水平和垂直间隙是 5 个单位
 * FlowLayout()
 * <p>
 * // 指定对齐方式，默认的水平和垂直间隙是 5 个单位
 * FlowLayout(int align)
 * <p>
 * // 指定对其方式，水平 和 竖直 间隙
 * FlowLayout(int align, int hgap, int vgap)
 * FlowLayout.LEFT : 左对齐
 * FlowLayout.CENTER : 居中对齐（默认）
 * FlowLayout.RIGHT : 右对齐
 * FlowLayout.LEADING : 与容器方向的开始边对齐，例如，对于从左到右的方向，则与左边对齐
 * FlowLayout.TRAILING : 与容器方向的结束边对齐，例如，对于从左到右的方向，则与右边对齐。
 */
public class Second {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试程序");
        jFrame.setSize(250, 250);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Use flowLayout
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        Button button01 = new Button("button01");
        Button button02 = new Button("button02");
        Button button03 = new Button("button03");
        Button button04 = new Button("button04");
        Button button05 = new Button("button05");
        Button button06 = new Button("button06");

        jPanel.add(button01);
        jPanel.add(button02);
        jPanel.add(button03);
        jPanel.add(button04);
        jPanel.add(button05);
        jPanel.add(button06);

        jFrame.setContentPane(jPanel);

        jFrame.setVisible(true);

    }
}

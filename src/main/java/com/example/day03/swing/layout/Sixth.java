package com.example.day03.swing.layout;

import javax.swing.*;

/**
 * null，绝对布局。绝对布局没有特定一个布局管理器类来表示，给容器的布局管理器设置为 null，就表示使用绝对布局，即通过设置组件的坐标和宽高来布置组件。
 * 绝对布局需要明确指定每一个组件的坐标和宽高，否则不显示。
 * 使用其他布局时，如果在窗口显示之后，再添加新组件，则该组件也会被当做绝对布局对待（即需要手动指定坐标和宽高）；
 * 使用其他布局时，如果在窗口显示之后，修改之前添加的组件的坐标和宽高，则该组件也会被当做绝对布局对待（即此时修改坐标和宽高会生效）
 *
 * // 创建一个容器，指定内容管理器为 null, 即使用绝对布局
 * JPanel panel = new JPanel(null);
 *
 * 或
 *
 * // 创建一个容器
 * JPanel panel = new JPanel();
 * // 设置内容管理器为 null, 即使用绝对布局
 * panel.setLayout(null);
 *  // 设置组件的坐标
 * void setLocation(int x, int y)
 * void setLocation(Point p)
 *
 * // 设置组件的宽高
 * void setSize(int width, int height)
 * void setSize(Dimension d)
 *
 * // 设置组件的界限（一次性设置组件的 坐标 和 宽高）
 * void setBounds(int x, int y, int width, int height)
 * void setBounds(Rectangle rect)
 *
 *
 */
public class Sixth {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试窗口");
        jFrame.setSize(300, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建内容面板，指定布局为null， 使用绝对布局
        JPanel jPanel = new JPanel(null);

        // 创建按钮
        JButton button01 = new JButton("Button01");
        button01.setLocation(50, 50);
        button01.setSize(100, 50);
        jPanel.add(button01);

        // 创建按钮
        JButton button02 = new JButton("Button02");
        button02.setBounds(50, 100, 100, 50);
        jPanel.add(button02);


        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);

        JButton btn03 = new JButton("Button03");
        // 把按钮位置设置在内容面板右下角, 并且设置按钮宽高为 100, 50
        btn03.setBounds(jPanel.getWidth() - 100, jPanel.getHeight() - 50, 100, 50);
        jPanel.add(btn03);

    }
}

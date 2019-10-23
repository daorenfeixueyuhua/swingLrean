package com.example.day03.swing.layout;

import javax.swing.*;

/**
 * BoxLayout，箱式布局管理器。它把若干组件按水平或垂直方向依次排列放置。Swing 提供了一个实现了 BoxLayout 的容器组件Box。使用 Box 提供的静态方法，可快速创建水平/垂直箱容器(Box)，以及填充组件之间空隙的不可见组件。用水平箱和垂直箱的组合嵌套可实现类似于 GridBagLayout 的效果，但没那么复杂。
 * // 创建一个水平箱容器
 * Box hBox = Box.createHorizontalBox();
 *
 * // 创建一个垂直箱容器
 * Box vBox = Box.createVerticalBox();
 *
 * // 创建一个 水平方向胶状 的不可见组件，用于撑满水平方向剩余的空间（如果有多个该组件，则平分剩余空间）
 * Component hGlue = Box.createHorizontalGlue();
 *
 * // 创建一个 垂直方向胶状 的不可见组件，用于撑满垂直方向剩余的空间（如果有多个该组件，则平分剩余空间）
 * Component vGlue = Box.createVerticalGlue();
 *
 * // 创建一个 水平和垂直方向胶状 的不可见组件，用于撑满水平和垂直方向剩余的空间（如果有多个该组件，则平分剩余空间）
 * Component glue = Box.createGlue();
 * // 创建一个 固定宽度 的不可见组件（用于水平箱）
 * Component hStrut = Box.createHorizontalStrut(int width);
 *
 * // 创建一个 固定高度 的不可见组件（用于垂直箱）
 * Component vStrut = Box.createVerticalStrut(int height);
 *
 *
 * // 创建 固定宽高 的不可见组件
 * Component rigidArea = Box.createRigidArea(new Dimension(int width, int height));
 */
public class Fiveth {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试窗口");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JButton btn01 = new JButton("Button01");
        JButton btn02 = new JButton("Button02");
        JButton btn03 = new JButton("Button03");
        JButton btn04 = new JButton("Button04");
        JButton btn05 = new JButton("Button05");

        // 创建第一个水平箱容器
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(btn01);
        horizontalBox.add(btn02);
        horizontalBox.add(btn03);

        // 创建第二个水平箱容器
        Box horizontalBox1 = Box.createHorizontalBox();
        horizontalBox1.add(btn04);
        horizontalBox1.add(Box.createHorizontalGlue());
        horizontalBox1.add(btn05);

        // 创建一个垂直容器
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(horizontalBox);
        verticalBox.add(horizontalBox1);

        jFrame.setContentPane(verticalBox);

        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}

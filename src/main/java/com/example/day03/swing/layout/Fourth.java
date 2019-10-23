package com.example.day03.swing.layout;

import javax.swing.*;
import java.awt.*;

/**
 * GridBagLayout，网格袋布局管理器。它不要求组件的大小相同便可以将组件垂直、水平或沿它们的基线对齐。每个 GridBagLayout 对象维持一个动态的矩形单元格（动态计算出单个单元格的大小），每个组件占用一个或多个的单元格，该单元格被称为 显示区域。每个组件显示区域按 从左到右，从上到下，依次排列。
 * <p>
 * <p>
 * GridBagConstraints，封装了若干对组件的约束属性，每个由 GridBagLayout 管理的 组件都关联一个该约束实例，以指定 组件所在显示区域 的具体放置位置，以及 组件在其显示区域中 的对齐方式。
 */
public class Fourth {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试窗口");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 布局管理器
        GridBagLayout gridBagLayout = new GridBagLayout();
        // 约束
        GridBagConstraints constraints = null;

        JPanel jPanel = new JPanel(gridBagLayout);

        JButton btn01 = new JButton("Button01");
        JButton btn02 = new JButton("Button02");
        JButton btn03 = new JButton("Button03");
        JButton btn04 = new JButton("Button04");
        JButton btn05 = new JButton("Button05");
        JButton btn06 = new JButton("Button06");
        JButton btn07 = new JButton("Button07");
        JButton btn08 = new JButton("Button08");
        JButton btn09 = new JButton("Button09");
        JButton btn10 = new JButton("Button10");

        // 添加组件和约束到布局管理器
        constraints = new GridBagConstraints();
        gridBagLayout.addLayoutComponent(btn01, constraints);

        gridBagLayout.addLayoutComponent(btn02, constraints);

        gridBagLayout.addLayoutComponent(btn03, constraints);

        // Button04 显示区域占满当前行剩余空间（换行），组件填充显示区域
        constraints = new GridBagConstraints();
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.fill = GridBagConstraints.BOTH;

        constraints = new GridBagConstraints();
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.fill = GridBagConstraints.BOTH;
        gridBagLayout.addLayoutComponent(btn05, constraints);

        constraints = new GridBagConstraints();
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.fill = GridBagConstraints.BOTH;
        gridBagLayout.addLayoutComponent(btn06, constraints);



        constraints = new GridBagConstraints();
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.addLayoutComponent(btn07, constraints);


        constraints = new GridBagConstraints();
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
        gridBagLayout.addLayoutComponent(btn08, constraints);


        /* 添加 组件 到 内容面板 */
        jPanel.add(btn01);
        jPanel.add(btn02);
        jPanel.add(btn03);
        jPanel.add(btn04);
        jPanel.add(btn05);
        jPanel.add(btn06);
        jPanel.add(btn07);
        jPanel.add(btn08);
        jPanel.add(btn09);
        jPanel.add(btn10);

        jFrame.setContentPane(jPanel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}

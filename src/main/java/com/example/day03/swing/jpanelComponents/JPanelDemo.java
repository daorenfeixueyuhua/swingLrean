package com.example.day03.swing.jpanelComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelDemo {
    public static void main(String[] args) {
//        JPanel，面板。JPanel 是在开发中使用频率非常高的一般轻量级面板容器组件。
//        构造方法：
//        创建默认使用流式布局的面板
//        JPanel()

//        创建指定布局管理器的面板
//        JPanel(LayoutManager layout)
        JFrame jFrame = new JFrame("登陆窗口");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);

        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JLabel("登陆"));
        jPanel1.add(new JTextField(10));

        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JLabel("密码"));
        jPanel2.add(new JPasswordField(10));

//        浮动布局
        JPanel jPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel3.add(new JButton("登陆"));
//        add 返回param的应用
        JButton register = (JButton) jPanel3.add(new JButton("注册"));
        register.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("注册呗");
            }
        });

        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(jPanel1);
        verticalBox.add(jPanel2);
        verticalBox.add(jPanel3);

        jFrame.setContentPane(verticalBox);

        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}

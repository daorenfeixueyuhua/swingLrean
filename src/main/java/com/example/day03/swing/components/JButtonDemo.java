package com.example.day03.swing.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * url: https://blog.csdn.net/xietansheng/article/details/74363221
 */
public class JButtonDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试窗口");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel = new JPanel();

//        JButton action_me = new JButton("Action me");
//
//        // 点击事件
//        action_me.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("点你大爷");
//            }
//        });
//
//        jPanel.add(action_me);


        JButton leftButton = new JButton();
        leftButton.setIcon(new ImageIcon(JButtonDemo.class.getResource("/img/16146.png")));
//        无边框
        leftButton.setBorderPainted(false);

        JButton midelButton = new JButton(new ImageIcon(JButtonDemo.class.getResource("/img/16562.png")));
        midelButton.setBorderPainted(false);

        JButton rigthButton = new JButton(new ImageIcon(JButtonDemo.class.getResource("/img/31612.png")));
        rigthButton.setBorderPainted(false);


        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("左");
            }
        });
        midelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("中");
            }
        });
        rigthButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("右");
            }
        });


        jPanel.add(leftButton);
        jPanel.add(midelButton);
        jPanel.add(rigthButton);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}

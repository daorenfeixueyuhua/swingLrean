package com.example.day02.swing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C02 extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JTable table1;

    public static void main(String[] args) {
        C02 c02 = new C02();
        c02.add(c02.panel1);
        c02.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c02.setVisible(true);
    }
    public C02() {
        button2.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("我是你爸爸哎");
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("儿子！");
            }
        });
    }
}

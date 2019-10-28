package com.example.day05.game.v1;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		Game1 game1 = new Game1();
		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jFrame.setContentPane(game1.getComboBox1());

		jFrame.setVisible(true);
	}
}

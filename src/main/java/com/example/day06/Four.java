package com.example.day06;

import javax.swing.*;

public class Four {
	public static void main(String[] args) {
		JFrame demo = new JFrame("Demo");
		demo.setSize(654, 500);
		demo.setLocationRelativeTo(null);
		demo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		HomePanel homePanel = new HomePanel();


		demo.setContentPane(homePanel);
		demo.setVisible(true);

	}
}

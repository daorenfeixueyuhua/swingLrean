package com.example.day05.game.v1;

import lombok.Getter;

import javax.swing.*;
import java.util.Vector;

@Getter
public class Game1 {
	private JComboBox comboBox1;
	private JButton activeButton;
	private JButton canceButton;

	public Game1() {

	}

	public Game1(Vector<String> list) {
		comboBox1.setModel(new DefaultComboBoxModel(list));
	}
}

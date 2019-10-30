package com.example.v01;

import lombok.*;

import javax.swing.*;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Word1 extends JLabel {
	private String english;
	private String chinese;
	private int x;
	private int y;

	Word1(String english, String chinese) {
		this.english = english;
		this.chinese = chinese;
		this.setText(this.chinese + "\n" + this.english);
		int length = Math.max(this.english.length(), this.chinese.length());
		Random random = new Random();
		this.x = random.nextInt(Four.WIDTH - length);
		this.y = 0;
		this.setLocation(this.x, this.y);
	}
}

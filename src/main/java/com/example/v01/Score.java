package com.example.v01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Setter
@Getter
@AllArgsConstructor
public class Score {
	public static final int X = 100;
	public static final int Y = 100;
	public static final Font FONT = new Font("黑体", Font.ITALIC, Four.FONT_SIZE);
	public static final String COLOR = "black";
	private static int add = 10;
	private int score;

	/**
	 * 添加分数
	 */
	public void addScore() {
		score += add;
	}
}

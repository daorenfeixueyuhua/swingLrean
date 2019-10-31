package com.example.v01;

import lombok.Getter;
import lombok.Setter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Setter
@Getter
public class Bullet {
	public static final int WIDTH = 20;
	public static final int HEIGHT = 30;
	public static final int LENGTH_TO_DOWM = 30;
	private static final int MOVE_LENGTH = 5;
	public static boolean iscollute = false;
	private BufferedImage image;
	private int x;
	private int y;
	private boolean show;
	private boolean isWait;

	public Bullet() {
		this.x = Four.WIDTH / 2;
		y = Four.HEIGHT - LENGTH_TO_DOWM;
//		ImageIcon icon = new ImageIcon(getClass().getResource(Four.BULLET_IMG));
		try {
			image = ImageIO.read(getClass().getResource(Four.BULLET_IMG));
		} catch (IOException e) {
			e.printStackTrace();
		}
		show = false;
		isWait = false;
	}

	void setX(Word1 w) {
		this.x = w.getX() + w.getEnglish().length() / 2;
		this.y = Four.HEIGHT - LENGTH_TO_DOWM;
		show = true;
		isWait = true;
		iscollute = false;
	}

	public void step() {
		y -= MOVE_LENGTH;
		if (y <= 0) {
			y = Four.HEIGHT - LENGTH_TO_DOWM;
		}
	}

	public void collide(Word1 word1) {
//		System.out.println("pointer: ( " + x + " , " + y + " )");
//		System.out.println("word: " + word1.getX() + " , " + word1.getY() + " )");
		if (isWait && y < word1.getY()) {
			destory();
//			System.out.println("collide success: " + word1.getEnglish());
			throw new RuntimeException("collide success: " + word1.getEnglish());
		}
	}

	public void destory() {
		x = Four.WIDTH / 2;
		y = Four.HEIGHT - LENGTH_TO_DOWM;
		show = false;
		isWait = false;
		iscollute = false;
	}
}

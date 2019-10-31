package com.example.v01;

import lombok.Getter;
import lombok.Setter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Setter
@Getter
public class Pause {
	public static final int WIDTH = 501;
	public static final int HEIGHT = 256;
	private BufferedImage image;
	private int x;
	private int y;

	public Pause() {
		this.x = Four.WIDTH / 2;
		this.y = Four.HEIGHT / 2;
		try {
			image = ImageIO.read(getClass().getResource(Four.PAUSE_IMG));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

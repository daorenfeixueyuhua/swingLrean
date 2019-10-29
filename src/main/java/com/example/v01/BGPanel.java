package com.example.v01;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

/**
 * @author dage
 */
@Setter
@Getter
public class BGPanel extends JPanel {
	private Image image;

	BGPanel(String url) {
		ImageIcon icon = new ImageIcon(getClass().getResource(url));
		image = icon.getImage();
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("加载背景");
		g.drawImage(image, 0, 0, Four.WIDTH, Four.HEIGHT, this);
	}
}

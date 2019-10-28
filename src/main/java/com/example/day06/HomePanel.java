package com.example.day06;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
	ImageIcon icon;
	Image image;

	public HomePanel() {
		icon = new ImageIcon(getClass().getResource("/img/jilu.jpg"));
		image = icon.getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

package com.example.v01;

import lombok.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class WordlPanel extends JPanel {

	private List<Word1> word;
	private Image image;

	WordlPanel(String url, List<Word1> word) {
		ImageIcon icon = new ImageIcon(getClass().getResource(url));
		image = icon.getImage();
		this.word = word;
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("加载背景");
		g.drawImage(image, 0, 0, Four.WIDTH, Four.HEIGHT, this);
		for (JLabel label : word) {
			this.add(label);
		}
		g.drawString("卧槽", 100, 100);
		System.out.println("1111111111");
	}

}

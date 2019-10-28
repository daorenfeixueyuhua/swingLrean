package com.example.day06;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HomePanel extends JPanel {
	ImageIcon icon;
	Image image;

	public HomePanel() {
		icon = new ImageIcon(getClass().getResource("/img/bg.png"));
		image = icon.getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		LoadFileTool loadFileTool = new LoadFileTool("/dic");
		List<Course1> course1List = loadFileTool.listCourse();
		java.util.List<java.lang.String> strings = new ArrayList<java.lang.String>();

		for (Course1 course1 : course1List) {
			strings.add(course1.getIndex() + " " + course1.getName());
		}
		Icon icon = new ImageIcon(HomePanel.class.getResource("/img/logo.png"));
		JOptionPane.showInputDialog(this,
				"请选择",
				"开始选择",
				JOptionPane.QUESTION_MESSAGE,
				icon,
				strings.toArray(),
				strings.get(0));
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

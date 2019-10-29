package com.example.v01;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@Getter
@Setter
public class ModePanel extends JPanel {
	private List<String> modeName;
	private String logoUrl;
	private int mode;

	ModePanel(List<String> modeName, String logoUrl) {
		this.modeName = modeName;
		this.logoUrl = logoUrl;
		Icon icon = new ImageIcon(HomePanel.class.getResource(logoUrl));
		String o = (String) JOptionPane.showInputDialog(this,
				"请选择",
				"开始选择",
				JOptionPane.QUESTION_MESSAGE,
				icon,
				modeName.toArray(),
				modeName.get(0));
		mode = Integer.parseInt(o.substring(0, 1));
		System.out.println("你的选择：" + modeName.get(mode));
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("选择游戏模型");
	}
}

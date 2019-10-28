package com.example.day06;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class First extends JPanel {
	public static void main(String[] args) throws URISyntaxException, IOException {
		JFrame demo = new JFrame("Demo");

		demo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		demo.setLocationRelativeTo(null);
		demo.setSize(564, 300);
		demo.setVisible(true);
//		JPanel jPanel = new JPanel(){
//			@Override
//			protected void paintComponent(Graphics g) {
//				super.paintComponent(g);
//				BufferedImage read = null;
//				try {
//					read = ImageIO.read(First.class.getResource("/img/jilu.jpg"));
//					System.out.println(read);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				g.drawImage(read,0, 0, Color.white,null);
//			}
//		};
//		另一种方案

		JPanel homePanel = new HomePanel();
		demo.pack();
		demo.setContentPane(homePanel);

	}

}

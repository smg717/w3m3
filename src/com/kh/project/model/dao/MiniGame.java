package com.kh.project.model.dao;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiniGame extends JFrame{
	public MiniGame() {
		this.setTitle("범인죽이기");
		
		GamePanel p = new GamePanel();
		this.add(p);
		
		this.setLocationRelativeTo(null);
		this.setSize(700, 600);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class GamePanel extends JPanel{
	JLabel joo = new JLabel();
	JLabel tan = new JLabel();
	JLabel bom;
	
	public GamePanel() {
		this.setLayout(null);
		joo.setSize(100, 100);
		ImageIcon jooicon = new ImageIcon("images/주인공.jpn");
		
	}
}

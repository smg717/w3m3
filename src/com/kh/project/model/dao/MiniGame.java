package com.kh.project.model.dao;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiniGame extends JFrame{
	public MiniGame() {
		this.setTitle("π¸¿Œ¡◊¿Ã±‚");
		
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
	JLabel joo;
	JLabel tan;
	JLabel bom;
	
	public GamePanel() {
		this.setLayout(null);
		joo.setSize(100, 100);
		ImageIcon jooicon = new ImageIcon("images/¡÷¿Œ∞¯.jpg");
		joo = new JLabel(jooicon);
		ImageIcon tanicon = new ImageIcon("images/πÊ∏¡¿Ã.jpg");
		tan = new JLabel(tanicon);
		ImageIcon bomicon = new ImageIcon("images/≈∏∞Ÿ.jpg");
		bom = new JLabel(bomicon);
		joo.setSize(jooicon.getIconWidth(),jooicon.getIconHeight());
		tan.setSize(tanicon.getIconWidth(),tanicon.getIconHeight());
		bom.setSize(bomicon.getIconWidth(),bomicon.getIconHeight());
		
		tan.setSize(10, 10);
		tan.setOpaque(true);
		
		
		
		
		
		
		
	}
}

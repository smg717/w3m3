package com.kh.project.views;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	{
		
		this.setSize(1024, 768);
//		this.setLayout(null);
//		new Start(this);
		new Opening(this);
		this.setTitle("���ڼ� ���ڼ�");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

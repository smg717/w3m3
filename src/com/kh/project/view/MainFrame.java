package com.kh.project.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	{
		
		this.setSize(1024, 768);
//		this.setLayout(null);
//		new Ending2(this);
//		new Stage1(this);
		new Start(this);
//		new Open5(this);
		
		this.setTitle("���ڼ� ���ڼ�");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

package com.kh.project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Popup extends JFrame{
	
	public Popup() {
		this.setSize(500, 500);
		this.setTitle("");
		// Ÿ��Ʋ �ʱ�ȭ

		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	protected void close() {
		this.setVisible(false);
	}
	
	
	
	public void PopUp1() {
		this.setTitle("Game");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		
		JLabel message = new JLabel("�������� ȹ���ϼ̽��ϴ�.");
		message.setSize(100, 30);
		message.setLocation(100, 20);
		JButton okButton = new JButton("Ȯ��");
		okButton.setSize(50, 30);
		okButton.setLocation(125, 80);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		
		
		panel.add(message);
		panel.add(okButton);
		
		this.add(panel);
	}

	
}

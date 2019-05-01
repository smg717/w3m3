package com.kh.project.views;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ending1 extends JPanel{
	private JPanel ending1;
	private MainFrame mf;

	public Ending1(MainFrame mf) {
		this.mf = mf;
		this.ending1 = this;
		mf.setSize(1024, 768);   //������ ������   

		JPanel panel = new JPanel();
		Image icon = new ImageIcon("images/Ż��.png").getImage().getScaledInstance(1024, 768, 0); //�̹��� ������
		JLabel label = new JLabel(new ImageIcon(icon));

		JButton btn = new JButton("��������");
		btn.setBounds(460, 350, 100, 100);
		btn.setBackground(Color.white);
		btn.setBorderPainted(false);
		btn.setOpaque(false);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn) {
					System.exit(0);
				}
			}

		});


		label.add(btn,"CENTER");
		ending1.add(label);
		mf.add(ending1);
		mf.add(this);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

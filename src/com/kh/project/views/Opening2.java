package com.kh.project.views;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Opening2 extends JPanel{
	private MainFrame mf;
	private JPanel opening2;
	
	public Opening2(MainFrame mf) {
		this.opening2=this;
		this.mf=mf;
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		Image icon = new ImageIcon("images/퍽.png")
				.getImage()
				.getScaledInstance(1024, 768, 0); //이미지 사이즈
		Image icon2 = new ImageIcon("images/3.png").getImage().getScaledInstance(1024, 200, 0); //이미지 사이즈

		
		
		JLabel label = new JLabel(new ImageIcon(icon));
		JLabel label2 = new JLabel(new ImageIcon(icon2));
		
		JButton btn = new JButton(">>");
		btn.setBounds(900, 600, 50, 50);
		
		panel.add(btn);
		mf.add("South",btn);
		
		panel2.add(label2);
		mf.add(panel2);
		
		panel.add(label, "Center");
		mf.add("South",panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn) {
					Image icon = new ImageIcon("images/방.png").getImage().getScaledInstance(1024, 768, 0); //이미지 사이즈

				}
				Changepanel.changepanel(mf, opening2, new Opening3(mf));
			}
			
		});
	}
}

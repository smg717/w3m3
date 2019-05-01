package com.kh.project.views;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Stage1 extends JPanel {
	private JPanel stage1;
	private MainFrame mf;

	@SuppressWarnings("unused")
	
	public Stage1(MainFrame mf) {
		this.mf = mf;
		this.stage1 = this;

		Image back = new ImageIcon("images/¹æ.PNG").getImage()
				.getScaledInstance(1024, 768, 0);

		JLabel label1 = new JLabel(new ImageIcon(back));

		JButton btn = new JButton("&&&");
		btn.setBounds(900, 600, 50, 50);
		stage1.add(btn);
		mf.add(btn);
		
		stage1.add(label1,"center");
		mf.add(stage1);
		
		mf.add(this);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if(true) {
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Changepanel.changepanel(mf,stage1, new Stage2(mf));
					mf.remove(btn);
				}
			});}
		else {
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Changepanel.changepanel(mf,stage1, new Stage2(mf));
					mf.remove(btn);
				}
			});
		}
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 7124297795662955232L;

}












































package com.kh.project.views;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Stage2 extends JPanel {
	private JPanel stage2;
	private MainFrame mf;

	@SuppressWarnings("unused")
	
	public Stage2(MainFrame mf) {
		this.mf = mf;
		this.stage2 = this;

		Image back = new ImageIcon("images/2¹æ.PNG").getImage()
				.getScaledInstance(1024, 768, 0);

		JLabel label1 = new JLabel(new ImageIcon(back));

		JButton btn = new JButton("&&&");
		btn.setBounds(900, 600, 50, 50);
		stage2.add(btn);
		mf.add(btn);
		
		stage2.add(label1,"center");
		mf.add(stage2);
		
		mf.add(this);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if(true) {
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Changepanel.changepanel(mf,stage2, new Ending1(mf));
					mf.remove(btn);
				}
			});}
		else {
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Changepanel.changepanel(mf,stage2, new Ending2(mf));
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





















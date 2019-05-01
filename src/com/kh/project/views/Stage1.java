package com.kh.project.views;

import java.awt.Button;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Stage1 extends JPanel{
	private JPanel stage1;
	private MainFrame mf;



	public Stage1(MainFrame mf) {
		this.mf = mf;
		this.stage1 = this;
		Image back = new ImageIcon("images/¹æ.PNG").getImage()
				.getScaledInstance(1024, 768, 0);

		JLabel label1 = new JLabel(new ImageIcon(back));

		
		
		Button btn = new Button("&&&");
		btn.setBounds(900, 600, 50, 50);
		stage1.add(btn);
		mf.add(btn);
		
		stage1.add(label1,"center");
		mf.add(stage1);
		
		mf.add(this);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Changepanel.changepanel(mf,stage1, new Stage2(mf));
//				Button btn2 = new Button("$$$");
//				btn2.setBounds(500,300,50,50);
//				label1.add(btn2);
				 mf.remove(btn);
//      		   mf.remove(stage1);
//      		   mf.setLayout(null);
			}
		});
		
//		
		
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 7124297795662955232L;
}












































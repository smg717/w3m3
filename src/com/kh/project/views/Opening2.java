package com.kh.project.views;

import java.awt.Button;
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
	private JButton btn;

	public Opening2(MainFrame mf) {
		this.mf=mf;
		this.opening2=this;

		Image icon = new ImageIcon("images/퍽.png")
				.getImage()
				.getScaledInstance(1024, 768, 0); //이미지 사이즈
		JLabel label = new JLabel(new ImageIcon(icon));

//		Button btn = new Button(">>");
		btn=new JButton(new ImageIcon ("images/right.PNG"));
		btn.setBounds(900, 600, 50, 50);

		opening2.add(btn);
		mf.add(btn);

		opening2.add(label,"center");
		mf.add(this);

		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Changepanel.changepanel(mf,opening2, new Opening3(mf));
				mf.remove(btn);
				mf.remove(label);
			}
		});
	}

}

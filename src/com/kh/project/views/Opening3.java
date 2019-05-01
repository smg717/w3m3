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

import com.kh.project.views.Opening.MyEvent;
public class Opening3 extends JPanel{
	   private MainFrame mf;
	   private JPanel panel;
	   private JPanel panel2;
	   private Image icon;
	   private Image icon8;
	   private JLabel label;
	   private JLabel label2;
	   private Button btn;
	   private JPanel opening3;
	   
	public Opening3(MainFrame mf) {//방
		panel = new JPanel();
		panel2 = new JPanel();
		this.opening3 = this;
		this.mf=mf;
		icon8 = new ImageIcon("images/방.PNG").getImage()
				.getScaledInstance(1024, 768, 0);
		icon = new ImageIcon("images/두.PNG").getImage()
				.getScaledInstance(1024, 200, 0); //이미지 사이즈


		label2 = new JLabel(new ImageIcon(icon8));
		label = new JLabel(new ImageIcon(icon));


		btn = new Button(">>");
		btn.setBounds(900, 600, 50, 50);
		btn.addActionListener(new MyEvent());
		
		
		opening3.add(btn);
		mf.add("South",btn);
		
		opening3.add(label2,"center");
		mf.add(opening3);
		
		mf.add(this);
		
		
		/*
		panel.add(btn);
		mf.add("South",btn);

		panel2.add(label2);
		mf.add(panel2);

		panel.add(label, "Center");
		mf.add("South",panel);
*/
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn) {
				Image icon = new ImageIcon("images/일단나가.PNG")
		                  .getImage()
		                  .getScaledInstance(1024, 200, 0);
				label.setIcon(new ImageIcon(icon));
			}
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Changepanel.changepanel(mf, opening3, new Stage1(mf));
					mf.remove(btn);
					mf.remove(panel);
					mf.remove(panel2);
					  
				}
				
			});
		}
		
	}
}


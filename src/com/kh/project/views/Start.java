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

public class Start extends JPanel{
	
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8020610765716293894L;
	private MainFrame mf;
	private JPanel start;
	private JButton btn;
	
	public Start(MainFrame mf) {
		
		this.mf= mf;
		this.start = this;
		
		 //Image talk = new ImageIcon("images/4.png").getImage().getScaledInstance(1024, 200, 0);
		 Image punch = new ImageIcon("images/0.png").getImage().getScaledInstance(1024, 786, 0);
		 
		 
		 btn = new JButton("start");
		 btn.setBounds(450, 400, 200, 100);
		 btn.setBackground(Color.white);
		 btn.setBorderPainted(false);
		 btn.setOpaque(false);
		 
		  JPanel panel3 = new JPanel();
		  JLabel roomLabel = new JLabel(new ImageIcon(punch));
		  roomLabel.add(btn, "South");
		  panel3.add(roomLabel);
//		  panel3.add(btn,"South");
		     
		     
		     
	     // JPanel panel4 = new JPanel();
	     // JLabel talkLabel = new JLabel(new ImageIcon(talk));
		 // panel4.add(talkLabel);
	      

		  
//		  btn = new JButton(">>");
//		  btn.setBounds(900, 600, 50, 50);
//		  roomLabel.add(btn);
//		  panel3.add(btn,"South");
//		  mf.add(btn);
		  
		  btn.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	  Changepanel.changepanel(mf, start, new Open1(mf));
	            	mf.remove(btn);
	  	           mf.remove(panel3);
	  	           //mf.remove(panel4);
	  	           
	               
	            }
	         });

		  

		  
		  this.add(panel3);
		  //this.add(panel4);

		  mf.add(this,"South");
		 // mf.add(panel4,"South");
		  
	      mf.setVisible(true);
	      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
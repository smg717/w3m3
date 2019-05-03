package com.kh.project.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Open2 extends JPanel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8020610765716293894L;
	private MainFrame mf;
	private JPanel open2;
	private JButton btn;
	
	public Open2(MainFrame mf) {
		
		this.mf= mf;
		this.open2 = this;
		
		 Image talk = new ImageIcon("images/2.png").getImage().getScaledInstance(1024, 200, 0);
		 Image room = new ImageIcon("images/¹æ.png").getImage().getScaledInstance(1024, 786, 0);
		 
		 
		 
		  JPanel panel3 = new JPanel();
		   JLabel roomLabel = new JLabel(new ImageIcon(room));
		   panel3.add(roomLabel);
		     
		     
		     
	      JPanel panel4 = new JPanel();
	      JLabel talkLabel = new JLabel(new ImageIcon(talk));
		  panel4.add(talkLabel);
	      

//		  btn = new JButton(">>");
		  btn=new JButton(new ImageIcon ("images/right.PNG"));

		  btn.setBounds(900, 600, 50, 50);
		  talkLabel.add(btn);
		  panel4.add(btn);
		  mf.add(btn);
		  
		  
		  this.add(panel3);
		  this.add(panel4);
		  
		  mf.add(this);
		  mf.add(panel4,"South");
		  
		  
		  btn.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	Changepanel.changepanel(mf, panel3, new Open3 (mf));
	               
	               mf.remove(btn);
	  	           mf.remove(panel3);
	  	           mf.remove(panel4);
	  	           
	               
	            }
	         });

		  

		  
	      mf.setVisible(true);
	      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

	


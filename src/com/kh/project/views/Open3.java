package com.kh.project.views;

import java.awt.Button;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Open3 extends JPanel{
	
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8020610765716293894L;
	private MainFrame mf;
	private JPanel open3;
	private Button btn;
	
	public Open3(MainFrame mf) {
		
		this.mf= mf;
		this.open3 = this;
		
		 //Image talk = new ImageIcon("images/4.png").getImage().getScaledInstance(1024, 200, 0);
		 Image punch = new ImageIcon("images/��.png").getImage().getScaledInstance(1024, 786, 0);
		 
		 
		 
		  JPanel panel3 = new JPanel();
		  JLabel roomLabel = new JLabel(new ImageIcon(punch));
		  panel3.add(roomLabel);
		     
		     
		     
	     // JPanel panel4 = new JPanel();
	     // JLabel talkLabel = new JLabel(new ImageIcon(talk));
		 // panel4.add(talkLabel);
	      

		  btn = new Button(">>");
		  btn.setBounds(900, 600, 50, 50);
		  panel3.add(btn,"South");
		  
		  
		  
		  btn.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	  Changepanel.changepanel(mf, open3, new Open4(mf));
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

	

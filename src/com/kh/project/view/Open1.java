package com.kh.project.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Open1 extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -633467188519723346L;
	private JButton btn;
    private JPanel open1;
    private MainFrame mf;

	public Open1(MainFrame mf) {
		
		this.mf = mf;
        this.open1 = this;
        
		 Image talk = new ImageIcon("images/1.png").getImage().getScaledInstance(1024, 200, 0);
		 Image room = new ImageIcon("images/¹æ.png").getImage().getScaledInstance(1024, 786, 0);
		 
		 
		 
		  JPanel panel1 = new JPanel();
		   JLabel roomLabel = new JLabel(new ImageIcon(room));
		   panel1.add(roomLabel);
		     
		     
		     
	      JPanel panel2 = new JPanel();
	      JLabel talkLabel = new JLabel(new ImageIcon(talk));
		  panel2.add(talkLabel);
	      

//		  btn = new JButton(">>");
		  btn=new JButton(new ImageIcon ("images/right.PNG"));
		  btn.setBounds(900, 600, 50, 50);
		  talkLabel.add(btn);
		  panel2.add(btn);
		  mf.add(btn);
		  
		  
		  btn.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	           Changepanel.changepanel(mf, open1, new Open2(mf));
	           mf.remove(btn);
	           mf.remove(panel2);
	           mf.remove(panel1);
	           
//	           Popup p = new Popup();
//	           p.puzzle();
	            
	            }
	         });

		  this.add(panel1);
		  this.add(panel2);

		  mf.add(this);
		  mf.add(panel2,"South");
		  
		     mf.setVisible(true);
		      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	}

}

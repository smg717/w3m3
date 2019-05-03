package com.kh.project.view;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Popup extends JFrame{
	public Popup() {
		this.setSize(500, 500);
	      this.setLayout(null);
	      this.setLocation(50, 50);     
	      this.setVisible(true);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void GamePlay() {
	      this.setTitle("Puzzle");
	      this.setLayout(null);
	      JPanel panel = new JPanel();
	      panel.setSize(300, 150);
	      panel.setLayout(null);
	      JButton okButton = new JButton("»Æ¿Œ");
	      okButton.setSize(100, 30);
	      okButton.setLocation(100, 80);
	      okButton.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 Object obj = e.getSource();	 
	        	 if((JButton) obj == okButton) {
	        		 final Frame fs = new Frame("puzzle");
	        		 fs.setVisible(false);
	        		 fs.addWindowListener(new WindowAdapter() {
	        			 public void windowClosing(WindowEvent e) {
	        				 fs.setVisible(false);
	        				 fs.setLocation(200, 200);
	        			 }
	        		 });
	        	 }
	         }
	      });
	      panel.add(okButton);
	      this.add(panel);
	   }
}
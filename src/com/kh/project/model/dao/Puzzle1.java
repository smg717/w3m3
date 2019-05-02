package com.kh.project.model.dao;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Puzzle1 extends JPanel implements ActionListener{

	private ImageIcon backImg = new ImageIcon("imgaes/¹øÈ£");
	private Image img = backImg.getImage();
	
	public void paint(Graphics g) {
	      g.drawImage(img, 0, 0, this);
	   }
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	public Puzzle1() {}
	
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

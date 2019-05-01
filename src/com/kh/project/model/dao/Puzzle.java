package com.kh.project.model.dao;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Puzzle extends JPanel implements ActionListener{

	JButton[][] b = new JButton[3][3];
	JButton b1 = new JButton("START");
	JButton b2 = new JButton("EXIT");
	
	int[][] panCount = new int[3][3];
	
	int brow,bcol;

	public Puzzle() {
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,3,2,2));
		
		int k = 1;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				b[i][j] = new JButton(String.valueOf(k));
				p1.add(b[i][j]);
				b[i][j].addActionListener(this);
				k++;
			}
		}
		
		JPanel p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);
		
		setLayout(null);
		p1.setBounds(150, 50, 340, 300);
		p2.setBounds(150, 360, 340, 35);
		
		add(p1);
		add(p2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void getRand() {
		int[] num = new int[9];
		int su = 0;
		boolean bDash = false;
		for(int i = 0; i < 9; i++) {
			bDash = true;
			while(bDash) {
				su = (int)(Math.random() * 9);
				bDash = false;
				for(int j = 0; j < i; j++) {
					if(num[j] == su) {
						bDash = true;
						break;
					}
				}
			}
			num[i] = su;
			panCount[i/3][i%3] = su;
			if(su == 8) {
				brow = i/3;
				bcol = i%3;
			}
		}
	}
	
	public void display() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == brow && j == bcol) {
					b[i][j].setEnabled(false);
					b[i][j].setText("");
				}else {
					b[i][j].setEnabled(true);
					b[i][j].setText(String.valueOf(panCount[i][j] + 1));
				}
			}
		}
	}
	
	public boolean isEnd() {
		int k = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(panCount[i][j] != k)
				return false;
				k++;
			}
		}
		return false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			getRand();
			display();
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(e.getSource() == b[i][j]) {
					if(!(i == brow && Math.abs(bcol-j) == 1) || (j == bcol && Math.abs(brow - i) == 1))return;
					panCount[brow][bcol] = panCount[i][j];
					
					panCount[i][j] = 8;
					
					brow = i;
					bcol = j;
					
					display();
					if(isEnd()) {
						JOptionPane.showMessageDialog(this, "Game Over");
					}
				}
			}
		}
	}

public static void main(String[] args) {
	new Puzzle();
}
}


















package com.kh.project.model.dao;

import java.awt.Button;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game3 extends JFrame implements ActionListener{
	private int a = 0;
	private ImageIcon after =new ImageIcon("images/check.jpg");

	Image b = new ImageIcon("images/틀그찾.png").getImage()
			.getScaledInstance(1100,812,0);


	public Game3() {
		super("틀린그림찾기");

		Image image;
		JPanel NewWindowContainer = new JPanel();
		setContentPane(NewWindowContainer);
		JPanel panel = new JPanel();
		JLabel label = new JLabel(new ImageIcon(b));
		panel.add(label);
		NewWindowContainer.add(panel,"East");

		//버튼 설정

		JButton btn1=new JButton(" ");
		btn1.setBounds(325,386,70,70);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		btn1.setOpaque(false);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText("발견");
				btn1.setBorderPainted(false);
				btn1.setContentAreaFilled(true);
				btn1.setFocusPainted(false);
				btn1.setOpaque(false);
				a++;
			}
		});
		label.add(btn1);
		panel.add(label);

		JButton btn2=new JButton(" ");
		btn2.setBounds(120,430,70,70);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);
		btn2.setFocusPainted(false);
		btn2.setOpaque(false);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn2.setText("발견");
				btn2.setBorderPainted(false);
				btn2.setContentAreaFilled(true);
				btn2.setFocusPainted(false);
				btn2.setOpaque(true);
				a++;
			}
		});
		label.add(btn2);
		panel.add(label);


		JButton btn3=new JButton(" ");
		btn3.setBounds(90,350,70,70);
		btn3.setBorderPainted(false);
		btn3.setContentAreaFilled(false);
		btn3.setFocusPainted(false);
		btn3.setOpaque(false);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn3.setText("발견");
				btn3.setBorderPainted(false);
				btn3.setContentAreaFilled(true);
				btn3.setFocusPainted(false);
				btn3.setOpaque(true);
				a++;
			}
		});
		label.add(btn3);
		panel.add(label);


		JButton btn4=new JButton(" ");
		btn4.setBounds(460,300,70,70);
		btn4.setBorderPainted(false);
		btn4.setContentAreaFilled(false);
		btn4.setFocusPainted(false);
		btn4.setOpaque(false);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				btn4.setText("발견");
				btn4.setBorderPainted(false);
				btn4.setContentAreaFilled(true);
				btn4.setFocusPainted(false);
				btn4.setOpaque(true);
			}
		});
		label.add(btn4);
		panel.add(label);


		JButton btn5=new JButton(" ");
		btn5.setBounds(230,510,70,70);
		btn5.setBorderPainted(false);
		btn5.setContentAreaFilled(false);
		btn5.setFocusPainted(false);
		btn5.setOpaque(false);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn5.setText("발견");
				btn5.setBorderPainted(false);
				btn5.setContentAreaFilled(true);
				btn5.setFocusPainted(false);
				btn5.setOpaque(true);
				a++;
			}
		});
		label.add(btn5);
		panel.add(label);


		JButton btn6=new JButton(" ");
		btn6.setBounds(260,300,70,70);
		btn6.setBorderPainted(false);
		btn6.setContentAreaFilled(false);
		btn6.setFocusPainted(false);
		btn6.setOpaque(false);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn6.setText("발견");
				btn6.setBorderPainted(false);
				btn6.setContentAreaFilled(true);
				btn6.setFocusPainted(false);
				btn6.setOpaque(true);
				a++;
			}
		});
		label.add(btn6);
		panel.add(label);

		if(a==6) {
			  JOptionPane.showMessageDialog(this,"다음으로 넘어가겠습니다.");
			
		}
		
		
		setSize(1100,768);
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	//   
	//   @Override
	//   public void actionPerformed(ActionEvent e) {
	//	   Object obj = e.getSource();
	//	   if((Button)obj==btn1) {
	//		   
	//		   panel.add(btn1);
	//		   
	//	   }
	//   }
	//      

	public static void main(String[] args) {
		new Game3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
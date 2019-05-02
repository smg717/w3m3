
package com.kh.project.model.dao;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Puzzle extends JFrame implements ActionListener{
   private ImageIcon backImg = new ImageIcon("images/문제1.png");
   private Image img = backImg.getImage();
   
   public void paint(Graphics g) {
      g.drawImage(img, 0, 0, this);
   }
   
   Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
   public Puzzle(){
      super("Puzzle");
      
      JPanel NewWindowContainer = new JPanel();
      setContentPane(NewWindowContainer);

      b1 = new Button("1");
      b1.setBounds(238, 363, 43, 70);
      b2 = new Button("2");
      b2.setBounds(281, 363, 43, 70);
      b3 = new Button("3");
      b3.setBounds(325, 363, 43, 70);
      b4 = new Button("4");
      b4.setBounds(238, 430, 43, 70);
      b5 = new Button("5");
      b5.setBounds(281, 430, 43, 70);
      b6 = new Button("6");
      b6.setBounds(325, 430, 43, 70);
      b7 = new Button("7");
      b7.setBounds(238, 497, 43, 70);
      b8 = new Button("");
      b8.setBounds(281, 497, 43, 70);
      b9 = new Button("8");
      b9.setBounds(325, 497, 43, 70);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
      add(b6);
      add(b7);
      add(b8);
      add(b9);

      
      setSize(500, 800);
      setLayout(null);
      setVisible(true);
   }
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
	   Object obj = e.getSource();
	   
      if((Button)obj == b1) {
         String label = b1.getLabel();
         if(b2.getLabel().equals("")) {
            b2.setLabel(label);
            b1.setLabel("");
         }
         if(b4.getLabel().equals("")) {
            b4.setLabel(label);
            b1.setLabel("");
         }
      }
      
      if((Button)obj == b2) {
         String label = b2.getLabel();
         if(b1.getLabel().equals("")) {
            b1.setLabel(label);
            b2.setLabel("");
         }
         if(b3.getLabel().equals("")) {
            b3.setLabel(label);
            b2.setLabel("");
         }
         if(b5.getLabel().equals("")) {
            b5.setLabel(label);
            b2.setLabel("");
         }
      }
      if((Button)obj == b3) {
         String label = b3.getLabel();
         if(b2.getLabel().equals("")) {
            b2.setLabel(label);
            b3.setLabel("");
         }
         if(b6.getLabel().equals("")) {
            b6.setLabel(label);
            b3.setLabel("");
         }
      }
      if((Button)obj == b4) {
         String label = b4.getLabel();
         if(b1.getLabel().equals("")) {
            b1.setLabel(label);
            b4.setLabel("");
         }
         if(b7.getLabel().equals("")) {
            b7.setLabel(label);
            b4.setLabel("");
         }
         if(b5.getLabel().equals("")) {
            b5.setLabel(label);
            b4.setLabel("");
         }
      }
      if((Button)obj == b5) {
         String label = b5.getLabel();
         if(b2.getLabel().equals("")) {
            b2.setLabel(label);
            b5.setLabel("");
         }
         if(b6.getLabel().equals("")) {
            b6.setLabel(label);
            b5.setLabel("");
         }
         if(b4.getLabel().equals("")) {
            b4.setLabel(label);
            b5.setLabel("");
         }
         if(b8.getLabel().equals("")) {
            b8.setLabel(label);
            b5.setLabel("");
         }
      }
      if((Button)obj == b6) {
         String label = b6.getLabel();
         if(b9.getLabel().equals("")) {
            b9.setLabel(label);
            b6.setLabel("");
         }
         if(b5.getLabel().equals("")) {
            b5.setLabel(label);
            b6.setLabel("");
         }
      }
      if((Button)obj == b7) {
         String label = b7.getLabel();
         if(b4.getLabel().equals("")) {
            b4.setLabel(label);
            b7.setLabel("");
         }
         if(b8.getLabel().equals("")) {
            b8.setLabel(label);
            b7.setLabel("");
         }
      }
      if((Button)obj == b8) {
         String label = b8.getLabel();
         if(b9.getLabel().equals("")) {
            b9.setLabel(label);
            b8.setLabel("");
         }
         if(b7.getLabel().equals("")) {
            b7.setLabel(label);
            b8.setLabel("");
         }
         if(b5.getLabel().equals("")) {
            b5.setLabel(label);
            b8.setLabel("");
         }
      }
      if((Button)obj == b9) {
         String label = b9.getLabel();
         if(b6.getLabel().equals("")) {
            b6.setLabel(label);
            b9.setLabel("");
         }
         if(b8.getLabel().equals("")) {
            b8.setLabel(label);
            b9.setLabel("");
         }
      }
      
      if (b1.getLabel().equals("1")&&b2.getLabel().equals("2")
            &&b3.getLabel().equals("3")&&b4.getLabel().equals("4")
            &&b5.getLabel().equals("5")&&b6.getLabel().equals("6")
            &&b7.getLabel().equals("7")&&b8.getLabel().equals("8")
            &&b9.getLabel().equals("")) 
    	  
      {
       JOptionPane.showMessageDialog(this,"占쏙옙占쏙옙占쏙옙占� 획占쏙옙占싹셨쏙옙求占�!");
      }

     
   }
      public void close() {
    	  this.addWindowListener(new WindowAdapter() {
    		  public void windowClosing(WindowEvent e) {
    			  setVisible (false);
    			  dispose();
    		  }
    	  });
    	  this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    
   
   
   
public static void main(String[] args) {
   new Puzzle();
}
}
 


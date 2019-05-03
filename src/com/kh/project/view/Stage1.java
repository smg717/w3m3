package com.kh.project.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.model.dao.Game3;
import com.kh.project.model.dao.Puzzle;

public class Stage1 extends JPanel{//¹öÆ°¼¼°³³Ö±â
   /**
    * 
    */
   private static final long serialVersionUID = 7124297795662955232L;
   private JPanel stage1;
   private MainFrame mf;

   public Stage1(MainFrame mf) {
      this.mf = mf;
      this.stage1 = this;
      Image back = new ImageIcon("images/¹æ.PNG").getImage()
            .getScaledInstance(1024, 768, 0);

      JPanel panel = new JPanel();
      JLabel label1 = new JLabel(new ImageIcon(back));
      panel.add(label1);

      JButton key = new JButton(new ImageIcon("images/Å°.png"));
      key.setBounds(300, 50, 130, 120);
      key.setBackground(Color.white);
      key.setBorderPainted(false);
      key.setOpaque(false);    
      label1.add(key);
      panel.add(key);
      mf.add(key);
      
//      JButton btn2 = new JButton(new ImageIcon("images/¹æ¾î±¸.png"));
      JButton btn2 = new JButton(new ImageIcon("images/Çï¸ä.png"));
      btn2.setBounds(700, 400, 312, 190);
      btn2.setBackground(Color.white);
      btn2.setBorderPainted(false);
      btn2.setOpaque(false);    
      label1.add(btn2);
      panel.add(btn2);
      mf.add(btn2);
      

//      JButton btn = new JButton("11");
      JButton btn=new JButton(new ImageIcon ("images/right.PNG"));
      btn.setBounds(900, 600, 50, 50);

      label1.add(btn);
      panel.add(btn);
      mf.add(btn);

      btn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            Changepanel.changepanel(mf,stage1, new Stage2(mf));
            mf.remove(btn);
            mf.remove(btn2);
            mf.remove(key);
            mf.remove(panel);
         }
      });
      key.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            Puzzle pz = new Puzzle();
            mf.remove(key);
            
         }
      });
      btn2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
        	 Game3 g3 = new Game3();
        	  mf.remove(btn2);
              mf.remove(key);
              mf.remove(panel);
          }
       });
      
      this.add(panel);
      
  

      //      stage1.add(label1,"center");
      //      mf.add(stage1);

      mf.add(this);

      mf.add(panel,"South");

      mf.setVisible(true);
      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




   }

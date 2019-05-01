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

public class Ending1 extends JPanel{
   /**
    * 
    */
   private static final long serialVersionUID = -4131765956688022107L;
   private JPanel ending1;
   private MainFrame mf;

   public Ending1(MainFrame mf) {
      this.mf = mf;
      this.ending1 = this;

      Image icon = new ImageIcon("images/탈출.png")
            .getImage().getScaledInstance(1024, 768, 0); //이미지 사이즈
      
      JPanel panel = new JPanel();
      JLabel label = new JLabel(new ImageIcon(icon));
      panel.add(label);
      
      
      JButton btn = new JButton("게임종료");
      btn.setBounds(460, 350, 100, 100);
      btn.setBackground(Color.white);
      btn.setBorderPainted(false);
      
      
      label.add(btn);
      panel.add(btn);
      mf.add(btn);
      
      btn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn) {
               System.exit(0);
            }
         }
         
      });
      
      this.add(panel);


      mf.add(this);
      mf.add(panel);
      
      mf.setVisible(true);
      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
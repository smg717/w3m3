package com.kh.project.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ending2 extends JPanel{
   //   private JPanel ending2;
   //   private MainFrame mf;
   //   
   //   public Ending2(MainFrame mf) {
   //      this.mf = mf;
   //      this.ending2 = this;
   //      
   //      Button btn = new Button();


   private JPanel ending2;
   private MainFrame mf;

   public Ending2(MainFrame mf) {
      this.mf = mf;
      this.ending2 = this;

      JPanel panel = new JPanel();

      Image icon = new ImageIcon("images/끝.png").getImage().getScaledInstance(1024, 768, 0); //이미지 사이즈

      JLabel label = new JLabel(new ImageIcon(icon));
      JButton btn = new JButton("게임종료");
      btn.setBounds(460, 360, 100, 100);
//      btn.setBackground(Color.GRAY);
//      btn.setBorderPainted(false);
//      btn.setOpaque(false);
      btn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn) {
               System.exit(0);
            }
         }

      });


      label.add(btn,"CENTER");

      panel.add(label, "Center");
      mf.add(panel);


   }
}
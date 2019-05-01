package com.kh.project.views;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Stage2 extends JPanel {
   private JPanel stage2;
   private MainFrame mf;

   @SuppressWarnings("unused")
   
   public Stage2(MainFrame mf) {
      this.mf = mf;
      this.stage2 = this;

      Image back = new ImageIcon("images/¹æ¹®.PNG").getImage()
            .getScaledInstance(1024, 768, 0);

      JPanel panel = new JPanel();
      JLabel label1 = new JLabel(new ImageIcon(back));
      panel.add(label1);

      JButton btn = new JButton("22");
      btn.setBounds(900, 600, 50, 50);
      
      label1.add(btn);
      panel.add(btn);
      mf.add(btn);
//      if(true) {
         btn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               Changepanel.changepanel(mf,stage2, new Ending1(mf));
               mf.remove(btn);
               mf.remove(panel);
//               mf.remove(this);
            }
         });
//         }
//      else {
         btn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               Changepanel.changepanel(mf,stage2, new Ending2(mf));
               mf.remove(btn);
               mf.remove(panel);
            }
         });
//      }
      
      this.add(panel);
      
      mf.add(this);
      mf.add(panel,"South");
      
      mf.setVisible(true);
      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   /**
    * 
    */
   private static final long serialVersionUID = 7124297795662955232L;

}

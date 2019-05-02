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

import com.kh.project.model.dao.Puzzle;

public class Stage1 extends JPanel{//버튼세개넣기
   /**
    * 
    */
   private static final long serialVersionUID = 7124297795662955232L;
   private JPanel stage1;
   private MainFrame mf;

   public Stage1(MainFrame mf) {
      this.mf = mf;
      this.stage1 = this;
      Image back = new ImageIcon("images/방.PNG").getImage()
            .getScaledInstance(1024, 768, 0);

      JPanel panel = new JPanel();
      JLabel label1 = new JLabel(new ImageIcon(back));
      panel.add(label1);

      JButton key = new JButton(new ImageIcon("images/금고2.jpg"));
      key.setBounds(800, 400, 200, 200);
      key.setBackground(Color.white);
      key.setBorderPainted(false);
      key.setOpaque(false);    
      label1.add(key);
      panel.add(key);
      mf.add(key);

      JButton btn = new JButton("11");
      btn.setBounds(900, 600, 50, 50);

      label1.add(btn);
      panel.add(btn);
      mf.add(btn);

      btn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            Changepanel.changepanel(mf,stage1, new Stage2(mf));
            mf.remove(btn);
            mf.remove(key);
            mf.remove(panel);
         }
      });
      this.add(panel);
      
      key.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Puzzle pz = new Puzzle();
			
		}
    	  
      });

      //      stage1.add(label1,"center");
      //      mf.add(stage1);

      mf.add(this);

      mf.add(panel,"South");

      mf.setVisible(true);
      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




   }
}












































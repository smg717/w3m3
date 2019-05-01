package com.kh.project.views;

import javax.swing.JFrame;

import com.kh.project.model.dao.Puzzle;

public class MainFrame extends JFrame{
   {
      
      this.setSize(1024, 768);
//      this.setLayout(null);
//      new Ending2(this);
//      new Stage1(this);
//      new Start(this);
      new Open1(this);
        
      this.setTitle("食切実 害切実");
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
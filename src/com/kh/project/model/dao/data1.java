package com.kh.project.model.dao;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
public class data1 {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
 
    public data1() {
        prepareGUI();
    }
 
    public static void main(String[] args) {
        data1 awtControlDemo = new data1();
        awtControlDemo.showButton();
        JPanel panel = new JPanel();
        
    }
 
    
    
    public void prepareGUI() {
        //panel 셋팅
        Frame panel = new Frame("ROOMESCPAE");
        panel.setSize(400, 400);
        panel.setLayout(new GridLayout(3, 1));
        panel.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                

            }
        });
        
        // 상단에 있는 라벨
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setText("int long float");
 
        // 하단 상태값 라벨
        statusLabel = new Label();
        statusLabel.setText("ROOMESCAPE");
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
 
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
 
        panel.add(headerLabel);
        panel.add(controlPanel);
        panel.add(statusLabel);
        panel.setVisible(true);
       

    }
 
    void showButton() {
 
        Button btnone = new Button("434");
        Button btntwo = new Button("424");
        Button btnthree = new Button("484");
        Button btnfour = new Button("444");

 
 
        btnone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("오답입니다");
            }
        });
 
        btntwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("오답입니다");
            }
        });
 
        btnthree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("방이 열렸습니다");
                System.exit(0);
            }
        });
   
        btnfour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("오답입니다");
            }
        });
      
        controlPanel.add(btnone);
        controlPanel.add(btntwo);
        controlPanel.add(btnthree);
        controlPanel.add(btnfour);
      
 
        mainFrame.setVisible(true);
       
 
    }
}



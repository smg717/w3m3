package com.kh.project.model.dao;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;

public class Data5 {
    public Frame mainFrame;
    public Label headerLabel;
    public Label statusLabel;
    public Panel controlPanel;
 
    public Data5() {
        GUI();
    }
 
    public static void main(String[] args) {
    	Data5 awtControlDemo = new Data5();
        awtControlDemo.show();
        JPanel panel = new JPanel();
        
    }
 
    
    
    public void GUI() {
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
        headerLabel.setText("지역변수 생성시기는?");
 
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
 
    void show() {
 
        Button btnone = new Button("메소드 종료시");
        Button btntwo = new Button("객체 소멸시");
        Button btnthree = new Button("메소드 실행시");
        Button btnfour = new Button("객체 생성시");

 
 
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
                statusLabel.setText("정답입니다.문이 열렸습니다.");
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


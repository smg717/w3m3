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
	 
	public class Data3 {
	    public Frame mainFrame;
	    public Label headerLabel;
	    public Label statusLabel;
	    public Panel controlPanel;

	    
	    public Data3() {
	        GUI();
	        
	        
	    }
	 
	    public static void main(String[] args) {
	    	Data3 awtControlDemo = new Data3();
	        awtControlDemo.show();
	        JPanel panel = new JPanel();
	        
	    }
	 
	    
	    
	    public void GUI() {
	        //panel ����
	        Frame panel = new Frame("ROOMESCPAE");
	        panel.setSize(400, 400);
	        panel.setLayout(new GridLayout(3, 1));
	        panel.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent windowEvent) {
	              

	            }
	        });
	        
	        
	        // ��ܿ� �ִ� ��
	        headerLabel = new Label();
	        headerLabel.setAlignment(Label.CENTER);
	        headerLabel.setText("_verload");
	 
	        // �ϴ� ���°� ��
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
	 
	        Button btnone = new Button("1");
	        Button btntwo = new Button("2");
	        Button btnthree = new Button("3");
	        Button btnfour = new Button("4");
	        Button btnfive = new Button("5");
	        Button btnsix = new Button("6");
	        Button btnseven = new Button("7");
	        Button btneight = new Button("8");
	        Button btnnine = new Button("9");
	        Button btnzero = new Button("0");
	        
	 
	        btnone.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	               
	            }
	        });
	        
	        btntwo.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	            }
	        });
	 
	        btnthree.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	            }
	        });
	   
	        btnfour.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	                
	            }
	        });
	        btnfive.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("���� ���Ƚ��ϴ�");
	                System.exit(0);
	            }
	        });
	        btnsix.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	            }
	        });
	        btnseven.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	            }
	        });
	        btneight.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	            }
	        });
	        btnnine.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	            }
	        });
	        btnzero.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
	            }
	        });


	        
	        controlPanel.add(btnone);
	        controlPanel.add(btntwo);
	        controlPanel.add(btnthree);
	        controlPanel.add(btnfour);
	        controlPanel.add(btnfive);
	        controlPanel.add(btnsix);
	        controlPanel.add(btnseven);
	        controlPanel.add(btneight);
	        controlPanel.add(btnnine);
	        controlPanel.add(btnzero);
	      
	 
	        mainFrame.setVisible(true);
	       
	 
	    }

		private void addWindowListener(WindowAdapter windowAdapter) {
			// TODO Auto-generated method stub
			
		}
	}





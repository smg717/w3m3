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
	 
	public class Data2 {
	    public Frame mainFrame;
	    public Label headerLabel;
	    public Label statusLabel;
	    public Panel controlPanel;

	    
	    public Data2() {
	        GUI();
	        
	    }
	 
	    public static void main(String[] args) {
	    	Data2 awtControlDemo = new Data2();
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
	        headerLabel.setText("�߻�ȭ�� ���� �ùٸ� ������ �����ÿ�");
	 
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
	 
	    public void show() {
	 
	        Button btnone = new Button("�������� Ȯ���ϱ� ���� ��ü������ �������� ����");
	        Button btntwo = new Button("���α׷����� ���ʿ������� �������� �ʴ´�");
	        Button btnthree = new Button("���α׷����� ���ʿ��� �� ����");
	        Button btnfour = new Button("�������� Ȯ���ϱ����� ��ü���� ���� ����");

	 
	 
	        btnone.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("���� ���Ƚ��ϴ�");
	                System.exit(0);
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
	        


	        
	        controlPanel.add(btnone);
	        controlPanel.add(btntwo);
	        controlPanel.add(btnthree);
	        controlPanel.add(btnfour);
	      
	 
	        mainFrame.setVisible(true);
	       
	 
	    }

		private void addWindowListener(WindowAdapter windowAdapter) {
			// TODO Auto-generated method stub
			
		}
	}



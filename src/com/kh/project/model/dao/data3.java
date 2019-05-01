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
	 
	public class data3 {
	    private Frame mainFrame;
	    private Label headerLabel;
	    private Label statusLabel;
	    private Panel controlPanel;

	    
	    public data3() {
	        prepareGUI();
	        
	    }
	 
	    public static void main(String[] args) {
	        data3 awtControlDemo = new data3();
	        awtControlDemo.showButton();
	        JPanel panel = new JPanel();
	        Image icon = new ImageIcon("src/ujooujoo/tool.JPG").getImage().getScaledInstance(1024, 200, 0);
	    }
	 
	    
	    
	    private void prepareGUI() {
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
	 
	    private void showButton() {
	 
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
	                statusLabel.setText("���� ���Ƚ��ϴ�");
	                System.exit(0);
	            }
	        });
	        btnfive.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("�����Դϴ�");
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




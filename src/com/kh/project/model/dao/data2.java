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
	 
	public class data2 {
	    private Frame mainFrame;
	    private Label headerLabel;
	    private Label statusLabel;
	    private Panel controlPanel;

	    
	    public data2() {
	        prepareGUI();
	        
	    }
	 
	    public static void main(String[] args) {
	        data2 awtControlDemo = new data2();
	        awtControlDemo.showButton();
	        JPanel panel = new JPanel();
	       
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
	        headerLabel.setText("�߻�ȭ�� ���� �ùٸ� ������ ���ÿ�");
	 
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




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
	        headerLabel.setText("추상화에 대해 올바른 설명을 고르시오");
	 
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
	 
	    private void showButton() {
	 
	        Button btnone = new Button("유연성을 확보하기 위해 구체적이지 않은것은 제거");
	        Button btntwo = new Button("프로그램에서 불필요한점을 추출하지 않는다");
	        Button btnthree = new Button("프로그램에서 불필요한 것 저장");
	        Button btnfour = new Button("유연성을 확보하기위해 구체적인 것은 제거");

	 
	 
	        btnone.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("문이 열렸습니다");
	                System.exit(0);
	            }
	        });
	        
	        btntwo.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("오답입니다");
	            }
	        });
	 
	        btnthree.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                statusLabel.setText("오답입니다");
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

		private void addWindowListener(WindowAdapter windowAdapter) {
			// TODO Auto-generated method stub
			
		}
	}




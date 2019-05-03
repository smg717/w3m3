package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class BaseballGameClass extends JFrame implements ActionListener {
   JPanel pl_textView, pl_ta, pl_tf;
   JPanel pl_btView, pl_bt1, pl_bt2;
   JButton bt_start, bt_clear, bt_answer, bt_addFunc, bt_exit;
   JTextArea ta;
   JScrollPane scr;
   JLabel lb1, lb2, lb3;
   JTextField tf1, tf2, tf3;
   
   private boolean swit[];
   private int hideNums[];
   private int userNums[];
   private int chance, round, strike, ball;
   
   public void init() {
      chance =10;
      round =0;
      hideNums = new int[3];
      userNums = new int[3];
      for(int i =0; i<userNums.length;i++) {
         userNums[i] = -1;
      }
      swit = new boolean[10];
      for(int i=0; i<swit.length; i++) {
         swit[i] = false;
      }
      while(true) {
         int i=0;
         while(i<hideNums.length) {
            int temp = (int)(Math.random() * 10);
            if(swit[temp] == false) {
               swit[temp] =true;
               hideNums[i] = temp+1;
               i++;
            }else {
               continue;
            }
         }
         break;
      }
   }
   
   public BaseballGameClass() {
      super("Number Baseball mini-Game!");
      
      pl_textView = new JPanel();
      pl_textView.setLayout(new BorderLayout());
      
      pl_ta = new JPanel();
      pl_ta.setLayout(new BorderLayout(5,5));
      pl_ta.setBackground(Color.BLACK);
      
      ta = new JTextArea("# Baseball Game!!" + "\n"+"★게임으로 아이템을 획득 할 수 있습니다. 게임시작을 눌러주세요!" + "\n");
      ta.setFont(new Font("Gothic", Font.BOLD,20));
      ta.setEditable(false);
      scr = new JScrollPane(ta);
      scr.setBorder(new BevelBorder(BevelBorder.LOWERED));
      pl_ta.add("Center",scr);
      pl_ta.add("North", new JLabel());
      pl_ta.add("East", new JLabel());
      pl_ta.add("West", new JLabel());
      pl_textView.add("Center", pl_ta);
      
      pl_tf = new JPanel();
      pl_tf.setLayout(new FlowLayout());
      pl_tf.setBackground(Color.ORANGE);
      
      lb1 = new JLabel("1번 공격");
      pl_tf.add(lb1);
      tf1 =new JTextField(5);
      tf1.setEditable(false);
      pl_tf.add(tf1);
      lb2 = new JLabel("2번공격");
      pl_tf.add(lb2);
      tf2 = new JTextField(5);
      tf2.setEditable(false);
      pl_tf.add(tf2);
      lb3 = new JLabel("3번 공격");
      pl_tf.add(lb3);
      tf3 = new JTextField(5);
      tf3.setEditable(false);
      pl_tf.add(tf3);
      pl_textView.add("South", pl_tf);
      
      pl_btView = new JPanel();
      pl_btView.setLayout(new GridLayout(1,3));
      
      bt_start = new JButton("Game Start");
      pl_btView.add(bt_start);
      
      pl_bt1 = new JPanel();
      pl_bt1.setLayout(new GridLayout(2,1));
      
      bt_clear = new JButton("Reset");
      bt_clear.setEnabled(false);
      pl_bt1.add(bt_clear);
      bt_answer = new JButton("Answer");
      bt_answer.setEnabled(false);
      pl_bt1.add(bt_answer);
      pl_btView.add(pl_bt1);
      
      pl_bt2 = new JPanel();
      pl_bt2.setLayout(new GridLayout(2,1));
      
      bt_addFunc = new JButton("AddFunc");
      pl_bt2.add(bt_addFunc);
      bt_exit = new JButton("Exit");
      pl_bt2.add(bt_exit);
      pl_btView.add(pl_bt2);
      
      setLayout(new BorderLayout());
      setBackground(Color.LIGHT_GRAY);
      add("Center", pl_textView);
      add("South", pl_btView);
      
      setVisible(true);
      setBounds(720,290,480,500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Listener();
      
   }
   
   public void Listener() {
      tf1.addActionListener(this);
      tf2.addActionListener(this);
      tf3.addActionListener(this);
      bt_start.addActionListener(this);
      bt_clear.addActionListener(this);
      bt_answer.addActionListener(this);
      bt_addFunc.addActionListener(this);
      bt_exit.addActionListener(this);
   }
   public boolean check(String str) {
      boolean check =true;
      if(str.length() < 1 || str.length() > 2) {
         check = false;
      }
      for(int i =0; i<str.length(); i++) {
         char c =str.charAt(i);
         if((int)c < 48||(int)c > 57) {
            JOptionPane.showMessageDialog(null, "1~10 사이의 수를 입력하세요");
            check = false;
         }
      }
      return check;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = (Object)e.getSource();
      if(obj == bt_start) {
         init();
         for(int i=0; i<swit.length;i++) {
            swit[i] = false;
         }
         tf1.setEditable(true); //1번 공격 열기
         bt_clear.setEnabled(true);
         bt_answer.setEnabled(true);
         bt_start.setEnabled(false);
         ta.append("# Game Start !!!" + "\n");
         ta.append("# 1번칸에 공격할 수를 입력하세요 (1~10)" + "\n");
      } else if(obj == tf1) {
         if(tf1.equals("")) {
            return;
         }
         String temp = tf1.getText();
         if(check(temp)) {
            ta.append("# 2번칸에 공격할 수를 입력하세요 (1~10)" + "\n");
            tf2.setEditable(true);
         }else {
            tf1.setText("");
         }
      } else if(obj == tf2) {
         if(tf2.equals("")) {
            return;
         }
         if(tf1.getText().equals(tf2.getText())) {
            JOptionPane.showMessageDialog(this, "중복되지 않는 숫자를 입력해주세요");
            tf2.setText("");
            return;
         }
         String temp = tf2.getText();
         if(check(temp)) {
            ta.append("# 3번칸에 공격할 수를 입력하세요(1~10)" + "\n");
            tf3.setEditable(true);
         }else {
            tf2.setText("");
         }
      } else if(obj == tf3) {
         if(tf3.equals("")) {
            return;
         }
         if(tf1.getText().equals(tf3.getText())|| tf2.getText().equals(tf3.getText())) {
            JOptionPane.showMessageDialog(this, "중복되지 않는 숫자를 입력해주세요");
            tf3.setText("");
            return;
         }
         String temp = tf3.getText();
         if(check(temp)) {
            userNums[0] = Integer.parseInt(tf1.getText());
            userNums[1] = Integer.parseInt(tf2.getText());
            userNums[2] = Integer.parseInt(tf3.getText());
            
            strike =0;
            ball = 0;
            
            String userNumber = "공격  : [" + tf1.getText() + "]" + "[" + tf2.getText() + "]" + "["+tf3.getText()
                              + "]";
            ta.append(userNumber + "\n");
            
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            
            //strike
            for(int i =0; i<hideNums.length;i++) {
               if(hideNums[i] == userNums[i]) {
                  strike++;
               }
            }
            
            //ball
            for(int i=0; i<hideNums.length; i++) {
               for(int j=0; j<userNums.length; j++) {
                  if(hideNums[i] == userNums[j] && i != j) {
                     ball++;
                  }
               }
            }
            if(strike == hideNums.length) {
               ta.append("축하합니다!!" + "\n"+ (chance - round)+ "기회를 남기고 "+ "\n" + "타자를"+ hideNums.length
                        + "strike로 이겨 아이템을 획득합니다!!" );
            }else {
               round++;
               ta.append((chance - round) + "기회가 남았습니다"+ "\n" + "<<"+ strike+ "Strike \t"+ball 
                     + "Ball !!! >> " + "\n" );
            }
            if(round == chance) {
               ta.append("Game Over!! 기회를 모두 소진하였습니다."+ "\n");
            }   
         }else {
            tf3.setText("");
            return;
         }
      } else if(obj == bt_clear) {
         new BaseballGameClass();
         this.dispose();
      }else if(obj == bt_answer) {
         String answer = "[" + hideNums[0] + "]" + "[" + hideNums[1] + "]" + "[" + hideNums[2] +"]";
         ta.append("정답은 : " + answer + "입니다."+ "\n");
      }else if(obj == bt_addFunc) {
         JOptionPane.showMessageDialog(null, "추가기능입니다");
      }else if(obj == bt_exit) {
         System.exit(0);
      }
   }
   public static void main(String[] args) {
      new BaseballGameClass();
   }


}
package com.kh.project.view;

import javax.swing.JPanel;

public class Changepage {
	public static void changepanel(MainFrame mf, JPanel op, JPanel np) {
		mf.remove(op);
		mf.add(np);
		mf.repaint();
	}
}
package com.prithvi.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class TwoButtons {

	JFrame frame;
	JLabel label;
	
	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();
	}

	void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Change Label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change Color");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("label");
		
		MyDrawPanel panel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setVisible(true);
		frame.setSize(300, 300);
	}
	class ColorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.repaint();
		}

	}
	class LabelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Hey");
		}

	}
	
}

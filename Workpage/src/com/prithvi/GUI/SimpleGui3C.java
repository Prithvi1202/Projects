package com.prithvi.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui3C implements ActionListener {
	JFrame frame = new JFrame();
	public static void main(String [] args){
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go(){
	 frame = new JFrame();
		JButton button = new JButton("Change colors");

		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 300);
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		frame.repaint();
	}
	
}

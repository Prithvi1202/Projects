package com.prithvi.GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class IODemo {

	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		JTextArea textArea = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(textArea); 
		textArea.setEditable(true);
		frame.getContentPane().add(BorderLayout.WEST, textArea);
		
		JButton button = new JButton("Click me");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.getContentPane().add(button);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(300, 300);
		
		frame.setVisible(true);
	}
}

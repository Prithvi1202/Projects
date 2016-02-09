package com.prithvi.GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {
	
	int x = 200;
	int y = 200;
	
	public static void main(String []ar){
		SimpleAnimation sa = new SimpleAnimation();
		sa.go();
	}
	void go(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel1 panel = new MyDrawPanel1();
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		frame.setSize(300, 300);
		for(int i= 0; i< 200;i++){
			x--;
			y--;
			frame.repaint();
			
			try{
				Thread.sleep(50);
			}catch(Exception e){}
		}
	}
	class MyDrawPanel1 extends JPanel{

		public void paintComponent(Graphics g){
			g.setColor(Color.CYAN);
			g.fillOval(x, y, 40, 40);
		}
	}
	
}

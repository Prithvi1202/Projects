package com.prithvi.GUI;


import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class SwingApplication {

	private static final long serialVersionUID = 8406680476009847027L;
	JFrame frame;
	JTextArea textArea;

	public SwingApplication() {

		frame = new JFrame("Swing Application");
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JPanel panel = new JPanel();
		frame.add(panel);

		// Windows Look and Feel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		
		createComponents(panel);

		frame.setVisible(true);
	}

	public void createComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel label1 = new JLabel();
		label1.setText("Select a file!");
		label1.setBounds(200, 50, 250, 40);
		panel.add(label1);

		JButton button1 = new JButton();
		button1.setText("Select");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				File selectedFile = null;

				if (fileChooser.showOpenDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {
					selectedFile = fileChooser.getSelectedFile();
					System.out.println("Selected file: "
							+ selectedFile.getAbsolutePath());
				}

				StringBuilder sb = new StringBuilder();
				BufferedReader br = null;
				try {
					String strCurrentLine;
					br = new BufferedReader(new FileReader(selectedFile));
					while ((strCurrentLine = br.readLine()) != null) {
						System.out.println(strCurrentLine);
						sb.append(strCurrentLine);
						sb.append("\n");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if (br != null)
							br.close();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}

				textArea.setText(sb.toString());
			}
		});
		button1.setBounds(310, 60, 75, 25);
		panel.add(button1);

		textArea = new JTextArea("");
		textArea.setSize(400, 400);

		textArea.setLineWrap(true);
		textArea.setEditable(true);
		textArea.setVisible(true);

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(100, 100, 350, 350);

		panel.add(scroll);

		JButton button2 = new JButton();
		button2.setText("Save to file");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser fileChooser = new JFileChooser();
				if (fileChooser.showSaveDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();

					System.out.println("Selected file: "
							+ file.getAbsolutePath());
					// save to file

					System.out.println(textArea.getText());
					String taText = textArea.getText();

					try {
						FileWriter fw = new FileWriter(file);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(taText);
						bw.close();


					} catch (IOException e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		button2.setBounds(200, 500, 100, 25);
		panel.add(button2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingApplication();
	}

}

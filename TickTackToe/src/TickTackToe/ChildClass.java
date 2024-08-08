package TickTackToe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChildClass extends JFrame implements ActionListener{
	
	
	ChildClass(){
		
		///ImageIcon
		ImageIcon icon = new ImageIcon("icon.png");
		
		///Labels
		JLabel label = new JLabel();
		label.setText("Tic Tac Toe");
		
		///Panels
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.orange);
		topPanel.setBounds(0, 0, 500, 100);
		
		///Buttons
		JButton mulButton = new JButton();
		mulButton.setBounds(100, 100, 200, 60);
		mulButton.setFocusable(false);
		
		///Adding to frame
		//this.add(mulButton);
		this.add(topPanel);
		topPanel.add(label);
		
		///For Frame
		this.setTitle("Tic Tac Toe");
		this.setIconImage(icon.getImage());
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
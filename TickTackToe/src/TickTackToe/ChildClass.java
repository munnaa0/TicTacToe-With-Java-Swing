package TickTackToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChildClass extends JFrame implements ActionListener{
	
	
	ChildClass(){
		
		///ImageIcon
		ImageIcon icon = new ImageIcon("icon.png");
		
		///Buttons
		JButton mulButton = new JButton();
		
		
		///Adding to frame
		this.add(mulButton);
		
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
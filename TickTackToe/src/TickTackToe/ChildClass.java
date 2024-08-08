package TickTackToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ChildClass extends JFrame implements ActionListener{
	
	
	ChildClass(){
		
		///ImageIcon
		ImageIcon icon = new ImageIcon("icon.png")
		
		///For Frame
		this.setTitle("Tic Tac Toe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
package TickTackToe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChildClass extends JFrame implements ActionListener {

	///Variable declare
	JPanel panelTop;
	int i;
	JPanel panelGame;
	JButton[] button = new JButton[9];
	ChildClass()
	{
		panelTop = new JPanel();
		panelTop.setBounds(0,0,700,100);
		panelTop.setBackground(Color.orange);
		
		panelGame = new JPanel();
		panelGame.setBounds(0,100,700,600);
		panelGame.setBackground(Color.cyan);
		panelGame.setLayout(new GridLayout(3,3));
		
		//For Buttons
		for(i = 0;i<9;i++) {
			button[i] = new JButton();
			button[i].setBackground(Color.cyan);
			button[i].setFont(new Font("Tahoma",Font.PLAIN,220));
			button[i].setForeground(Color.magenta);
			button[i].setFocusable(false);
			button[i].addActionListener(this);
		}
		//Frame Create
		this.setSize(700,735);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("Tick Tack Toe");
		this.setResizable(false);
		
		///Adding to frame
		for(i = 0;i<9;i++) {
			panelGame.add(button[i]);
		}
		
		this.add(panelTop);
		this.add(panelGame);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

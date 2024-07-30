package TickTackToe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChildClass extends JFrame implements ActionListener {

	///Variable declare
	JPanel panelTop;
	JLabel label;
	boolean Xturn = true;
	boolean Oturn = false;
	int i;
	JPanel panelGame;
	JButton[] button = new JButton[9];
	ChildClass()
	{
		panelTop = new JPanel();
		panelTop.setBounds(0,0,700,100);
		panelTop.setLayout(null);
		panelTop.setBackground(Color.orange);
		
		label = new JLabel();
		label.setBounds(200,0,700,100);
		label.setBackground(Color.orange);
		
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
		panelTop.add(label);
		this.setVisible(true);
		
		setText();
	}

	///***********************Top Label Text Set************************
	public void setText() {
		label.setFont(new Font("Tahoma",Font.PLAIN,65));
		label.setBounds(150,0,700,100);
		label.setText("Tick Tack Toe");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label.setBounds(250,0,700,100);
		label.setFont(new Font("Tahoma",Font.PLAIN,65));
		label.setText("X turn");
	}
	///*****************************Clear Variable end of game***********************
	public void clearVariable() {
		Xturn = true;
		Oturn = false;
	}
	
	public void checkWin() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(i = 0; i<9; i++) {
			if(e.getSource() == button[i]) {
				if(Xturn == true) {
					
					button[i].setText("X");
					Xturn = false;
					Oturn = true;
					label.setText("O turn");
				}
				else {
					
					button[i].setText("O");
					Oturn = false;
					Xturn = true;
					label.setText("X turn");
				}
			}
		}
		
	}
}

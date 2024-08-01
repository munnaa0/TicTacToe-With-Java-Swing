package TickTackToe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChildClass extends JFrame implements ActionListener {

	///Variable declare
	JPanel panelTop;
	JLabel label;
	int Tie=0;
	boolean Winner = false;
	boolean randomCheck = false;
	boolean FirstTurn = true;
	int randomNUM;
	int i;
	JPanel panelGame;
	Random random;
	JButton[] button = new JButton[9];
	JButton playAgain;
	ChildClass()
	{
		ImageIcon icon = new ImageIcon("icon.png");
		random = new Random();
		
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
		
		playAgain = new JButton();
		playAgain.setBounds(550, 25, 120, 50);
		playAgain.setText("Play Again");
		playAgain.setFocusable(false);
		playAgain.setBackground(Color.LIGHT_GRAY);
		playAgain.setFont(new Font("Tahoma",Font.PLAIN,18));
		playAgain.setVisible(false); ///Turn this false
		playAgain.addActionListener(this);
		
		//For Buttons
		for(i = 0;i<9;i++) {
			button[i] = new JButton();
			button[i].setBackground(Color.cyan);
			button[i].setFont(new Font("Tahoma",Font.PLAIN,220));
			button[i].setForeground(Color.magenta);
			button[i].setFocusable(false);
			button[i].addActionListener(this);
		}
		
		///Initial Button Disable
		buttonDisable(false);
		//Frame Create
		this.setSize(700,735);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setIconImage(icon.getImage());
		this.setTitle("Tick Tac Toe");
		this.setLocationRelativeTo(null); /// Open From Center
		this.setResizable(false);
		
		///Adding to frame
		for(i = 0;i<9;i++) {
			panelGame.add(button[i]);
		}
		
		this.add(panelTop);
		this.add(panelGame);
		panelTop.add(label);
		this.setVisible(true);
		panelTop.add(playAgain);
		setText();
	}

	///***********************Top Label Text Set************************
	public void setText() {
		label.setFont(new Font("Tahoma",Font.PLAIN,65));
		label.setBounds(150,0,700,100);
		label.setText("Tic Tac Toe");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		label.setBounds(250,0,700,100);
		label.setFont(new Font("Tahoma",Font.PLAIN,65));
		buttonDisable(true);
		label.setText("X Turn");
	}
	///*****************************Clear Variable end of game***********************
	public void clearVariable() {
		Tie=0;
		randomNUM = 0;
		FirstTurn = true;
		Winner = false;
		for(i=0;i<9;i++) {
			button[i].setText("");
		}
	}
	
	///**************************Win Check Function for X******************************
	public void XWinCheck() {
		Tie+=1;
		if( button[0].getText()=="X" &&
			button[1].getText()=="X" &&
			button[2].getText()=="X") {
			winDeclare("X",0,1,2);
		}
		if( button[3].getText()=="X" &&
				button[4].getText()=="X" &&
				button[5].getText()=="X") {
				winDeclare("X",3,4,5);
			}
		if( button[6].getText()=="X" &&
				button[7].getText()=="X" &&
				button[8].getText()=="X") {
				winDeclare("X",6,7,8);
			}
		if( button[0].getText()=="X" &&
				button[3].getText()=="X" &&
				button[6].getText()=="X") {
				winDeclare("X",0,3,6);
			}
		if( button[1].getText()=="X" &&
				button[4].getText()=="X" &&
				button[7].getText()=="X") {
				winDeclare("X",1,4,7);
			}
		if( button[2].getText()=="X" &&
				button[5].getText()=="X" &&
				button[8].getText()=="X") {
				winDeclare("X",2,5,8);
			}
		if( button[0].getText()=="X" &&
				button[4].getText()=="X" &&
				button[8].getText()=="X") {
				winDeclare("X",0,4,8);
			}
		if( button[2].getText()=="X" &&
				button[4].getText()=="X" &&
				button[6].getText()=="X") {
				winDeclare("X",2,4,6);
			}
		if(Tie == 9 && Winner == false) {
			label.setText("It's a Tie");
			Winner = true;
			buttonDisable(false);
			playAgain.setVisible(true);
		}
	}
	
	//****************************Button Disable******************************
	public void buttonDisable(boolean x) {
		for(i=0;i<9;i++) {
			button[i].setEnabled(x);
		}
	}
	
	///************************Color Reset************************
	public void colorReset() {
		for(i=0;i<9;i++) {
			button[i].setBackground(Color.cyan);
		}
	}
	///**************************Win Check Function for O******************************
		public void OWinCheck() {
			Tie+=1;
			if( button[0].getText()=="O" &&
				button[1].getText()=="O" &&
				button[2].getText()=="O") {
				winDeclare("O",0,1,2);
			}
			if( button[3].getText()=="O" &&
					button[4].getText()=="O" &&
					button[5].getText()=="O") {
					winDeclare("O",3,4,5);
				}
			if( button[6].getText()=="O" &&
					button[7].getText()=="O" &&
					button[8].getText()=="O") {
					winDeclare("O",6,7,8);
				}
			if( button[0].getText()=="O" &&
					button[3].getText()=="O" &&
					button[6].getText()=="O") {
					winDeclare("O",0,3,6);
				}
			if( button[1].getText()=="O" &&
					button[4].getText()=="O" &&
					button[7].getText()=="O") {
					winDeclare("O",1,4,7);
				}
			if( button[2].getText()=="O" &&
					button[5].getText()=="O" &&
					button[8].getText()=="O") {
					winDeclare("O",2,5,8);
				}
			if( button[0].getText()=="O" &&
					button[4].getText()=="O" &&
					button[8].getText()=="O") {
					winDeclare("O",0,4,8);
				}
			if( button[2].getText()=="O" &&
					button[4].getText()=="O" &&
					button[6].getText()=="O") {
					winDeclare("O",2,4,6);
				}
			if(Tie == 9 && Winner == false) {
				label.setText("It's a Tie");
				Winner = true;
				buttonDisable(false);
				playAgain.setVisible(true);
			}
		}
		
		
	///*************************Winner Declare ********************************
	public void winDeclare(String GameWinner, int a,int b, int c) {
		Winner = true;
		if(GameWinner == "X") {
			
			label.setText("X Wins");
			button[a].setBackground(Color.green);
			button[b].setBackground(Color.green);
			button[c].setBackground(Color.green);
			buttonDisable(false);
			playAgain.setVisible(true);
		}
		else {

			label.setText("O Wins");
			button[a].setBackground(Color.green);
			button[b].setBackground(Color.green);
			button[c].setBackground(Color.green);
			buttonDisable(false);
			playAgain.setVisible(true);
		}
	}
	
	//***********************************AI TURN***************************************
	public void AIturn() {
		boolean turn = false;
		///************************First Turn*****************************************
		if(FirstTurn == true) {
			if(button[4].getText()=="X") {
				button[2].setText("O");
			}
			else if(button[0].getText()=="X" ||
				button[2].getText()=="X" ||
				button[6].getText()=="X" ||
				button[8].getText()=="X") {
				
				button[4].setText("O");
			}
			else if(button[1].getText()=="X") {
				button[2].setText("O");
			}
			else if(button[5].getText()=="X" ||
					button[7].getText()=="X") {
				button[8].setText("O");
			}
			else if(button[3].getText()=="X") {
				button[6].setText("O");
			}
			FirstTurn = false;
			turn = true;
		}
		//************************First TUrn END**************************************
		else {
			Oturn();
		}
		label.setText("X Turn");
	}
	
	public void Xstopturn() {
		boolean turn = false;
		
		if(turn == false) {
			if(button[0].getText()=="X" &&
					button[1].getText()=="X"
					&& turn == false) {
				if(button[2].getText()=="") {
					button[2].setText("O");
					turn = true;
				}
			}
			
			if(button[0].getText()=="X" &&
					button[2].getText()=="X"
					&& turn == false) {
				if(button[1].getText()=="") {
					button[1].setText("O");
					turn = true;
				}
			}
			
			if(button[1].getText()=="X" &&
					button[2].getText()=="X"
					&& turn == false) {
				if(button[0].getText()=="") {
					button[0].setText("O");
					turn = true;
				}
			}
	//******************************************************************************		
			if(button[3].getText()=="X" &&
					button[4].getText()=="X"
					&& turn == false) {
				if(button[5].getText()=="") {
					button[5].setText("O");
					turn = true;
				}
			}
			
			if(button[3].getText()=="X" &&
					button[5].getText()=="X"
					&& turn == false) {
				if(button[4].getText()=="") {
					button[4].setText("O");
					turn = true;
				}
			}
			
			if(button[4].getText()=="X" &&
					button[5].getText()=="X"
					&& turn == false) {
				if(button[3].getText()=="") {
					button[3].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[7].getText()=="X" &&
					button[8].getText()=="X"
					&& turn == false) {
				if(button[6].getText()=="") {
					button[6].setText("O");
					turn = true;
				}
			}
			
			if(button[6].getText()=="X" &&
					button[8].getText()=="X"
					&& turn == false) {
				if(button[7].getText()=="") {
					button[7].setText("O");
					turn = true;
				}
			}
			
			if(button[6].getText()=="X" &&
					button[7].getText()=="X"
					&& turn == false) {
				if(button[8].getText()=="") {
					button[8].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[3].getText()=="X" &&
					button[6].getText()=="X"
					&& turn == false) {
				if(button[0].getText()=="") {
					button[0].setText("O");
					turn = true;
				}
			}
			
			if(button[0].getText()=="X" &&
					button[6].getText()=="X"
					&& turn == false) {
				if(button[3].getText()=="") {
					button[3].setText("O");
					turn = true;
				}
			}
			
			if(button[0].getText()=="X" &&
					button[3].getText()=="X"
					&& turn == false) {
				if(button[6].getText()=="") {
					button[6].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[4].getText()=="X" &&
					button[7].getText()=="X"
					&& turn == false) {
				if(button[1].getText()=="") {
					button[1].setText("O");
					turn = true;
				}
			}
			
			if(button[1].getText()=="X" &&
					button[7].getText()=="X"
					&& turn == false) {
				if(button[4].getText()=="") {
					button[4].setText("O");
					turn = true;
				}
			}
			
			if(button[1].getText()=="X" &&
					button[4].getText()=="X"
					&& turn == false) {
				if(button[7].getText()=="") {
					button[7].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[5].getText()=="X" &&
					button[8].getText()=="X"
					&& turn == false) {
				if(button[2].getText()=="") {
					button[2].setText("O");
					turn = true;
				}
			}
			
			if(button[2].getText()=="X" &&
					button[8].getText()=="X"
					&& turn == false) {
				if(button[5].getText()=="") {
					button[5].setText("O");
					turn = true;
				}
			}
			
			if(button[2].getText()=="X" &&
					button[5].getText()=="X"
					&& turn == false) {
				if(button[8].getText()=="") {
					button[8].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[4].getText()=="X" &&
					button[8].getText()=="X"
					&& turn == false) {
				if(button[0].getText()=="") {
					button[0].setText("O");
					turn = true;
				}
			}
			
			if(button[0].getText()=="X" &&
					button[8].getText()=="X"
					&& turn == false) {
				if(button[4].getText()=="") {
					button[4].setText("O");
					turn = true;
				}
			}
			
			if(button[4].getText()=="X" &&
					button[0].getText()=="X"
					&& turn == false) {
				if(button[8].getText()=="") {
					button[8].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[6].getText()=="X" &&
					button[4].getText()=="X"
					&& turn == false) {
				if(button[2].getText()=="") {
					button[2].setText("O");
					turn = true;
				}
			}
			
			if(button[2].getText()=="X" &&
					button[6].getText()=="X"
					&& turn == false) {
				if(button[4].getText()=="") {
					button[4].setText("O");
					turn = true;
				}
			}
			
			if(button[2].getText()=="X" &&
					button[4].getText()=="X"
					&& turn == false) {
				if(button[6].getText()=="") {
					button[6].setText("O");
					turn = true;
				}
			}
			
			
			
			////**********************Second Turn End**********************************
		}
		
		///************************This is common Turn*********************************
		
				if(turn == false) {
					do {
						randomNUM = random.nextInt(9);
						if(button[randomNUM].getText() != "X" && button[randomNUM].getText() != "O") {
							randomCheck = true;
						}
					}while(randomCheck == false);
					
					button[randomNUM].setText("O");
					randomCheck = false;
				}
	}
	
	public void Oturn() {
		boolean turn = false;
		
			if(button[0].getText()=="O" &&
					button[1].getText()=="O"
					&& turn == false) {
				if(button[2].getText()=="") {
					button[2].setText("O");
					turn = true;
				}
			}
			
			if(button[0].getText()=="O" &&
					button[2].getText()=="O"
					&& turn == false) {
				if(button[1].getText()=="") {
					button[1].setText("O");
					turn = true;
				}
			}
			
			if(button[1].getText()=="O" &&
					button[2].getText()=="O"
					&& turn == false) {
				if(button[0].getText()=="") {
					button[0].setText("O");
					turn = true;
				}
			}
	//******************************************************************************		
			if(button[3].getText()=="O" &&
					button[4].getText()=="O"
					&& turn == false) {
				if(button[5].getText()=="") {
					button[5].setText("O");
					turn = true;
				}
			}
			
			if(button[3].getText()=="O" &&
					button[5].getText()=="O"
					&& turn == false) {
				if(button[4].getText()=="") {
					button[4].setText("O");
					turn = true;
				}
			}
			
			if(button[4].getText()=="O" &&
					button[5].getText()=="O"
					&& turn == false) {
				if(button[3].getText()=="") {
					button[3].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[7].getText()=="O" &&
					button[8].getText()=="O"
					&& turn == false) {
				if(button[6].getText()=="") {
					button[6].setText("O");
					turn = true;
				}
			}
			
			if(button[6].getText()=="O" &&
					button[8].getText()=="O"
					&& turn == false) {
				if(button[7].getText()=="") {
					button[7].setText("O");
					turn = true;
				}
			}
			
			if(button[6].getText()=="O" &&
					button[7].getText()=="O"
					&& turn == false) {
				if(button[8].getText()=="") {
					button[8].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[3].getText()=="O" &&
					button[6].getText()=="O"
					&& turn == false) {
				if(button[0].getText()=="") {
					button[0].setText("O");
					turn = true;
				}
			}
			
			if(button[0].getText()=="O" &&
					button[6].getText()=="O"
					&& turn == false) {
				if(button[3].getText()=="") {
					button[3].setText("O");
					turn = true;
				}
			}
			
			if(button[0].getText()=="O" &&
					button[3].getText()=="O"
					&& turn == false) {
				if(button[6].getText()=="") {
					button[6].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[4].getText()=="O" &&
					button[7].getText()=="O"
					&& turn == false) {
				if(button[1].getText()=="") {
					button[1].setText("O");
					turn = true;
				}
			}
			
			if(button[1].getText()=="O" &&
					button[7].getText()=="O"
					&& turn == false) {
				if(button[4].getText()=="") {
					button[4].setText("O");
					turn = true;
				}
			}
			
			if(button[1].getText()=="O" &&
					button[4].getText()=="O"
					&& turn == false) {
				if(button[7].getText()=="") {
					button[7].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[5].getText()=="O" &&
					button[8].getText()=="O"
					&& turn == false) {
				if(button[2].getText()=="") {
					button[2].setText("O");
					turn = true;
				}
			}
			
			if(button[2].getText()=="O" &&
					button[8].getText()=="O"
					&& turn == false) {
				if(button[5].getText()=="") {
					button[5].setText("O");
					turn = true;
				}
			}
			
			if(button[2].getText()=="O" &&
					button[5].getText()=="O"
					&& turn == false) {
				if(button[8].getText()=="") {
					button[8].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[4].getText()=="O" &&
					button[8].getText()=="O"
					&& turn == false) {
				if(button[0].getText()=="") {
					button[0].setText("O");
					turn = true;
				}
			}
			
			if(button[0].getText()=="O" &&
					button[8].getText()=="O"
					&& turn == false) {
				if(button[4].getText()=="") {
					button[4].setText("O");
					turn = true;
				}
			}
			
			if(button[4].getText()=="O" &&
					button[0].getText()=="O"
					&& turn == false) {
				if(button[8].getText()=="") {
					button[8].setText("O");
					turn = true;
				}
			}
			
			//******************************************************************************		
			if(button[6].getText()=="O" &&
					button[4].getText()=="O"
					&& turn == false) {
				if(button[2].getText()=="") {
					button[2].setText("O");
					turn = true;
				}
			}
			
			if(button[2].getText()=="O" &&
					button[6].getText()=="O"
					&& turn == false) {
				if(button[4].getText()=="") {
					button[4].setText("O");
					turn = true;
				}
			}
			
			if(button[2].getText()=="O" &&
					button[4].getText()=="O"
					&& turn == false) {
				if(button[6].getText()=="") {
					button[6].setText("O");
					turn = true;
				}
			}
			////**********************Second Turn End**********************************
		
			if(turn == false) {
				Xstopturn();
			}
			////*************************O end**************************************
	}
	
	
	
	///******************************Main COde*************************
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==playAgain) {
			label.setText("X Turn");
			clearVariable();
			colorReset();
			buttonDisable(true);
			playAgain.setVisible(false);
		}
		
		for(i = 0; i<9; i++) {
			if(e.getSource() == button[i]) {
					if(button[i].getText() != "X" && button[i].getText() != "O") {
						button[i].setText("X");
						XWinCheck();
						if(Winner != true) {
							label.setText("O Turn");
							AIturn();
							OWinCheck();
						}
						
//******************************	O TURN**************************************************						
					}
				//***************************************************
			}
		}
		
	}
}

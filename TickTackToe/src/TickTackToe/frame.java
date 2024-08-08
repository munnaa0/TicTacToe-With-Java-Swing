package TickTackToe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public frame() {
		setResizable(false);
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(255, 128, 0));
		topPanel.setBounds(0, 0, 504, 72);
		contentPane.add(topPanel);
		topPanel.setLayout(null);
		
		JLabel topLabel = new JLabel("Tic Tac Toe\r\n");
		topLabel.setForeground(new Color(0, 255, 0));
		topLabel.setFont(new Font("Tahoma", Font.PLAIN, 58));
		topLabel.setBounds(94, 0, 306, 64);
		topPanel.add(topLabel);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(128, 255, 0));
		bottomPanel.setBounds(-39, 71, 553, 32);
		contentPane.add(bottomPanel);
		bottomPanel.setLayout(null);
		
		JLabel bottomLabel = new JLabel("Select Game Mode");
		bottomLabel.setBounds(163, 0, 212, 31);
		bottomPanel.add(bottomLabel);
		bottomLabel.setBackground(new Color(255, 128, 0));
		bottomLabel.setForeground(new Color(255, 0, 128));
		bottomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bottomLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(128, 255, 255));
		mainPanel.setBounds(0, 101, 485, 361);
		contentPane.add(mainPanel);
	}
}

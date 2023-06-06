package Tictactoe;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Tictactoe extends JFrame {

	private JPanel contentPane;
	
	String startGame = "X";
    int xCount1  = 0;
    int oCount1  = 0;
    private String b1;
    private String b2;
    private String b3;
    private String b4;
    private String b5;
    private String b6;
    private String b7;
    private String b8;
    private String b9;
    JTextField xCount;
    JTextField oCount;
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe tictactoe = new Tictactoe();
					tictactoe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
	public Tictactoe() {
		initialize ();
	}
	
	public void choose_a_Player()
    {
        if (startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else 
        {
            startGame = "X";
        }
    }
	
	public void initialize () {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 241, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 758, 452);
		panel.setBackground(new Color(232, 170, 66));
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn1.setForeground(Color.BLACK);
		            b1=("X");
		        }
		        else
		        {
		            btn1.setForeground(Color.RED);
		            b1=("O");
		        }
		        choose_a_Player();
			}
		});
		btn1.setFocusPainted(false);
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.setBounds(0, 0, 148, 148);
		panel.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn2.setForeground(Color.BLACK);
		            b2=("X");
		        }
		        else
		        {
		            btn2.setForeground(Color.RED);
		            b2=("O");
		        }
		        choose_a_Player();
		        winningGame();
			}
		});
		btn2.setOpaque(false);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn2.setFocusPainted(false);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.setBounds(152, 0, 148, 148);
		panel.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn3.setForeground(Color.BLACK);
		            b3=("X");
		        }
		        else
		        {
		            btn3.setForeground(Color.RED);
		            b3=("O");
		        }
		        choose_a_Player();
		        winningGame();
			}
		});
		btn3.setOpaque(false);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn3.setFocusPainted(false);
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);
		btn3.setBounds(304, 0, 148, 148);
		panel.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn4.setForeground(Color.BLACK);
		            b4=("X");
		        }
		        else
		        {
		            btn4.setForeground(Color.RED);
		            b4=("O");
		        }
		        choose_a_Player();
		        winningGame();
			}
		});
		btn4.setOpaque(false);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn4.setFocusPainted(false);
		btn4.setContentAreaFilled(false);
		btn4.setBorderPainted(false);
		btn4.setBounds(0, 154, 148, 142);
		panel.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn5.setForeground(Color.BLACK);
		            b5=("X");
		        }
		        else
		        {
		            btn5.setForeground(Color.RED);
		            b5=("O");
		        }
		        choose_a_Player();
		        winningGame();
			}
		});
		btn5.setOpaque(false);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn5.setFocusPainted(false);
		btn5.setContentAreaFilled(false);
		btn5.setBorderPainted(false);
		btn5.setBounds(152, 154, 148, 142);
		panel.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn6.setForeground(Color.BLACK);
		            b6=("X");
		        }
		        else
		        {
		            btn6.setForeground(Color.RED);
		            b6=("O");
		        }
		        choose_a_Player();
		        winningGame();
			}
		});
		btn6.setOpaque(false);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn6.setFocusPainted(false);
		btn6.setContentAreaFilled(false);
		btn6.setBorderPainted(false);
		btn6.setBounds(304, 154, 148, 142);
		panel.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn7.setForeground(Color.BLACK);
		            b7=("X");
		        }
		        else
		        {
		            btn7.setForeground(Color.RED);
		            b7=("O");
		        }
		        choose_a_Player();
		        winningGame();
			}
		});
		btn7.setOpaque(false);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn7.setFocusPainted(false);
		btn7.setContentAreaFilled(false);
		btn7.setBorderPainted(false);
		btn7.setBounds(0, 307, 148, 142);
		panel.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn8.setForeground(Color.BLACK);
		            b8=("X");
		        }
		        else
		        {
		            btn8.setForeground(Color.RED);
		            b8=("O");
		        }
		        choose_a_Player();
			}
		});
		btn8.setOpaque(false);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn8.setFocusPainted(false);
		btn8.setContentAreaFilled(false);
		btn8.setBorderPainted(false);
		btn8.setBounds(152, 307, 148, 142);
		panel.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if (startGame.equalsIgnoreCase("X"))
		        {
		            btn9.setForeground(Color.BLACK);
		            b9=("X");
		        }
		        else
		        {
		            btn9.setForeground(Color.RED);
		            b9=("O");
		        }
		        choose_a_Player();
			}
		});
		btn9.setOpaque(false);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn9.setFocusPainted(false);
		btn9.setContentAreaFilled(false);
		btn9.setBorderPainted(false);
		btn9.setBounds(304, 307, 148, 142);
		panel.add(btn9);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Tictactoe.class.getResource("/TictactoeImage/home (11) (1).png")));
		lblNewLabel.setBounds(0, 0, 452, 452);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(451, 0, 307, 452);
		panel_1.setBackground(new Color(2, 84, 100));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPlayer1 = new JLabel("Player X:");
		lblPlayer1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPlayer1.setForeground(new Color(248, 241, 241));
		lblPlayer1.setBounds(10, 202, 166, 41);
		panel_1.add(lblPlayer1);
		
		JLabel lblPlayer2 = new JLabel("Player O:");
		lblPlayer2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPlayer2.setBounds(10, 262, 166, 41);
		panel_1.add(lblPlayer2);
		lblPlayer2.setForeground(new Color(248, 241, 241));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
			}
		});
		btnReset.setFocusPainted(false);
		btnReset.setOpaque(false);
		btnReset.setContentAreaFilled(false);
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnReset.setForeground(new Color(248, 241, 241));
		btnReset.setBounds(0, 314, 307, 57);
		panel_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "",JOptionPane.YES_NO_OPTION);
				if (ask == JOptionPane.YES_OPTION) {
					dispose();
				} else {
					setVisible(true);
				}
			}
		});
		btnExit.setFocusPainted(false);
		btnExit.setOpaque(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnExit.setBounds(0, 368, 307, 57);
		panel_1.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Tictactoe.class.getResource("/TictactoeImage/home (12) (1).png")));
		lblNewLabel_1.setBounds(10, 45, 287, 146);
		panel_1.add(lblNewLabel_1);
		
		xCount = new JTextField();
		xCount.setHorizontalAlignment(SwingConstants.CENTER);
		xCount.setFont(new Font("Tahoma", Font.BOLD, 35));
		xCount.setBackground(new Color(2, 84, 100));
		xCount.setForeground(new Color(248, 241, 241));
		xCount.setBounds(174, 202, 123, 41);
		xCount.setBorder(null);
		panel_1.add(xCount);
		xCount.setColumns(10);
		
		oCount = new JTextField();
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		oCount.setFont(new Font("Tahoma", Font.BOLD, 35));
		oCount.setBackground(new Color(2, 84, 100));
		oCount.setForeground(new Color(248, 241, 241));
		oCount.setBorder(null);
		oCount.setColumns(10);
		oCount.setBounds(174, 262, 123, 41);
		panel_1.add(oCount);
		
		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(Tictactoe.class.getResource("/LibSystemImage/home (9) (1).png")));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TictactoeMenu menu = new TictactoeMenu();
				menu.setVisible(true);
				
				dispose();
			}
		});
		btnMenu.setOpaque(false);
		btnMenu.setForeground(new Color(248, 241, 241));
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMenu.setFocusPainted(false);
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorderPainted(false);
		btnMenu.setBounds(10, 11, 40, 38);
		panel_1.add(btnMenu);
	}

    public void winningGame(){
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        
        if (b4==("X") && b5==("X") && b6==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }

        if (b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        
        if (b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        if (b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        
        //Player O
        if (b1==("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        if (b4==("O") && b5==("O") && b6==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        if (b7==("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        if (b1==("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        if (b2==("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        if (b3==("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        if (b1==("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        if (b3==("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
    }
}


package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Tictactoe.TictactoeMenu;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Point;
import java.awt.Rectangle;

import Main.MainPage;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	double num,ans;
	int calculation;
	
	public void arithmetic() {
		switch (calculation) {
		case 1: 
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		case 2: 
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3: 
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		case 4: 
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		}
	}
	public Calculator() {
		setBounds(new Rectangle(0, 0, 0, 0));
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 408);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/LibSystemImage/home (9) (1).png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage main = new MainPage();
				main.setVisible(true);
				
				dispose();
			}
		});
		btnBack.setFocusPainted(false);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBounds(10, 11, 39, 32);
		contentPane.add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 54, 503, 343);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 88, 503, 257);
		panel.add(panel_1);
		
		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/37.png")));
		btn1.setBounds(10, 11, 89, 68);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		panel_1.setLayout(null);
		btn1.setFocusPainted(false);
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		panel_1.add(btn1);
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setFocusPainted(false);
		btn4.setOpaque(false);
		btn4.setContentAreaFilled(false);
		btn4.setBorderPainted(false);
		btn4.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/40.png")));
		btn4.setBounds(10, 90, 89, 68);
		panel_1.add(btn4);
		
		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/38.png")));
		btn2.setBounds(109, 11, 89, 68);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setFocusPainted(false);
		btn2.setOpaque(false);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		panel_1.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/39.png")));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setFocusPainted(false);
		btn3.setOpaque(false);
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);
		btn3.setBounds(208, 11, 89, 68);
		panel_1.add(btn3);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setFocusPainted(false);
		btn5.setOpaque(false);
		btn5.setContentAreaFilled(false);
		btn5.setBorderPainted(false);
		btn5.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/41.png")));
		btn5.setBounds(109, 90, 89, 68);
		panel_1.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setFocusPainted(false);
		btn6.setOpaque(false);
		btn6.setContentAreaFilled(false);
		btn6.setBorderPainted(false);
		btn6.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/42.png")));
		btn6.setBounds(208, 90, 89, 68);
		panel_1.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFocusPainted(false);
		btn7.setOpaque(false);
		btn7.setContentAreaFilled(false);
		btn7.setBorderPainted(false);
		btn7.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/43.png")));
		btn7.setBounds(10, 169, 89, 68);
		panel_1.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setFocusPainted(false);
		btn8.setOpaque(false);
		btn8.setContentAreaFilled(false);
		btn8.setBorderPainted(false);
		btn8.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/44.png")));
		btn8.setBounds(109, 169, 89, 68);
		panel_1.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setFocusPainted(false);
		btn9.setOpaque(false);
		btn9.setContentAreaFilled(false);
		btn9.setBorderPainted(false);
		btn9.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/45.png")));
		btn9.setBounds(208, 169, 89, 68);
		panel_1.add(btn9);
		
		JButton btnAdd = new JButton("");
		btnAdd.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/46.png")));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =1;
				textField.setText("");
			}
		});
		btnAdd.setFocusPainted(false);
		btnAdd.setOpaque(false);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorderPainted(false);
		btnAdd.setBounds(307, 11, 89, 68);
		panel_1.add(btnAdd);
		
		JButton btnSub = new JButton("");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =2;
				textField.setText("");
				
			}
		});
		btnSub.setFocusPainted(false);
		btnSub.setOpaque(false);
		btnSub.setContentAreaFilled(false);
		btnSub.setBorderPainted(false);
		btnSub.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/47.png")));
		btnSub.setBounds(406, 11, 89, 68);
		panel_1.add(btnSub);
		
		JButton btnMul = new JButton("");
		btnMul.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/49.png")));
		btnMul.setBounds(307, 90, 89, 68);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =3;
				textField.setText("");
			}
		});
		btnMul.setFocusPainted(false);
		btnMul.setOpaque(false);
		btnMul.setContentAreaFilled(false);
		btnMul.setBorderPainted(false);
		panel_1.add(btnMul);
		
		JButton btnDiv = new JButton("");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =4;
				textField.setText("");;
			}
		});
		btnDiv.setFocusPainted(false);
		btnDiv.setOpaque(false);
		btnDiv.setContentAreaFilled(false);
		btnDiv.setBorderPainted(false);
		btnDiv.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/48.png")));
		btnDiv.setBounds(406, 90, 89, 68);
		panel_1.add(btnDiv);
		
		JButton btnEquals = new JButton("");
		btnEquals.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/36.png")));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic();
			}
		});
		btnEquals.setFocusPainted(false);
		btnEquals.setOpaque(false);
		btnEquals.setContentAreaFilled(false);
		btnEquals.setBorderPainted(false);
		btnEquals.setBounds(406, 169, 89, 68);
		panel_1.add(btnEquals);
		
		JButton btnReset = new JButton("");
		btnReset.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/CalculatorImage/home (15) (1).png")));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnReset.setFocusPainted(false);
		btnReset.setOpaque(false);
		btnReset.setContentAreaFilled(false);
		btnReset.setBorderPainted(false);
		btnReset.setBounds(307, 169, 89, 68);
		panel_1.add(btnReset);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(0, 11, 503, 66);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 503, 42);
		contentPane.add(lblNewLabel);
	}
}

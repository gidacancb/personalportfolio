package Tictactoe;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import Main.MainPage;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TictactoeMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TictactoeMenu menu = new TictactoeMenu();
					menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TictactoeMenu() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 241, 241));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 758, 451);
		panel.setBackground(new Color(2, 84, 100));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnStart = new JButton("");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tictactoe tictactoe = new Tictactoe();
				tictactoe.setVisible(true);
				
				dispose();
			}
		});
		btnStart.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/TictactoeImage/home 14.png")));
		btnStart.setBounds(10, 352, 738, 68);
		panel.add(btnStart);
		setLocationRelativeTo(null);
		btnStart.setFocusPainted(false);
		btnStart.setOpaque(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setBorderPainted(false);
		
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
		btnBack.setBounds(10, 11, 37, 38);
		panel.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TictactoeMenu.class.getResource("/TictactoeImage/home (13) (1).png")));
		lblNewLabel.setBounds(10, 11, 738, 330);
		panel.add(lblNewLabel);
	}
}

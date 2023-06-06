package AdvanceLibrarySystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.MainPage;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;

public class LibrarianLogin extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JTextField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin lib = new LibrarianLogin();
					lib.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibrarianLogin() {
		setUndecorated(true);
		setResizable(false);
		setTitle("Library Management");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 405);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 308, 406);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage main = new MainPage();
				main.setVisible(true);
				
				dispose();
			}
		});
		btnBack.setIcon(new ImageIcon(LibrarianLogin.class.getResource("/LibSystemImage/home (9) (1).png")));
		btnBack.setOpaque(false);
		btnBack.setFocusPainted(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBack.setBounds(10, 11, 36, 36);
		panel.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("LIBRARY SYSTEM");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(65, 317, 186, 47);
		panel.add(lblNewLabel_3);
		
		JLabel lblImage= new JLabel("");
		lblImage.setIcon(new ImageIcon(LibrarianLogin.class.getResource("/LibSystemImage/lib.jpg")));
		lblImage.setBounds(0, 0, 308, 306);
		panel.add(lblImage);
		
		//button to switch on admin log in 
		Button button = new Button("    Admin Login\r\n");
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin admin = new AdminLogin();
				admin.setVisible(true);
				
				dispose();
			}
		});
		button.setBounds(467, 311, 104, 22);
		contentPane.add(button);
		
		Username = new JTextField();
		Username.setBounds(341, 119, 261, 28);
		contentPane.add(Username);
		Username.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(341, 162, 261, 2);
		contentPane.add(separator);
		
		Password = new JTextField();
		Password.setColumns(10);
		Password.setBounds(341, 200, 261, 28);
		contentPane.add(Password);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblUsername.setBounds(341, 94, 66, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPassword.setBounds(341, 175, 66, 14);
		contentPane.add(lblPassword);
		
		Button button_1 = new Button("    LOG IN \r\n");
		button_1.addMouseListener(new MouseAdapter() {
			//condition when logging in as a librarian
			public void mouseClicked(MouseEvent e) {
				if(Username.getText().equals("Librarian_01") && Password.getText().equals("LibOne") ||
					Username.getText().equals("Librarian_02") && Password.getText().equals("LibTwo") ||
					Username.getText().equals("Librarian_03") && Password.getText().equals("LibThree")) {
					JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN", "Librarian Login", JOptionPane.PLAIN_MESSAGE);
					BookRental book = new BookRental();
					book.setVisible(true);
					LibrarianLogin lib = new LibrarianLogin();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "The Username and Password does not match", "Librarian", JOptionPane.ERROR_MESSAGE);
					Username.setText(null);
					Password.setText(null);
					return;
		            
				}
			}
		});
		
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setForeground(Color.WHITE);
		button_1.setBounds(370, 254, 201, 22);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("Are you an Admin?\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(370, 311, 104, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LIBRARIAN LOG IN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(408, 59, 143, 14);
		contentPane.add(lblNewLabel_2);
	}
}

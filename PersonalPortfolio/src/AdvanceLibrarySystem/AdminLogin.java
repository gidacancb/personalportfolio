package AdvanceLibrarySystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.MainPage;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;

public class AdminLogin extends JFrame {

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
					AdminLogin admin = new AdminLogin();
					admin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminLogin() {
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
		btnBack.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage main = new MainPage();
				main.setVisible(true);
				
				dispose();
			}
		});
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setFocusPainted(false);
		btnBack.setIcon(new ImageIcon(AdminLogin.class.getResource("/LibSystemImage/home (9) (1).png")));
		btnBack.setBounds(10, 11, 36, 36);
		panel.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("LIBRARY SYSTEM");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(65, 317, 186, 47);
		panel.add(lblNewLabel_3);
		
		JLabel lblImage = new JLabel("New label");
		lblImage.setIcon(new ImageIcon(AdminLogin.class.getResource("/LibSystemImage/lib.jpg")));
		lblImage.setBounds(0, 0, 308, 306);
		panel.add(lblImage);
		
		//button to switch on librarian log in 
		Button button = new Button("    Librarian Login\r\n");
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin lib = new LibrarianLogin();
			    lib.setVisible(true);
			   
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
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(341, 94, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPassword.setBounds(341, 175, 66, 14);
		contentPane.add(lblPassword);
		
		Button button_1 = new Button("    LOG IN \r\n");
		button_1.addMouseListener(new MouseAdapter() {
			//condition when logging in as an admin
			public void mouseClicked(MouseEvent e) {
				if(Username.getText().equals("Admin_01") && Password.getText().equals("AdminOne") ||
				    Username.getText().equals("Admin_02") && Password.getText().equals("AdminTwo") ||
				    Username.getText().equals("Admin_03") && Password.getText().equals("AdminThree")) {
					JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN", "Admin Login", JOptionPane.PLAIN_MESSAGE);
					WelcomtoLibSystem welcome = new WelcomtoLibSystem();
					welcome.setVisible(true);
					AdminLogin admin = new AdminLogin();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "The Username and Password does not match", "Admin Log in", JOptionPane.ERROR_MESSAGE);
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
		
		JLabel lblNewLabel_1 = new JLabel("Are you a Librarian?\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(370, 311, 104, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADMIN LOG IN");
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(424, 59, 116, 14);
		contentPane.add(lblNewLabel_2);
	}
}

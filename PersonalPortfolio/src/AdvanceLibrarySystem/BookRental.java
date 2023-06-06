package AdvanceLibrarySystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JSeparator;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class BookRental extends JFrame {

	private JPanel contentPane;
	private JTextField txtChoice;
	static int book1Copy = 8;
	static int book2Copy = 2;
	static int book3Copy = 3;

	static JLabel bookOneCopy = new JLabel();
	static JLabel bookTwoCopy = new JLabel();
	static JLabel bookThreeCopy = new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookRental book = new BookRental();
					book.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookRental() {
		setUndecorated(true);
		setResizable(false);
		setTitle("Library Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 83, 600, 588);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(BookRental.class.getResource("/LibSystemImage/tsip.png")));
		lblNewLabel_2.setBounds(59, 11, 90, 136);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("The Summer I Turned Pretty");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(172, 23, 262, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("By: Jenny Han");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(172, 55, 90, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Genre: Romance");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(172, 87, 119, 14);
		panel.add(lblNewLabel_5);
		
		bookOneCopy.setText(Integer.toString(book1Copy));
		bookOneCopy.setFont(new Font("Tahoma", Font.PLAIN, 11));
		bookOneCopy.setBounds(266, 112, 103, 14);
		panel.add(bookOneCopy);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(0, 158, 744, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(BookRental.class.getResource("/LibSystemImage/got.png")));
		lblNewLabel_7.setBounds(59, 171, 90, 136);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Game of Thrones");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setBounds(172, 185, 262, 21);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("By: George R. R. Martin");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(172, 217, 154, 21);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Genre: Adventure");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(172, 249, 119, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Number of copies:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(172, 274, 103, 14);
		panel.add(lblNewLabel_11);
		
		bookTwoCopy.setText(Integer.toString(book2Copy));
		bookTwoCopy.setFont(new Font("Tahoma", Font.PLAIN, 11));
		bookTwoCopy.setBounds(266, 274, 103, 14);
		panel.add(bookTwoCopy);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 318, 744, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(BookRental.class.getResource("/LibSystemImage/cc.png")));
		lblNewLabel_12.setBounds(59, 331, 90, 136);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Clean Code");
		lblNewLabel_13.setForeground(Color.BLACK);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_13.setBounds(172, 345, 262, 21);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("By: Robert C. Martin");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(172, 377, 154, 21);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Genre: Programming");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_15.setBounds(172, 409, 154, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Number of copies:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_16.setBounds(172, 434, 103, 14);
		panel.add(lblNewLabel_16);
		
		bookThreeCopy.setText(Integer.toString(book3Copy));
		bookThreeCopy.setFont(new Font("Tahoma", Font.PLAIN, 11));
		bookThreeCopy.setBounds(266, 434, 103, 14);
		panel.add(bookThreeCopy);
		
		JLabel lblNewLabel_17 = new JLabel("[0]");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_17.setBounds(29, 11, 30, 21);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("[1]");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_18.setBounds(29, 171, 30, 21);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("[2]");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(29, 331, 30, 21);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Book you want to rent:");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_20.setBounds(172, 491, 173, 21);
		panel.add(lblNewLabel_20);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(0, 478, 744, 2);
		panel.add(separator_1_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(BookRental.class.getResource("/LibSystemImage/lib.png")));
		lblNewLabel.setBounds(10, 11, 65, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("List of Books");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(85, 34, 130, 14);
		contentPane.add(lblNewLabel_1);
		
		Button button = new Button("SUBMIT");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.DARK_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<DifferentBook> book = new ArrayList<>();

				DifferentBook bookNum1 = new DifferentBook();
				bookNum1.title = "The Summer I Turned Pretty";
				bookNum1.author = "Jenny Han";

				DifferentBook bookNum2 = new DifferentBook();
				bookNum2.title = "Game of Thrones";
				bookNum2.author = "George R. R. Martin";

				DifferentBook bookNum3 = new DifferentBook();
				bookNum3.title = "Clean Code";
				bookNum3.author = "Robert C. Martin";

				book.add(bookNum1);
				book.add(bookNum2);
				book.add(bookNum3);
				
				try {
					int choice = Integer.parseInt(txtChoice.getText());
					DifferentBook theBook = book.get(choice);

					if (choice == 0 && book1Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available. Choose another book", "", JOptionPane.CLOSED_OPTION);
					} else if (choice == 1 && book2Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available. Choose another book", "", JOptionPane.CLOSED_OPTION);
					} else if (choice == 2 && book3Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available. Choose another book", "", JOptionPane.CLOSED_OPTION);
					}

					if (choice == 0 && book1Copy >= 1) {
						int choose = JOptionPane.showConfirmDialog(null,"You chose: " + book.get(choice).getTitle(), "", JOptionPane.CLOSED_OPTION);
						//number of copies will decrease
						book1Copy -= 1;
						bookOneCopy.setText(Integer.toString(book1Copy));
						if (choose == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Ask",JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
								txtChoice.setText(null);
							} else {
								dispose();
								LibrarianLogin lib = new LibrarianLogin();
								lib.setVisible(true);
							}
						}
					} else if (choice == 1 && book2Copy >= 1) {

						int chooseOkay = JOptionPane.showConfirmDialog(null,"You choose: " + book.get(choice).getTitle(), "", JOptionPane.CLOSED_OPTION);
						book2Copy -= 1;
						bookTwoCopy.setText(Integer.toString(book2Copy));
						if (chooseOkay == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Rent Again",JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
								txtChoice.setText(null);
							} else {
								dispose();
								LibrarianLogin lib = new LibrarianLogin();
								lib.setVisible(true);
							}
						}
					} else if (choice == 2 && book3Copy >= 1) {

						int chooseOkay = JOptionPane.showConfirmDialog(null,"You choose: " + book.get(choice).getTitle(), "", JOptionPane.CLOSED_OPTION);

						book3Copy -= 1;
						bookThreeCopy.setText(Integer.toString(book3Copy));

						if (chooseOkay == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Rent Again",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
								txtChoice.setText(null);
							} else {
								dispose();
								LibrarianLogin lib = new LibrarianLogin();
								lib.setVisible(true);
							}
						}
					}

				} catch (NumberFormatException ex) {
					int choice = JOptionPane.showConfirmDialog(null, "INPUT MUST BE IN THE CHOICES, TRY AGAIN!", "", JOptionPane.CLOSED_OPTION);
					if (choice == JOptionPane.OK_OPTION) {
						dispose();
						BookRental book1 = new BookRental();
						book1.setVisible(true);
					}
				} catch (IndexOutOfBoundsException ex) {
					int choice = JOptionPane.showConfirmDialog(null, "INDEX DOES NOT EXIST, TRY AGAIN!", "", JOptionPane.CLOSED_OPTION);
					if (choice == JOptionPane.OK_OPTION) {
						dispose();
						BookRental book1 = new BookRental();
						book1.setVisible(true);
					}
				}
			}

		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(242, 529, 103, 27);
		panel.add(button);
		
		txtChoice = new JTextField();
		txtChoice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if (txtChoice.getText().equals(0) ||
				txtChoice.getText().equals(1) ||
				txtChoice.getText().equals(2)) {
				txtChoice.setText("");
			}
			else {
				txtChoice.selectAll();
			}
		}			@Override
			public void focusLost(FocusEvent e) {
			if(txtChoice.getText().equals("")) {
				txtChoice.setText("Enter a number");
			}
			}
});
		txtChoice.setBounds(337, 493, 90, 20);
		panel.add(txtChoice);
		txtChoice.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Number of copies:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(172, 112, 90, 14);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 0, 600, 84);
		contentPane.add(panel_1);
	}
}

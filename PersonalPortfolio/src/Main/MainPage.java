package Main;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import AdvanceLibrarySystem.AdminLogin;
import Tictactoe.TictactoeMenu;
import Calculator.Calculator;
import javax.swing.JTextArea;

public class MainPage extends JFrame {

	private JPanel contentPane;
	ProjectInfo info = new ProjectInfo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage main = new MainPage();
					main.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainPage() {
		setUndecorated(true);
		setResizable(false);
		setTitle("Carla's Portfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 964, 661);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		tabbedPane.setBounds(0, -27, 964, 677);
		panel.add(tabbedPane);
		
		JPanel Home = new JPanel();
		Home.setBackground(new Color (241, 246, 249));
		tabbedPane.addTab("Home", null, Home, null);
		Home.setLayout(null);
		
		JTextArea Intro = new JTextArea(info.intro);
		Intro.setFont(new Font("Tahoma", Font.BOLD, 11));
		Intro.setOpaque(false);
		Intro.setBounds(64, 343, 452, 41);
		Home.add(Intro);
		
		JLabel lblcourse = new JLabel(info.course);
		lblcourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblcourse.setBackground(Color.YELLOW);
		lblcourse.setFont(new Font("Arial", Font.BOLD, 15));
		lblcourse.setBounds(472, 182, 83, 34);
		Home.add(lblcourse);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (1).png")));
		lblNewLabel_1.setBounds(463, 169, 104, 59);
		Home.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/esf-removebg-preview (2).png")));
		lblNewLabel.setBounds(482, 126, 452, 532);
		Home.add(lblNewLabel);
		
		JLabel lblHi = new JLabel("Hi, I am");
		lblHi.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		lblHi.setBounds(54, 137, 380, 129);
		Home.add(lblHi);
		
		JLabel lblName = new JLabel(info.name);
		lblName.setForeground(new Color (33, 42, 62));
		lblName.setFont(new Font("Arial", Font.BOLD, 70));
		lblName.setBounds(54, 259, 477, 85);
		Home.add(lblName);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color (33, 42, 62));
		separator.setBounds(20, 87, 914, 2);
		Home.add(separator);
		
		JLabel lblNationalUniversity = new JLabel(info.school);
		lblNationalUniversity.setForeground(new Color(0, 0, 128));
		lblNationalUniversity.setFont(new Font("Arial", Font.BOLD, 15));
		lblNationalUniversity.setBounds(392, 486, 139, 34);
		Home.add(lblNationalUniversity);
		
		JLabel llblschoollogo = new JLabel("");
		llblschoollogo.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/national-u-logo-750x599 (2).png")));
		llblschoollogo.setFont(new Font("Arial", Font.BOLD, 20));
		llblschoollogo.setBounds(412, 378, 93, 109);
		Home.add(llblschoollogo);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color (155, 164, 181));
		panel_4.setBounds(0, 538, 959, 120);
		Home.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblContact = new JLabel(info.number);
		lblContact.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblContact.setForeground(new Color (33, 42, 62));
		lblContact.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home__11 (1).png")));
		lblContact.setBounds(64, 65, 152, 30);
		panel_4.add(lblContact);
		
		JLabel lblEmail = new JLabel(info.email);
		lblEmail.setForeground(new Color (33, 42, 62));
		lblEmail.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (10) (1).png")));
		lblEmail.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblEmail.setBounds(64, 25, 312, 30);
		panel_4.add(lblEmail);
		
		JLabel lblFb = new JLabel(info.name);
		lblFb.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (17) (1).png")));
		lblFb.setForeground(new Color(33, 42, 62));
		lblFb.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblFb.setBounds(441, 25, 142, 30);
		panel_4.add(lblFb);
		
		JLabel lblIg = new JLabel("gcarla_m");
		lblIg.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (18) (1).png")));
		lblIg.setForeground(new Color(33, 42, 62));
		lblIg.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblIg.setBounds(441, 65, 142, 30);
		panel_4.add(lblIg);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(57, 72, 103));
		panel_5.setBounds(0, 0, 959, 67);
		Home.add(panel_5);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHome.setOpaque(false);
		btnHome.setForeground(Color.LIGHT_GRAY);
		btnHome.setFont(new Font("Arial", Font.BOLD, 15));
		btnHome.setFocusPainted(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setBorderPainted(false);
		btnHome.setBounds(94, 33, 84, 23);
		panel_5.add(btnHome);
		
		JButton btnAbout = new JButton("ABOUT");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAbout.setOpaque(false);
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setFont(new Font("Arial", Font.BOLD, 15));
		btnAbout.setFocusPainted(false);
		btnAbout.setContentAreaFilled(false);
		btnAbout.setBorderPainted(false);
		btnAbout.setBackground(Color.WHITE);
		btnAbout.setBounds(230, 33, 93, 23);
		panel_5.add(btnAbout);
		
		JButton btnProject = new JButton("PROJECTS");
		btnProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnProject.setOpaque(false);
		btnProject.setForeground(Color.WHITE);
		btnProject.setFont(new Font("Arial", Font.BOLD, 15));
		btnProject.setFocusPainted(false);
		btnProject.setContentAreaFilled(false);
		btnProject.setBorderPainted(false);
		btnProject.setBackground(Color.WHITE);
		btnProject.setBounds(544, 33, 116, 23);
		panel_5.add(btnProject);
		
		JButton btnExit = new JButton("");
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
		btnExit.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (6) (2).png")));
		btnExit.setOpaque(false);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Arial", Font.BOLD, 15));
		btnExit.setFocusPainted(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(887, 0, 72, 67);
		panel_5.add(btnExit);
		
		JButton btnEducation = new JButton("EDUCATION");
		btnEducation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnEducation.setOpaque(false);
		btnEducation.setForeground(Color.WHITE);
		btnEducation.setFont(new Font("Arial", Font.BOLD, 15));
		btnEducation.setFocusPainted(false);
		btnEducation.setContentAreaFilled(false);
		btnEducation.setBorderPainted(false);
		btnEducation.setBackground(Color.WHITE);
		btnEducation.setBounds(365, 33, 137, 23);
		panel_5.add(btnEducation);
		
		JPanel About = new JPanel();
		About.setBackground(new Color(221, 230, 237));
		tabbedPane.addTab("About", null, About, null);
		About.setLayout(null);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(new Color(57, 72, 103));
		panel_5_1.setBounds(0, 0, 959, 67);
		About.add(panel_5_1);
		
		JButton btnHome_1 = new JButton("HOME");
		btnHome_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHome_1.setOpaque(false);
		btnHome_1.setForeground(Color.WHITE);
		btnHome_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnHome_1.setFocusPainted(false);
		btnHome_1.setContentAreaFilled(false);
		btnHome_1.setBorderPainted(false);
		btnHome_1.setBounds(94, 33, 84, 23);
		panel_5_1.add(btnHome_1);
		
		JButton btnAbout_1 = new JButton("ABOUT");
		btnAbout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAbout_1.setOpaque(false);
		btnAbout_1.setForeground(Color.LIGHT_GRAY);
		btnAbout_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnAbout_1.setFocusPainted(false);
		btnAbout_1.setContentAreaFilled(false);
		btnAbout_1.setBorderPainted(false);
		btnAbout_1.setBackground(Color.WHITE);
		btnAbout_1.setBounds(230, 33, 93, 23);
		panel_5_1.add(btnAbout_1);
		
		JButton btnProject_1 = new JButton("PROJECTS");
		btnProject_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnProject_1.setOpaque(false);
		btnProject_1.setForeground(Color.WHITE);
		btnProject_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnProject_1.setFocusPainted(false);
		btnProject_1.setContentAreaFilled(false);
		btnProject_1.setBorderPainted(false);
		btnProject_1.setBackground(Color.WHITE);
		btnProject_1.setBounds(544, 33, 116, 23);
		panel_5_1.add(btnProject_1);
		
		JButton btnExit_1 = new JButton("");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "",JOptionPane.YES_NO_OPTION);
				if (ask == JOptionPane.YES_OPTION) {
					dispose();
				} else {
					setVisible(true);
				}
			}
		});
		btnExit_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (6) (2).png")));
		btnExit_1.setOpaque(false);
		btnExit_1.setForeground(Color.WHITE);
		btnExit_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnExit_1.setFocusPainted(false);
		btnExit_1.setContentAreaFilled(false);
		btnExit_1.setBorderPainted(false);
		btnExit_1.setBackground(Color.WHITE);
		btnExit_1.setBounds(887, 0, 72, 67);
		panel_5_1.add(btnExit_1);
		
		JButton btnEducation_1 = new JButton("EDUCATION");
		btnEducation_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnEducation_1.setOpaque(false);
		btnEducation_1.setForeground(Color.WHITE);
		btnEducation_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnEducation_1.setFocusPainted(false);
		btnEducation_1.setContentAreaFilled(false);
		btnEducation_1.setBorderPainted(false);
		btnEducation_1.setBackground(Color.WHITE);
		btnEducation_1.setBounds(365, 33, 136, 23);
		panel_5_1.add(btnEducation_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (2) (2).png")));
		lblNewLabel_2.setBounds(35, 208, 306, 300);
		About.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home__3_-removebg-preview (2).png")));
		lblNewLabel_3.setBounds(-110, 78, 556, 569);
		About.add(lblNewLabel_3);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(453, 44, 525, 626);
		About.add(tabbedPane_1);
		
		JPanel Name = new JPanel();
		Name.setBackground(new Color (241, 246, 249));
		tabbedPane_1.addTab("New tab", null, Name, null);
		Name.setLayout(null);
		
		JLabel lblnamelabel = new JLabel("NAME");
		lblnamelabel.setForeground(new Color(57, 72, 103));
		lblnamelabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/name.png")));
		lblnamelabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblnamelabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnamelabel.setBounds(30, 33, 125, 44);
		Name.add(lblnamelabel);
		
		JLabel lblFullname = new JLabel(info.fullname);
		lblFullname.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullname.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFullname.setForeground(new Color (57, 72, 103));
		lblFullname.setBounds(145, 31, 346, 44);
		Name.add(lblFullname);
		
		JLabel lblNickname = new JLabel(info.nickname);
		lblNickname.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNickname.setForeground(new Color (57, 72, 103));
		lblNickname.setBounds(145, 107, 346, 30);
		Name.add(lblNickname);
		
		JLabel lblnicknamelabel = new JLabel("NICKNAME");
		lblnicknamelabel.setForeground(new Color(57, 72, 103));
		lblnicknamelabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/nickname.png")));
		lblnicknamelabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblnicknamelabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnicknamelabel.setBounds(30, 101, 192, 44);
		Name.add(lblnicknamelabel);
		
		JLabel lblbdaylabel = new JLabel("BIRTHDAY");
		lblbdaylabel.setForeground(Color.BLACK);
		lblbdaylabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/birthday.png")));
		lblbdaylabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblbdaylabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblbdaylabel.setBounds(30, 156, 218, 44);
		Name.add(lblbdaylabel);
		
		JLabel lblBday = new JLabel(info.bday);
		lblBday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBday.setForeground(Color.BLACK);
		lblBday.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblBday.setBounds(145, 163, 346, 30);
		Name.add(lblBday);
		
		JLabel lblhobbielabel = new JLabel("HOBBIES");
		lblhobbielabel.setForeground(Color.BLACK);
		lblhobbielabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/hobbies.png")));
		lblhobbielabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblhobbielabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblhobbielabel.setBounds(30, 211, 200, 44);
		Name.add(lblhobbielabel);
		
		JLabel lblHobbies = new JLabel(info.hobbies);
		lblHobbies.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies.setForeground(Color.BLACK);
		lblHobbies.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblHobbies.setBounds(186, 211, 305, 44);
		Name.add(lblHobbies);
		
		JLabel lblachievementlabel = new JLabel("ACHIEVEMENTS");
		lblachievementlabel.setForeground(Color.BLACK);
		lblachievementlabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/achievements.png")));
		lblachievementlabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblachievementlabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblachievementlabel.setBounds(30, 266, 299, 44);
		Name.add(lblachievementlabel);
		
		JLabel lblAchievement1 = new JLabel(info.achievement1);
		lblAchievement1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement1.setForeground(Color.BLACK);
		lblAchievement1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement1.setBounds(10, 304, 468, 30);
		Name.add(lblAchievement1);
		
		JLabel lblAchievement2 = new JLabel(info.achievement2);
		lblAchievement2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement2.setForeground(Color.BLACK);
		lblAchievement2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement2.setBounds(20, 329, 468, 30);
		Name.add(lblAchievement2);
		
		JLabel lblreasonlabel = new JLabel("REASON");
		lblreasonlabel.setForeground(Color.BLACK);
		lblreasonlabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/reason.png")));
		lblreasonlabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblreasonlabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblreasonlabel.setBounds(30, 359, 192, 44);
		Name.add(lblreasonlabel);
		
		JLabel lblQuestion = new JLabel(info.question);
		lblQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion.setForeground(Color.BLACK);
		lblQuestion.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblQuestion.setBounds(10, 389, 468, 30);
		Name.add(lblQuestion);
		
		JLabel lblReason1 = new JLabel(info.reason1);
		lblReason1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason1.setForeground(Color.BLACK);
		lblReason1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason1.setBounds(23, 414, 468, 30);
		Name.add(lblReason1);
		
		JLabel lblReason2 = new JLabel(info.reason2);
		lblReason2.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason2.setForeground(Color.BLACK);
		lblReason2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason2.setBounds(23, 438, 468, 30);
		Name.add(lblReason2);
		
		JLabel lblstrengthlabel = new JLabel("STRENGTH");
		lblstrengthlabel.setForeground(Color.BLACK);
		lblstrengthlabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/strength.png")));
		lblstrengthlabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblstrengthlabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblstrengthlabel.setBounds(33, 472, 222, 44);
		Name.add(lblstrengthlabel);
		
		JLabel lblStrength = new JLabel(info.strength);
		lblStrength.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrength.setForeground(Color.BLACK);
		lblStrength.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblStrength.setBounds(182, 479, 299, 30);
		Name.add(lblStrength);
		
		JLabel lblweaknesslabel = new JLabel("WEAKNESS");
		lblweaknesslabel.setForeground(Color.BLACK);
		lblweaknesslabel.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/weakness.png")));
		lblweaknesslabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblweaknesslabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblweaknesslabel.setBounds(33, 520, 222, 44);
		Name.add(lblweaknesslabel);
		
		JLabel lblWeakness = new JLabel(info.weakness);
		lblWeakness.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeakness.setForeground(Color.BLACK);
		lblWeakness.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblWeakness.setBounds(182, 527, 296, 30);
		Name.add(lblWeakness);
		
		JSeparator sep = new JSeparator();
		sep.setBounds(35, 88, 443, 2);
		Name.add(sep);
		
		JPanel Birthday = new JPanel();
		Birthday.setLayout(null);
		Birthday.setBackground(new Color(241, 246, 249));
		tabbedPane_1.addTab("New tab", null, Birthday, null);
		
		JLabel lblnamelabel_1 = new JLabel("NAME");
		lblnamelabel_1.setForeground(Color.BLACK);
		lblnamelabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/name.png")));
		lblnamelabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblnamelabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnamelabel_1.setBounds(30, 33, 125, 44);
		Birthday.add(lblnamelabel_1);
		
		JLabel lblFullname_1 = new JLabel(info.fullname);
		lblFullname_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullname_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFullname_1.setForeground(Color.BLACK);
		lblFullname_1.setBounds(145, 31, 346, 44);
		Birthday.add(lblFullname_1);
		
		JLabel lblNickname_1 = new JLabel(info.nickname);
		lblNickname_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNickname_1.setForeground(Color.BLACK);
		lblNickname_1.setBounds(145, 107, 346, 30);
		Birthday.add(lblNickname_1);
		
		JLabel lblnicknamelabel_1 = new JLabel("NICKNAME");
		lblnicknamelabel_1.setForeground(Color.BLACK);
		lblnicknamelabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/nickname.png")));
		lblnicknamelabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblnicknamelabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnicknamelabel_1.setBounds(30, 101, 192, 44);
		Birthday.add(lblnicknamelabel_1);
		
		JLabel lblbdaylabel_1 = new JLabel("BIRTHDAY");
		lblbdaylabel_1.setForeground(new Color(57, 72, 103));
		lblbdaylabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/birthday.png")));
		lblbdaylabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblbdaylabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblbdaylabel_1.setBounds(30, 156, 218, 44);
		Birthday.add(lblbdaylabel_1);
		
		JLabel lblBday_1 = new JLabel(info.bday);
		lblBday_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBday_1.setForeground(new Color(57, 72, 103));
		lblBday_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblBday_1.setBounds(145, 163, 346, 30);
		Birthday.add(lblBday_1);
		
		JLabel lblhobbieslabel_1 = new JLabel("HOBBIES");
		lblhobbieslabel_1.setForeground(Color.BLACK);
		lblhobbieslabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/hobbies.png")));
		lblhobbieslabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblhobbieslabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblhobbieslabel_1.setBounds(30, 211, 200, 44);
		Birthday.add(lblhobbieslabel_1);
		
		JLabel lblHobbies_1 = new JLabel(info.hobbies);
		lblHobbies_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies_1.setForeground(Color.BLACK);
		lblHobbies_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblHobbies_1.setBounds(186, 211, 305, 44);
		Birthday.add(lblHobbies_1);
		
		JLabel lblachievementlabel_1 = new JLabel("ACHIEVEMENTS");
		lblachievementlabel_1.setForeground(Color.BLACK);
		lblachievementlabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/achievements.png")));
		lblachievementlabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblachievementlabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblachievementlabel_1.setBounds(30, 266, 299, 44);
		Birthday.add(lblachievementlabel_1);
		
		JLabel lblAchievement1_1 = new JLabel(info.achievement1);
		lblAchievement1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement1_1.setForeground(Color.BLACK);
		lblAchievement1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement1_1.setBounds(10, 304, 468, 30);
		Birthday.add(lblAchievement1_1);
		
		JLabel lblAchievement2_1 = new JLabel(info.achievement2);
		lblAchievement2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement2_1.setForeground(Color.BLACK);
		lblAchievement2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement2_1.setBounds(20, 329, 468, 30);
		Birthday.add(lblAchievement2_1);
		
		JLabel lblreasonlabel_1 = new JLabel("REASON");
		lblreasonlabel_1.setForeground(Color.BLACK);
		lblreasonlabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/reason.png")));
		lblreasonlabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblreasonlabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblreasonlabel_1.setBounds(30, 359, 192, 44);
		Birthday.add(lblreasonlabel_1);
		
		JLabel lblQuestion_1 = new JLabel(info.question);
		lblQuestion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion_1.setForeground(Color.BLACK);
		lblQuestion_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblQuestion_1.setBounds(10, 389, 468, 30);
		Birthday.add(lblQuestion_1);
		
		JLabel lblstrengthlabel_1 = new JLabel("STRENGTH");
		lblstrengthlabel_1.setForeground(Color.BLACK);
		lblstrengthlabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/strength.png")));
		lblstrengthlabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblstrengthlabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblstrengthlabel_1.setBounds(33, 472, 222, 44);
		Birthday.add(lblstrengthlabel_1);
		
		JLabel lblStrength_1 = new JLabel(info.strength);
		lblStrength_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrength_1.setForeground(Color.BLACK);
		lblStrength_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblStrength_1.setBounds(182, 479, 299, 30);
		Birthday.add(lblStrength_1);
		
		JLabel lblweaknesslabel_1 = new JLabel("WEAKNESS");
		lblweaknesslabel_1.setForeground(Color.BLACK);
		lblweaknesslabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/weakness.png")));
		lblweaknesslabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblweaknesslabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblweaknesslabel_1.setBounds(33, 520, 222, 44);
		Birthday.add(lblweaknesslabel_1);
		
		JLabel lblWeakness_1 = new JLabel(info.weakness);
		lblWeakness_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeakness_1.setForeground(Color.BLACK);
		lblWeakness_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblWeakness_1.setBounds(182, 527, 296, 30);
		Birthday.add(lblWeakness_1);
		
		JSeparator sep_1 = new JSeparator();
		sep_1.setBounds(35, 88, 443, 2);
		Birthday.add(sep_1);
		
		JLabel lblReason1_1 = new JLabel("I took this course because of the salary");
		lblReason1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason1_1.setForeground(Color.BLACK);
		lblReason1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason1_1.setBounds(23, 414, 468, 30);
		Birthday.add(lblReason1_1);
		
		JLabel lblReason2_1 = new JLabel("and in order to pursue my dream course");
		lblReason2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason2_1.setForeground(Color.BLACK);
		lblReason2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason2_1.setBounds(23, 438, 468, 30);
		Birthday.add(lblReason2_1);
		
		JPanel Hobbies = new JPanel();
		Hobbies.setLayout(null);
		Hobbies.setBackground(new Color(241, 246, 249));
		tabbedPane_1.addTab("New tab", null, Hobbies, null);
		
		JLabel lblnamelabel_2 = new JLabel("NAME");
		lblnamelabel_2.setForeground(Color.BLACK);
		lblnamelabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/name.png")));
		lblnamelabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblnamelabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnamelabel_2.setBounds(30, 33, 125, 44);
		Hobbies.add(lblnamelabel_2);
		
		JLabel lblFullname_2 = new JLabel(info.fullname);
		lblFullname_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullname_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFullname_2.setForeground(Color.BLACK);
		lblFullname_2.setBounds(145, 31, 346, 44);
		Hobbies.add(lblFullname_2);
		
		JLabel lblNickname_2 = new JLabel(info.nickname);
		lblNickname_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNickname_2.setForeground(Color.BLACK);
		lblNickname_2.setBounds(145, 107, 346, 30);
		Hobbies.add(lblNickname_2);
		
		JLabel lblnicknamelabel_2 = new JLabel("NICKNAME");
		lblnicknamelabel_2.setForeground(Color.BLACK);
		lblnicknamelabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/nickname.png")));
		lblnicknamelabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblnicknamelabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnicknamelabel_2.setBounds(30, 101, 192, 44);
		Hobbies.add(lblnicknamelabel_2);
		
		JLabel lblbdaylabel_2 = new JLabel("BIRTHDAY");
		lblbdaylabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/birthday.png")));
		lblbdaylabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblbdaylabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblbdaylabel_2.setBounds(30, 156, 218, 44);
		Hobbies.add(lblbdaylabel_2);
		
		JLabel lblBday_2 = new JLabel(info.bday);
		lblBday_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBday_2.setForeground(Color.BLACK);
		lblBday_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblBday_2.setBounds(145, 163, 346, 30);
		Hobbies.add(lblBday_2);
		
		JLabel lblhobbielabel_2 = new JLabel("HOBBIES");
		lblhobbielabel_2.setForeground(new Color(57, 72, 103));
		lblhobbielabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/hobbies.png")));
		lblhobbielabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblhobbielabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblhobbielabel_2.setBounds(30, 211, 200, 44);
		Hobbies.add(lblhobbielabel_2);
		
		JLabel lblHobbies_2 = new JLabel(info.hobbies);
		lblHobbies_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies_2.setForeground(new Color(57, 72, 103));
		lblHobbies_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblHobbies_2.setBounds(186, 211, 305, 44);
		Hobbies.add(lblHobbies_2);
		
		JLabel lblachievementlabel_2 = new JLabel("ACHIEVEMENTS");
		lblachievementlabel_2.setForeground(Color.BLACK);
		lblachievementlabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/achievements.png")));
		lblachievementlabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblachievementlabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblachievementlabel_2.setBounds(30, 266, 299, 44);
		Hobbies.add(lblachievementlabel_2);
		
		JLabel lblAchievement1_2 = new JLabel(info.achievement1);
		lblAchievement1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement1_2.setForeground(Color.BLACK);
		lblAchievement1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement1_2.setBounds(10, 304, 468, 30);
		Hobbies.add(lblAchievement1_2);
		
		JLabel lblAchievement2_2 = new JLabel(info.achievement2);
		lblAchievement2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement2_2.setForeground(Color.BLACK);
		lblAchievement2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement2_2.setBounds(20, 329, 468, 30);
		Hobbies.add(lblAchievement2_2);
		
		JLabel lblreasonlabel_2 = new JLabel("REASON");
		lblreasonlabel_2.setForeground(Color.BLACK);
		lblreasonlabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/reason.png")));
		lblreasonlabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblreasonlabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblreasonlabel_2.setBounds(30, 359, 192, 44);
		Hobbies.add(lblreasonlabel_2);
		
		JLabel lblQuestion_2 = new JLabel(info.question);
		lblQuestion_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion_2.setForeground(Color.BLACK);
		lblQuestion_2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblQuestion_2.setBounds(10, 389, 468, 30);
		Hobbies.add(lblQuestion_2);
		
		JLabel lblReason1_2 = new JLabel(info.reason1);
		lblReason1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason1_2.setForeground(Color.BLACK);
		lblReason1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason1_2.setBounds(23, 414, 468, 30);
		Hobbies.add(lblReason1_2);
		
		JLabel lblReason2_2 = new JLabel(info.reason2);
		lblReason2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason2_2.setForeground(Color.BLACK);
		lblReason2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason2_2.setBounds(23, 438, 468, 30);
		Hobbies.add(lblReason2_2);
		
		JLabel lblstrengthlabel_2 = new JLabel("STRENGTH");
		lblstrengthlabel_2.setForeground(Color.BLACK);
		lblstrengthlabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/strength.png")));
		lblstrengthlabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblstrengthlabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblstrengthlabel_2.setBounds(33, 472, 222, 44);
		Hobbies.add(lblstrengthlabel_2);
		
		JLabel lblStrength_2 = new JLabel(info.strength);
		lblStrength_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrength_2.setForeground(Color.BLACK);
		lblStrength_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblStrength_2.setBounds(182, 479, 299, 30);
		Hobbies.add(lblStrength_2);
		
		JLabel lblweaknesslabel_2 = new JLabel("WEAKNESS");
		lblweaknesslabel_2.setForeground(Color.BLACK);
		lblweaknesslabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/weakness.png")));
		lblweaknesslabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblweaknesslabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblweaknesslabel_2.setBounds(33, 520, 222, 44);
		Hobbies.add(lblweaknesslabel_2);
		
		JLabel lblWeakness_2 = new JLabel(info.weakness);
		lblWeakness_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeakness_2.setForeground(Color.BLACK);
		lblWeakness_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblWeakness_2.setBounds(182, 527, 296, 30);
		Hobbies.add(lblWeakness_2);
		
		JSeparator sep_2 = new JSeparator();
		sep_2.setBounds(35, 88, 443, 2);
		Hobbies.add(sep_2);
		
		JPanel Achievements = new JPanel();
		Achievements.setLayout(null);
		Achievements.setBackground(new Color(241, 246, 249));
		tabbedPane_1.addTab("New tab", null, Achievements, null);
		
		JLabel lblnamelabel_3 = new JLabel("NAME");
		lblnamelabel_3.setForeground(Color.BLACK);
		lblnamelabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/name.png")));
		lblnamelabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblnamelabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnamelabel_3.setBounds(30, 33, 125, 44);
		Achievements.add(lblnamelabel_3);
		
		JLabel lblFullname_3 = new JLabel(info.fullname);
		lblFullname_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullname_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFullname_3.setForeground(Color.BLACK);
		lblFullname_3.setBounds(145, 31, 346, 44);
		Achievements.add(lblFullname_3);
		
		JLabel lblNickname_3 = new JLabel(info.nickname);
		lblNickname_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNickname_3.setForeground(Color.BLACK);
		lblNickname_3.setBounds(145, 107, 346, 30);
		Achievements.add(lblNickname_3);
		
		JLabel lblnicknamelabel_3 = new JLabel("NICKNAME");
		lblnicknamelabel_3.setForeground(Color.BLACK);
		lblnicknamelabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/nickname.png")));
		lblnicknamelabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblnicknamelabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnicknamelabel_3.setBounds(30, 101, 192, 44);
		Achievements.add(lblnicknamelabel_3);
		
		JLabel lblbdaylabel_3 = new JLabel("BIRTHDAY");
		lblbdaylabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/birthday.png")));
		lblbdaylabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblbdaylabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblbdaylabel_3.setBounds(30, 156, 218, 44);
		Achievements.add(lblbdaylabel_3);
		
		JLabel lblBday_3 = new JLabel(info.bday);
		lblBday_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblBday_3.setForeground(Color.BLACK);
		lblBday_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblBday_3.setBounds(145, 163, 346, 30);
		Achievements.add(lblBday_3);
		
		JLabel lblhobbielabel_3 = new JLabel("HOBBIES");
		lblhobbielabel_3.setForeground(Color.BLACK);
		lblhobbielabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/hobbies.png")));
		lblhobbielabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblhobbielabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblhobbielabel_3.setBounds(30, 211, 200, 44);
		Achievements.add(lblhobbielabel_3);
		
		JLabel lblHobbies_3 = new JLabel(info.hobbies);
		lblHobbies_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies_3.setForeground(Color.BLACK);
		lblHobbies_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblHobbies_3.setBounds(186, 211, 305, 44);
		Achievements.add(lblHobbies_3);
		
		JLabel lblachievementlabel_3 = new JLabel("ACHIEVEMENTS");
		lblachievementlabel_3.setForeground(new Color(57, 72, 103));
		lblachievementlabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/achievements.png")));
		lblachievementlabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblachievementlabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblachievementlabel_3.setBounds(30, 266, 299, 44);
		Achievements.add(lblachievementlabel_3);
		
		JLabel lblAchievement1_3 = new JLabel(info.achievement1);
		lblAchievement1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement1_3.setForeground(new Color(57, 72, 103));
		lblAchievement1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement1_3.setBounds(10, 304, 468, 30);
		Achievements.add(lblAchievement1_3);
		
		JLabel lblAchievement2_3 = new JLabel(info.achievement2);
		lblAchievement2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement2_3.setForeground(new Color(57, 72, 103));
		lblAchievement2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement2_3.setBounds(20, 329, 468, 30);
		Achievements.add(lblAchievement2_3);
		
		JLabel lblreasonlabel_3 = new JLabel("REASON");
		lblreasonlabel_3.setForeground(Color.BLACK);
		lblreasonlabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/reason.png")));
		lblreasonlabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblreasonlabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblreasonlabel_3.setBounds(30, 359, 192, 44);
		Achievements.add(lblreasonlabel_3);
		
		JLabel lblQuestion_3 = new JLabel(info.question);
		lblQuestion_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion_3.setForeground(Color.BLACK);
		lblQuestion_3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblQuestion_3.setBounds(10, 389, 468, 30);
		Achievements.add(lblQuestion_3);
		
		JLabel lblReason1_3 = new JLabel(info.reason1);
		lblReason1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason1_3.setForeground(Color.BLACK);
		lblReason1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason1_3.setBounds(23, 414, 468, 30);
		Achievements.add(lblReason1_3);
		
		JLabel lblReason2_3 = new JLabel(info.reason2);
		lblReason2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason2_3.setForeground(Color.BLACK);
		lblReason2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason2_3.setBounds(23, 438, 468, 30);
		Achievements.add(lblReason2_3);
		
		JLabel lblstrengthlabel_3 = new JLabel("STRENGTH");
		lblstrengthlabel_3.setForeground(Color.BLACK);
		lblstrengthlabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/strength.png")));
		lblstrengthlabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblstrengthlabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblstrengthlabel_3.setBounds(33, 472, 222, 44);
		Achievements.add(lblstrengthlabel_3);
		
		JLabel lblStrength_3 = new JLabel(info.strength);
		lblStrength_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrength_3.setForeground(Color.BLACK);
		lblStrength_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblStrength_3.setBounds(182, 479, 299, 30);
		Achievements.add(lblStrength_3);
		
		JLabel lblweaknesslabel_3 = new JLabel("WEAKNESS");
		lblweaknesslabel_3.setForeground(Color.BLACK);
		lblweaknesslabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/weakness.png")));
		lblweaknesslabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblweaknesslabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblweaknesslabel_3.setBounds(33, 520, 222, 44);
		Achievements.add(lblweaknesslabel_3);
		
		JLabel lblWeakness_3 = new JLabel(info.weakness);
		lblWeakness_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeakness_3.setForeground(Color.BLACK);
		lblWeakness_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblWeakness_3.setBounds(182, 527, 296, 30);
		Achievements.add(lblWeakness_3);
		
		JSeparator sep_3 = new JSeparator();
		sep_3.setBounds(35, 88, 443, 2);
		Achievements.add(sep_3);
		
		JPanel Reason = new JPanel();
		Reason.setLayout(null);
		Reason.setBackground(new Color(241, 246, 249));
		tabbedPane_1.addTab("New tab", null, Reason, null);
		
		JLabel lblnamelabel_4 = new JLabel("NAME");
		lblnamelabel_4.setForeground(Color.BLACK);
		lblnamelabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/name.png")));
		lblnamelabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblnamelabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnamelabel_4.setBounds(30, 33, 125, 44);
		Reason.add(lblnamelabel_4);
		
		JLabel lblFullname_4 = new JLabel(info.fullname);
		lblFullname_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullname_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFullname_4.setForeground(Color.BLACK);
		lblFullname_4.setBounds(145, 31, 346, 44);
		Reason.add(lblFullname_4);
		
		JLabel lblNickname_4 = new JLabel(info.nickname);
		lblNickname_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNickname_4.setForeground(Color.BLACK);
		lblNickname_4.setBounds(145, 107, 346, 30);
		Reason.add(lblNickname_4);
		
		JLabel lblnicknamelabel_4 = new JLabel("NICKNAME");
		lblnicknamelabel_4.setForeground(Color.BLACK);
		lblnicknamelabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/nickname.png")));
		lblnicknamelabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblnicknamelabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnicknamelabel_4.setBounds(30, 101, 192, 44);
		Reason.add(lblnicknamelabel_4);
		
		JLabel lblbdaylabel_4 = new JLabel("BIRTHDAY");
		lblbdaylabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/birthday.png")));
		lblbdaylabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblbdaylabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblbdaylabel_4.setBounds(30, 156, 218, 44);
		Reason.add(lblbdaylabel_4);
		
		JLabel lblBday_4 = new JLabel(info.bday);
		lblBday_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblBday_4.setForeground(Color.BLACK);
		lblBday_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblBday_4.setBounds(145, 163, 346, 30);
		Reason.add(lblBday_4);
		
		JLabel lblhobbielabel_4 = new JLabel("HOBBIES");
		lblhobbielabel_4.setForeground(Color.BLACK);
		lblhobbielabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/hobbies.png")));
		lblhobbielabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblhobbielabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblhobbielabel_4.setBounds(30, 211, 200, 44);
		Reason.add(lblhobbielabel_4);
		
		JLabel lblHobbies_4 = new JLabel(info.hobbies);
		lblHobbies_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies_4.setForeground(Color.BLACK);
		lblHobbies_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblHobbies_4.setBounds(186, 211, 305, 44);
        Reason.add(lblHobbies_4);
		
		JLabel lblachievementlabel_4 = new JLabel("ACHIEVEMENTS");
		lblachievementlabel_4.setForeground(Color.BLACK);
		lblachievementlabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/achievements.png")));
		lblachievementlabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblachievementlabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblachievementlabel_4.setBounds(30, 266, 299, 44);
		Reason.add(lblachievementlabel_4);
		
		JLabel lblAchievement1_4 = new JLabel(info.achievement1);
		lblAchievement1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement1_4.setForeground(Color.BLACK);
		lblAchievement1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement1_4.setBounds(10, 304, 468, 30);
		Reason.add(lblAchievement1_4);
		
		JLabel lblAchievement2_4 = new JLabel(info.achievement2);
		lblAchievement2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement2_4.setForeground(Color.BLACK);
		lblAchievement2_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement2_4.setBounds(20, 329, 468, 30);
		Reason.add(lblAchievement2_4);
		
		JLabel lblreasonlabel_4 = new JLabel("REASON");
		lblreasonlabel_4.setForeground(new Color(57, 72, 103));
		lblreasonlabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/reason.png")));
		lblreasonlabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblreasonlabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblreasonlabel_4.setBounds(30, 359, 192, 44);
		Reason.add(lblreasonlabel_4);
		
		JLabel lblQuestion_4 = new JLabel(info.question);
		lblQuestion_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion_4.setForeground(Color.BLACK);
		lblQuestion_4.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblQuestion_4.setBounds(10, 389, 468, 30);
		Reason.add(lblQuestion_4);
		
		JLabel lblReason1_4 = new JLabel(info.reason1);
		lblReason1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason1_4.setForeground(new Color(57, 72, 103));
		lblReason1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason1_4.setBounds(23, 414, 468, 30);
		Reason.add(lblReason1_4);
		
		JLabel lblReason2_4 = new JLabel(info.reason2);
		lblReason2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason2_4.setForeground(new Color(57, 72, 103));
		lblReason2_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason2_4.setBounds(23, 438, 468, 30);
		Reason.add(lblReason2_4);
		
		JLabel lblstrengthlabel_4 = new JLabel("STRENGTH");
		lblstrengthlabel_4.setForeground(Color.BLACK);
		lblstrengthlabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/strength.png")));
		lblstrengthlabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblstrengthlabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblstrengthlabel_4.setBounds(33, 472, 222, 44);
		Reason.add(lblstrengthlabel_4);
		
		JLabel lblStrength_4 = new JLabel(info.strength);
		lblStrength_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrength_4.setForeground(Color.BLACK);
		lblStrength_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblStrength_4.setBounds(182, 479, 299, 30);
		Reason.add(lblStrength_4);
		
		JLabel lblweaknesslabel_4 = new JLabel("WEAKNESS");
		lblweaknesslabel_4.setForeground(Color.BLACK);
		lblweaknesslabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/weakness.png")));
		lblweaknesslabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblweaknesslabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblweaknesslabel_4.setBounds(33, 520, 222, 44);
		Reason.add(lblweaknesslabel_4);
		
		JLabel lblWeakness_4 = new JLabel(info.weakness);
		lblWeakness_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeakness_4.setForeground(Color.BLACK);
		lblWeakness_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblWeakness_4.setBounds(182, 527, 296, 30);
		Reason.add(lblWeakness_4);
		
		JSeparator sep_4 = new JSeparator();
		sep_4.setBounds(35, 88, 443, 2);
		Reason.add(sep_4);
		
		JPanel StreandWeak = new JPanel();
		StreandWeak.setLayout(null);
		StreandWeak.setBackground(new Color(241, 246, 249));
		tabbedPane_1.addTab("New tab", null, StreandWeak, null);
		
		JLabel lblnamelabel_5 = new JLabel("NAME");
		lblnamelabel_5.setForeground(Color.BLACK);
		lblnamelabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/name.png")));
		lblnamelabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblnamelabel_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnamelabel_5.setBounds(30, 33, 125, 44);
		StreandWeak.add(lblnamelabel_5);
		
		JLabel lblFullname_5 = new JLabel(info.fullname);
		lblFullname_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullname_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFullname_5.setForeground(Color.BLACK);
		lblFullname_5.setBounds(145, 31, 346, 44);
		StreandWeak.add(lblFullname_5);
		
		JLabel lblNickname_5 = new JLabel(info.nickname);
		lblNickname_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNickname_5.setForeground(Color.BLACK);
		lblNickname_5.setBounds(145, 107, 346, 30);
		StreandWeak.add(lblNickname_5);
		
		JLabel lblnicknamelabel_5 = new JLabel("NICKNAME");
		lblnicknamelabel_5.setForeground(Color.BLACK);
		lblnicknamelabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/nickname.png")));
		lblnicknamelabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblnicknamelabel_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblnicknamelabel_5.setBounds(30, 101, 192, 44);
		StreandWeak.add(lblnicknamelabel_5);
		
		JLabel lblbdaylabel_5 = new JLabel("BIRTHDAY");
		lblbdaylabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/birthday.png")));
		lblbdaylabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblbdaylabel_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblbdaylabel_5.setBounds(30, 156, 218, 44);
		StreandWeak.add(lblbdaylabel_5);
		
		JLabel lblBday_5 = new JLabel(info.bday);
		lblBday_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblBday_5.setForeground(Color.BLACK);
		lblBday_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblBday_5.setBounds(145, 163, 346, 30);
		StreandWeak.add(lblBday_5);
		
		JLabel lblhobbielabel_5 = new JLabel("HOBBIES");
		lblhobbielabel_5.setForeground(Color.BLACK);
		lblhobbielabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/hobbies.png")));
		lblhobbielabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblhobbielabel_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblhobbielabel_5.setBounds(30, 211, 200, 44);
		StreandWeak.add(lblhobbielabel_5);
		
		JLabel lblHobbies_5 = new JLabel(info.hobbies);
		lblHobbies_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies_5.setForeground(Color.BLACK);
		lblHobbies_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblHobbies_5.setBounds(186, 211, 305, 44);
        StreandWeak.add(lblHobbies_5);
		
		JLabel lblachievementlabel_5 = new JLabel("ACHIEVEMENTS");
		lblachievementlabel_5.setForeground(Color.BLACK);
		lblachievementlabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/achievements.png")));
		lblachievementlabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblachievementlabel_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblachievementlabel_5.setBounds(30, 266, 299, 44);
		StreandWeak.add(lblachievementlabel_5);
		
		JLabel lblAchievement1_5 = new JLabel(info.achievement1);
		lblAchievement1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement1_5.setForeground(Color.BLACK);
		lblAchievement1_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement1_5.setBounds(10, 304, 468, 30);
		StreandWeak.add(lblAchievement1_5);
		
		JLabel lblAchievement2_5 = new JLabel(info.achievement2);
		lblAchievement2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement2_5.setForeground(Color.BLACK);
		lblAchievement2_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAchievement2_5.setBounds(20, 329, 468, 30);
		StreandWeak.add(lblAchievement2_5);
		
		JLabel lblreasonlabel_5 = new JLabel("REASON");
		lblreasonlabel_5.setForeground(Color.BLACK);
		lblreasonlabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/reason.png")));
		lblreasonlabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblreasonlabel_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblreasonlabel_5.setBounds(30, 359, 192, 44);
		StreandWeak.add(lblreasonlabel_5);
		
		JLabel lblQuestion_5 = new JLabel(info.question);
		lblQuestion_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion_5.setForeground(Color.BLACK);
		lblQuestion_5.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblQuestion_5.setBounds(10, 389, 468, 30);
		StreandWeak.add(lblQuestion_5);
		
		JLabel lblReason1_5 = new JLabel(info.reason1);
		lblReason1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason1_5.setForeground(Color.BLACK);
		lblReason1_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason1_5.setBounds(23, 414, 468, 30);
		StreandWeak.add(lblReason1_5);
		
		JLabel lblReason2_5 = new JLabel(info.reason2);
		lblReason2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblReason2_5.setForeground(Color.BLACK);
		lblReason2_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReason2_5.setBounds(23, 438, 468, 30);
		StreandWeak.add(lblReason2_5);
		
		JLabel lblstrengthlabel_5 = new JLabel("STRENGTH");
		lblstrengthlabel_5.setForeground(new Color(57, 72, 103));
		lblstrengthlabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/strength.png")));
		lblstrengthlabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblstrengthlabel_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblstrengthlabel_5.setBounds(33, 472, 222, 44);
		StreandWeak.add(lblstrengthlabel_5);
		
		JLabel lblStrength_5 = new JLabel(info.strength);
		lblStrength_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrength_5.setForeground(new Color(57, 72, 103));
		lblStrength_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblStrength_5.setBounds(182, 479, 299, 30);
		StreandWeak.add(lblStrength_5);
		
		JLabel lblweaknesslabel_5 = new JLabel("WEAKNESS");
		lblweaknesslabel_5.setForeground(new Color(57, 72, 103));
		lblweaknesslabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/weakness.png")));
		lblweaknesslabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblweaknesslabel_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblweaknesslabel_5.setBounds(33, 520, 222, 44);
		StreandWeak.add(lblweaknesslabel_5);
		
		JLabel lblWeakness_5 = new JLabel(info.weakness);
		lblWeakness_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeakness_5.setForeground(new Color(57, 72, 103));
		lblWeakness_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblWeakness_5.setBounds(182, 527, 296, 30);
		StreandWeak.add(lblWeakness_5);
		
		JSeparator sep_5 = new JSeparator();
		sep_5.setBounds(35, 88, 443, 2);
		StreandWeak.add(sep_5);
		
		JButton btnName = new JButton("");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(0);
			}
		});
		btnName.setFocusPainted(false);
		btnName.setOpaque(false);
		btnName.setContentAreaFilled(false);
		btnName.setBorderPainted(false);
		btnName.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/7 (1).png")));
		btnName.setBounds(149, 99, 82, 67);
		About.add(btnName);
		
		JButton btnBirthday = new JButton("");
		btnBirthday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(1);
			}
		});
		btnBirthday.setFocusPainted(false);
		btnBirthday.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/8 (1).png")));
		btnBirthday.setOpaque(false);
		btnBirthday.setContentAreaFilled(false);
		btnBirthday.setBorderPainted(false);
		btnBirthday.setBounds(280, 133, 82, 67);
		About.add(btnBirthday);
		
		JButton btnHobbies = new JButton("");
		btnHobbies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(2);
			}
		});
		btnHobbies.setFocusPainted(false);
		btnHobbies.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/9 (1).png")));
		btnHobbies.setOpaque(false);
		btnHobbies.setContentAreaFilled(false);
		btnHobbies.setBorderPainted(false);
		btnHobbies.setBounds(364, 256, 82, 67);
		About.add(btnHobbies);
		
		JButton btnTalent = new JButton("");
		btnTalent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(3);
			}
		});
		btnTalent.setFocusPainted(false);
		btnTalent.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/10 (1).png")));
		btnTalent.setOpaque(false);
		btnTalent.setContentAreaFilled(false);
		btnTalent.setBorderPainted(false);
		btnTalent.setBounds(364, 403, 82, 67);
		About.add(btnTalent);
		
		JButton btnReason = new JButton("");
		btnReason.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(4);
			}
		});
		btnReason.setFocusPainted(false);
		btnReason.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/11 (1).png")));
		btnReason.setOpaque(false);
		btnReason.setContentAreaFilled(false);
		btnReason.setBorderPainted(false);
		btnReason.setBounds(288, 520, 74, 67);
		About.add(btnReason);
		
		JButton btnSW = new JButton("");
		btnSW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(5);
			}
		});
		btnSW.setFocusPainted(false);
		btnSW.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/12 (1).png")));
		btnSW.setOpaque(false);
		btnSW.setContentAreaFilled(false);
		btnSW.setBorderPainted(false);
		btnSW.setBounds(149, 559, 82, 67);
		About.add(btnSW);
		
		JPanel Education = new JPanel();
		Education.setLayout(null);
		Education.setBackground(new Color(241, 246, 249));
		tabbedPane.addTab("New tab", null, Education, null);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setLayout(null);
		panel_5_3.setBackground(new Color(57, 72, 103));
		panel_5_3.setBounds(0, 0, 959, 67);
		Education.add(panel_5_3);
		
		JButton btnHome_2 = new JButton("HOME");
		btnHome_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHome_2.setOpaque(false);
		btnHome_2.setForeground(Color.WHITE);
		btnHome_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnHome_2.setFocusPainted(false);
		btnHome_2.setContentAreaFilled(false);
		btnHome_2.setBorderPainted(false);
		btnHome_2.setBounds(94, 33, 84, 23);
		panel_5_3.add(btnHome_2);
		
		JButton btnAbout_2 = new JButton("ABOUT");
		btnAbout_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAbout_2.setOpaque(false);
		btnAbout_2.setForeground(Color.WHITE);
		btnAbout_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnAbout_2.setFocusPainted(false);
		btnAbout_2.setContentAreaFilled(false);
		btnAbout_2.setBorderPainted(false);
		btnAbout_2.setBackground(Color.WHITE);
		btnAbout_2.setBounds(230, 33, 93, 23);
		panel_5_3.add(btnAbout_2);
		
		JButton btnProject_2 = new JButton("PROJECTS");
		btnProject_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnProject_2.setOpaque(false);
		btnProject_2.setForeground(Color.WHITE);
		btnProject_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnProject_2.setFocusPainted(false);
		btnProject_2.setContentAreaFilled(false);
		btnProject_2.setBorderPainted(false);
		btnProject_2.setBackground(Color.WHITE);
		btnProject_2.setBounds(544, 33, 116, 23);
		panel_5_3.add(btnProject_2);
		
		JButton btnExit_2 = new JButton("");
		btnExit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "",JOptionPane.YES_NO_OPTION);
				if (ask == JOptionPane.YES_OPTION) {
					dispose();
				} else {
					setVisible(true);
				}
			}
		});
		btnExit_2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (6) (2).png")));
		btnExit_2.setOpaque(false);
		btnExit_2.setForeground(Color.WHITE);
		btnExit_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnExit_2.setFocusPainted(false);
		btnExit_2.setContentAreaFilled(false);
		btnExit_2.setBorderPainted(false);
		btnExit_2.setBackground(Color.WHITE);
		btnExit_2.setBounds(887, 0, 72, 67);
		panel_5_3.add(btnExit_2);
		
		JButton btnEducation_2 = new JButton("EDUCATION");
		btnEducation_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnEducation_2.setOpaque(false);
		btnEducation_2.setForeground(Color.LIGHT_GRAY);
		btnEducation_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnEducation_2.setFocusPainted(false);
		btnEducation_2.setContentAreaFilled(false);
		btnEducation_2.setBorderPainted(false);
		btnEducation_2.setBackground(Color.WHITE);
		btnEducation_2.setBounds(365, 33, 136, 23);
		panel_5_3.add(btnEducation_2);
		
		JLabel lblEducation = new JLabel("MY EDUCATION");
		lblEducation.setForeground(Color.decode("#212A3E"));
		lblEducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblEducation.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblEducation.setBounds(10, 78, 939, 47);
		Education.add(lblEducation);
		
		JLabel lblPrim = new JLabel("PRIMARY");
		lblPrim.setForeground(new Color(82, 109, 130));
		lblPrim.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPrim.setBounds(50, 123, 138, 41);
		Education.add(lblPrim);
		
		JLabel lblSchool1 = new JLabel(info.school1);
		lblSchool1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/53 (1).png")));
		lblSchool1.setForeground(Color.decode("#27374D"));
		lblSchool1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSchool1.setBounds(100, 165, 378, 67);
		Education.add(lblSchool1);
		
		JTextArea Content1 = new JTextArea(info.content1);
		Content1.setForeground(Color.BLACK);
		Content1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		
		Content1.setBounds(110, 226, 368, 58);
		Content1.setOpaque(false);
		Education.add(Content1);
		
		JLabel lblSec = new JLabel("SECONDARY");
		lblSec.setForeground(new Color(82, 109, 130));
		lblSec.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblSec.setBounds(50, 282, 214, 41);
		Education.add(lblSec);
		
		JLabel lblSchool2 = new JLabel(info.school2);
		lblSchool2.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (16) (1).png")));
		lblSchool2.setForeground(Color.decode("#27374D"));
		lblSchool2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSchool2.setBounds(100, 324, 378, 67);
		Education.add(lblSchool2);
		
		JTextArea Content2 = new JTextArea(info.content2);
		Content2.setForeground(Color.BLACK);
		Content2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Content2.setBounds(110, 385, 658, 85);
		Content2.setOpaque(false);
		Education.add(Content2);
		
		JLabel lblYr1 = new JLabel(info.year1);
		lblYr1.setForeground(Color.BLACK);
		lblYr1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblYr1.setBounds(488, 186, 51, 14);
		Education.add(lblYr1);
		
		JLabel lblYr2 = new JLabel(info.year2);
		lblYr2.setForeground(Color.BLACK);
		lblYr2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblYr2.setBounds(488, 349, 51, 14);
		Education.add(lblYr2);
		
		JLabel lblTer = new JLabel("TERTIARY (Current)");
		lblTer.setForeground(new Color(82, 109, 130));
		lblTer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblTer.setBounds(50, 468, 214, 47);
		Education.add(lblTer);
		
		JLabel lblSchool3 = new JLabel(info.school);
		lblSchool3.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/national-u-logo-750x599 (2) (1).png")));
		lblSchool3.setForeground(Color.decode("#27374D"));
		lblSchool3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSchool3.setBounds(100, 512, 320, 65);
		Education.add(lblSchool3);
		
		JTextArea Content3 = new JTextArea(info.coursename);
		Content3.setForeground(Color.BLACK);
		Content3.setOpaque(false);
		Content3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Content3.setBounds(110, 571, 766, 34);
		Education.add(Content3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 165, 959, 119);
		panel_6.setBackground(Color.decode("#9DB2BF"));
		Education.add(panel_6);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(new Color(157, 178, 191));
		panel_6_1.setBounds(0, 324, 959, 146);
		Education.add(panel_6_1);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(new Color(157, 178, 191));
		panel_6_2.setBounds(0, 512, 959, 137);
		Education.add(panel_6_2);
		
		JPanel Projects = new JPanel();
		Projects.setBackground(new Color(241, 246, 249));
		tabbedPane.addTab("New tab", null, Projects, null);
		Projects.setLayout(null);
		
		JPanel panel_5_4 = new JPanel();
		panel_5_4.setLayout(null);
		panel_5_4.setBackground(new Color(57, 72, 103));
		panel_5_4.setBounds(0, 0, 959, 67);
		Projects.add(panel_5_4);
		
		JButton btnHome_3 = new JButton("HOME");
		btnHome_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnHome_3.setOpaque(false);
		btnHome_3.setForeground(Color.WHITE);
		btnHome_3.setFont(new Font("Arial", Font.BOLD, 15));
		btnHome_3.setFocusPainted(false);
		btnHome_3.setContentAreaFilled(false);
		btnHome_3.setBorderPainted(false);
		btnHome_3.setBounds(94, 33, 84, 23);
		panel_5_4.add(btnHome_3);
		
		JButton btnAbout_3 = new JButton("ABOUT");
		btnAbout_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAbout_3.setOpaque(false);
		btnAbout_3.setForeground(Color.WHITE);
		btnAbout_3.setFont(new Font("Arial", Font.BOLD, 15));
		btnAbout_3.setFocusPainted(false);
		btnAbout_3.setContentAreaFilled(false);
		btnAbout_3.setBorderPainted(false);
		btnAbout_3.setBackground(Color.WHITE);
		btnAbout_3.setBounds(230, 33, 93, 23);
		panel_5_4.add(btnAbout_3);
		
		JButton btnProject_3 = new JButton("PROJECTS");
		btnProject_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnProject_3.setOpaque(false);
		btnProject_3.setForeground(Color.LIGHT_GRAY);
		btnProject_3.setFont(new Font("Arial", Font.BOLD, 15));
		btnProject_3.setFocusPainted(false);
		btnProject_3.setContentAreaFilled(false);
		btnProject_3.setBorderPainted(false);
		btnProject_3.setBackground(Color.WHITE);
		btnProject_3.setBounds(544, 33, 116, 23);
		panel_5_4.add(btnProject_3);
		
		JButton btnExit_1_1 = new JButton("");
		btnExit_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ask = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "",JOptionPane.YES_NO_OPTION);
				if (ask == JOptionPane.YES_OPTION) {
					dispose();
				} else {
					setVisible(true);
				}
			}
		});
		btnExit_1_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (6) (2).png")));
		btnExit_1_1.setOpaque(false);
		btnExit_1_1.setForeground(Color.WHITE);
		btnExit_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnExit_1_1.setFocusPainted(false);
		btnExit_1_1.setContentAreaFilled(false);
		btnExit_1_1.setBorderPainted(false);
		btnExit_1_1.setBackground(Color.WHITE);
		btnExit_1_1.setBounds(887, 0, 72, 67);
		panel_5_4.add(btnExit_1_1);
		
		JButton btnEducation_3 = new JButton("EDUCATION");
		btnEducation_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnEducation_3.setOpaque(false);
		btnEducation_3.setForeground(Color.WHITE);
		btnEducation_3.setFont(new Font("Arial", Font.BOLD, 15));
		btnEducation_3.setFocusPainted(false);
		btnEducation_3.setContentAreaFilled(false);
		btnEducation_3.setBorderPainted(false);
		btnEducation_3.setBackground(Color.WHITE);
		btnEducation_3.setBounds(365, 33, 136, 23);
		panel_5_4.add(btnEducation_3);
		
		JTextArea txtCalculator = new JTextArea();
		txtCalculator.setText(info.cal);
		txtCalculator.setOpaque(false);
		txtCalculator.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtCalculator.setEditable(false);
		txtCalculator.setBounds(495, 508, 387, 88);
		Projects.add(txtCalculator);
		
		JTextArea txtTictactoe = new JTextArea();
		txtTictactoe.setEditable(false);
		txtTictactoe.setText(info.tictac);
		txtTictactoe.setOpaque(false);
		txtTictactoe.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtTictactoe.setBounds(74, 345, 386, 88);
		Projects.add(txtTictactoe);
		
		JTextArea txtLibrarySystem = new JTextArea();
		txtLibrarySystem.setEditable(false);
		txtLibrarySystem.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtLibrarySystem.setText(info.libsys);
		txtLibrarySystem.setBounds(495, 188, 379, 67);
		txtLibrarySystem.setOpaque(false);
		Projects.add(txtLibrarySystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(74, 141, 289, 185);
		panel_1.setBackground(new Color(57, 72, 103));
		Projects.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnLibrarySystem = new JButton("");
		btnLibrarySystem.setBounds(0, 0, 289, 185);
		panel_1.add(btnLibrarySystem);
		btnLibrarySystem.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnLibrarySystem.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnLibrarySystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin admin = new AdminLogin();
				admin.setVisible(true);
				
				dispose();
			}
		});
		btnLibrarySystem.setOpaque(false);
		btnLibrarySystem.setContentAreaFilled(false);
		btnLibrarySystem.setFocusPainted(false);
		btnLibrarySystem.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/Screenshot 2023-05-21 204451.png")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(57, 72, 103));
		panel_2.setBounds(105, 456, 230, 180);
		Projects.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btncalculator = new JButton("");
		btncalculator.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/Screenshot 2023-05-25 160118.png")));
		btncalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator Calculator = new Calculator();
				Calculator.setVisible(true);
				
				dispose();
			}
		});
		btncalculator.setOpaque(false);
		btncalculator.setContentAreaFilled(false);
		btncalculator.setFocusPainted(false);
		btncalculator.setBorder(new EmptyBorder(0, 0, 0, 0));
		btncalculator.setBounds(0, 0, 230, 180);
		panel_2.add(btncalculator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(57, 72, 103));
		panel_3.setBounds(577, 301, 292, 184);
		Projects.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnTictactoe = new JButton("");
		btnTictactoe.setBounds(0, 0, 292, 184);
		panel_3.add(btnTictactoe);
		btnTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TictactoeMenu menu = new TictactoeMenu ();
				menu.setVisible(true);
				
				dispose();
			}
		});
		btnTictactoe.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/tictactoe.png")));
		btnTictactoe.setOpaque(false);
		btnTictactoe.setFocusPainted(false);
		btnTictactoe.setContentAreaFilled(false);
		btnTictactoe.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnTictactoe.setAlignmentX(0.5f);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.DARK_GRAY);
		separator_1.setBounds(361, 233, 107, 14);
		Projects.add(separator_1);
		
		JLabel lblWorks = new JLabel("MY WORKS");
		lblWorks.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (8) (1).png")));
		lblWorks.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorks.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblWorks.setBounds(10, 78, 939, 62);
		lblWorks.setForeground(new Color (33, 42, 62));
		Projects.add(lblWorks);
		
		JLabel lblWorks_1 = new JLabel("");
		lblWorks_1.setIcon(new ImageIcon(MainPage.class.getResource("/pictures/home (7).png")));
		lblWorks_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorks_1.setForeground(new Color(33, 42, 62));
		lblWorks_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblWorks_1.setBounds(0, 140, 949, 495);
		Projects.add(lblWorks_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.DARK_GRAY);
		separator_1_1.setBounds(481, 387, 144, 14);
		Projects.add(separator_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBackground(Color.DARK_GRAY);
		separator_1_2.setBounds(334, 548, 134, 14);
		Projects.add(separator_1_2);
		setLocationRelativeTo(null);
	}
}

package usermanagement.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserManagementFrame extends JFrame {

	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerUsernameField;
	private JPasswordField registerpasswordField;
	private JTextField registernameField;
	private JTextField registeremailField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserManagementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setLocation(0, 0);
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));
		
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JLabel LogoText = new JLabel("UserManagement");
		LogoText.setFont(new Font("Arial", Font.BOLD, 20));
		LogoText.setHorizontalAlignment(SwingConstants.CENTER);
		LogoText.setBounds(75, 50, 250, 50);
		loginPanel.add(LogoText);
		
		JLabel LoginText = new JLabel("Login");
		LoginText.setFont(new Font("Arial", Font.PLAIN, 30));
		LoginText.setHorizontalAlignment(SwingConstants.CENTER);
		LoginText.setBounds(115, 100, 170, 50);
		loginPanel.add(LoginText);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Arial", Font.PLAIN, 12));
		usernameField.setBounds(75, 220, 250, 30);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordField.setBounds(75, 280, 250, 30);
		loginPanel.add(passwordField);
		
		JLabel usernameLable = new JLabel("Username or email");
		usernameLable.setFont(new Font("Arial", Font.PLAIN, 12));
		usernameLable.setBounds(75, 200, 120, 15);
		loginPanel.add(usernameLable);
		
		JLabel passwordLable = new JLabel("Password");
		passwordLable.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordLable.setBounds(75, 260, 60, 15);
		loginPanel.add(passwordLable);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(new Color(192, 192, 192));
		loginButton.setFont(new Font("Arial", Font.PLAIN, 18));
		loginButton.setBounds(75, 320, 250, 30);
		loginPanel.add(loginButton);
		
		JLabel signupDescription = new JLabel("Don't have an account?");
		signupDescription.setFont(new Font("Arial", Font.PLAIN, 12));
		signupDescription.setBounds(75, 360, 130, 15);
		loginPanel.add(signupDescription);
		
		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				mainPanel에서 registerPanel 키 값을 가진 화면을 보여줌
				mainCard.show(mainPanel, "registerPanel");
			}
		});
		signupLink.setForeground(new Color(0, 128, 255));
		signupLink.setFont(new Font("Arial", Font.PLAIN, 12));
		signupLink.setBounds(210, 360, 50, 15);
		loginPanel.add(signupLink);
		
		JLabel forgotPasswordLink = new JLabel("Forgot your password?");
		forgotPasswordLink.setFont(new Font("Arial", Font.PLAIN, 12));
		forgotPasswordLink.setForeground(new Color(0, 128, 255));
		forgotPasswordLink.setBounds(75, 380, 130, 15);
		loginPanel.add(forgotPasswordLink);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel signinLink = new JLabel("Sign in");
		signinLink.setForeground(new Color(0, 128, 255));
		signinLink.setFont(new Font("Arial", Font.PLAIN, 12));
		signinLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				mainPanel에서 loginPanel 키 값을 가진 화면을 보여줌
				mainCard.show(mainPanel, "loginPanel");
			}
		});
		signinLink.setHorizontalAlignment(SwingConstants.CENTER);
		signinLink.setBounds(175, 440, 50, 15);
		registerPanel.add(signinLink);
		
		JLabel registerLogoText = new JLabel("UserManagement");
		registerLogoText.setHorizontalAlignment(SwingConstants.CENTER);
		registerLogoText.setFont(new Font("Arial", Font.BOLD, 20));
		registerLogoText.setBounds(75, 50, 250, 50);
		registerPanel.add(registerLogoText);
		
		JLabel RegisterText = new JLabel("Register");
		RegisterText.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterText.setFont(new Font("Arial", Font.PLAIN, 30));
		RegisterText.setBounds(115, 100, 170, 50);
		registerPanel.add(RegisterText);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setFont(new Font("Arial", Font.PLAIN, 12));
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(75, 170, 250, 30);
		registerPanel.add(registerUsernameField);
		
		registerpasswordField = new JPasswordField();
		registerpasswordField.setFont(new Font("Arial", Font.PLAIN, 12));
		registerpasswordField.setBounds(75, 230, 250, 30);
		registerPanel.add(registerpasswordField);
		
		JLabel registerusernameLable = new JLabel("Username");
		registerusernameLable.setFont(new Font("Arial", Font.PLAIN, 12));
		registerusernameLable.setBounds(75, 150, 120, 15);
		registerPanel.add(registerusernameLable);
		
		JLabel registerpasswordLable = new JLabel("Password");
		registerpasswordLable.setFont(new Font("Arial", Font.PLAIN, 12));
		registerpasswordLable.setBounds(75, 210, 60, 15);
		registerPanel.add(registerpasswordLable);
		
		registernameField = new JTextField();
		registernameField.setFont(new Font("Arial", Font.PLAIN, 12));
		registernameField.setColumns(10);
		registernameField.setBounds(75, 290, 250, 30);
		registerPanel.add(registernameField);
		
		JLabel registernameLable = new JLabel("name");
		registernameLable.setFont(new Font("Arial", Font.PLAIN, 12));
		registernameLable.setBounds(75, 270, 120, 15);
		registerPanel.add(registernameLable);
		
		registeremailField = new JTextField();
		registeremailField.setFont(new Font("Arial", Font.PLAIN, 12));
		registeremailField.setColumns(10);
		registeremailField.setBounds(75, 350, 250, 30);
		registerPanel.add(registeremailField);
		
		JLabel registeremailLable = new JLabel("email");
		registeremailLable.setFont(new Font("Arial", Font.PLAIN, 12));
		registeremailLable.setBounds(75, 330, 120, 15);
		registerPanel.add(registeremailLable);
		
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("Arial", Font.PLAIN, 18));
		registerButton.setBackground(Color.LIGHT_GRAY);
		registerButton.setBounds(75, 400, 250, 30);
		registerPanel.add(registerButton);
	}
}

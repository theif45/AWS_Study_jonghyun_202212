package usermanagement.frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import usermanagement.dto.RequestDto;
import usermanagement.dto.ResponseDto;
import usermanagement.service.UserService;

public class UserManagementFrame extends JFrame {

	private static Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private BufferedReader reader;
	private PrintWriter writer;
	private Gson gson;
	
	private List<JTextField> loginFields;
	private List<JTextField> registerFields;

	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerUsernameField;
	private JPasswordField registerPasswordField;
	private JTextField registerNameField;
	private JTextField registerEmailField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					socket = new Socket("127.0.0.1",9090);
					
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (ConnectException e) {
					JOptionPane.showMessageDialog(null, "서버에 연결할 수 없습니다", "접속실패", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserManagementFrame() {
		
		try {
			inputStream = socket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(inputStream));
			outputStream = socket.getOutputStream();
			writer = new PrintWriter(outputStream, true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		gson = new Gson();
		
		loginFields = new ArrayList<>();
		registerFields = new ArrayList<>();

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

		loginButton.addMouseListener(new MouseAdapter() {
//			인터페이스는 모두 구현해야함
//			MouseAdapter내에 인터페이스를 모두 구현해놓음
//			사용하고 싶은 메소드만 오버라이드하여 사용가능
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject loginUser = new JsonObject();
				loginUser.addProperty("usernameAndEmail", usernameField.getText());
				loginUser.addProperty("password", passwordField.getText());

				UserService userService = UserService.getInstance();

				Map<String, String> response = userService.authorize(loginUser.toString());

				if (response.containsKey("error")) {
					JOptionPane.showMessageDialog(null, response.get("error"), "error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				JOptionPane.showMessageDialog(null, response.get("ok"), "ok", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});

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
//				loginFields를 공백으로 만듬
				clearFields(loginFields);
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
//				registerFields를 공백으로 만듬
				clearFields(registerFields);
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

		registerPasswordField = new JPasswordField();
		registerPasswordField.setFont(new Font("Arial", Font.PLAIN, 12));
		registerPasswordField.setBounds(75, 230, 250, 30);
		registerPanel.add(registerPasswordField);

		JLabel registerusernameLable = new JLabel("Username");
		registerusernameLable.setFont(new Font("Arial", Font.PLAIN, 12));
		registerusernameLable.setBounds(75, 150, 120, 15);
		registerPanel.add(registerusernameLable);

		JLabel registerpasswordLable = new JLabel("Password");
		registerpasswordLable.setFont(new Font("Arial", Font.PLAIN, 12));
		registerpasswordLable.setBounds(75, 210, 60, 15);
		registerPanel.add(registerpasswordLable);

		registerNameField = new JTextField();
		registerNameField.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		registerNameField.setColumns(10);
		registerNameField.setBounds(75, 290, 250, 30);
		registerPanel.add(registerNameField);

		JLabel registernameLable = new JLabel("name");
		registernameLable.setFont(new Font("Arial", Font.PLAIN, 12));
		registernameLable.setBounds(75, 270, 120, 15);
		registerPanel.add(registernameLable);

		registerEmailField = new JTextField();
		registerEmailField.setFont(new Font("Arial", Font.PLAIN, 12));
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(75, 350, 250, 30);
		registerPanel.add(registerEmailField);

		JLabel registeremailLable = new JLabel("email");
		registeremailLable.setFont(new Font("Arial", Font.PLAIN, 12));
		registeremailLable.setBounds(75, 330, 120, 15);
		registerPanel.add(registeremailLable);
		
		JButton registerButton = new JButton("Register");
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject userJson = new JsonObject();
				userJson.addProperty("username", registerUsernameField.getText());
				userJson.addProperty("password", registerPasswordField.getText());
				userJson.addProperty("name", registerNameField.getText());
				userJson.addProperty("email", registerEmailField.getText());

				RequestDto<String> requestDto = new RequestDto<String>("register", userJson.toString());
				
				writer.println(gson.toJson(requestDto));
				writer.flush();
				
				System.out.println(userJson.toString());

				try {
					String response = reader.readLine();
					System.out.println("응답옴!");
					ResponseDto<?> responseDto = gson.fromJson(response, ResponseDto.class);
					
					if(responseDto.getCode().equals("error")) {
						JOptionPane.showMessageDialog(null, responseDto.getBody(), responseDto.getCode(), JOptionPane.ERROR_MESSAGE);
						return;
					}
					
					JOptionPane.showMessageDialog(null, responseDto.getBody(), responseDto.getCode(), JOptionPane.INFORMATION_MESSAGE);
					mainCard.show(mainPanel, "loginPanel");
					clearFields(registerFields);
					
					System.out.println(responseDto);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		registerButton.setFont(new Font("Arial", Font.PLAIN, 18));
		registerButton.setBackground(Color.LIGHT_GRAY);
		registerButton.setBounds(75, 400, 250, 30);
		registerPanel.add(registerButton);

		loginFields.add(usernameField);
		loginFields.add(passwordField);

		registerFields.add(registerUsernameField);
		registerFields.add(registerPasswordField);
		registerFields.add(registerNameField);
		registerFields.add(registerEmailField);
	}

	private void clearFields(List<JTextField> textFields) {
		for (JTextField field : textFields) {
//			공백이라도 있으면 setText("") 실행
			if (field.getText().isEmpty()) {
				continue;
			}
			field.setText("");
		}

	}
}

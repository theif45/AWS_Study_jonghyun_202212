package simplechatting.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ChattingClient extends JFrame {

	private Socket socket;
	private String username;

	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private JTextArea contentView;
	private JScrollPane userListScroll;
	private JTextField messageInput;
	private JList userList;
	private DefaultListModel<String> userListModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = new ChattingClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChattingClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ipInput = new JTextField();
		ipInput.setText("127.0.0.1");
		ipInput.setBounds(328, 27, 104, 21);
		contentPane.add(ipInput);
		ipInput.setColumns(10);

		JButton connectButton = new JButton("연결");
		connectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ip = null;
				int port = 0;

				ip = ipInput.getText();
				port = Integer.parseInt(portInput.getText());

				try {
					socket = new Socket(ip, port);

					JOptionPane.showMessageDialog(null, socket.getInetAddress() + "서버 접속", "접속성공",
							JOptionPane.INFORMATION_MESSAGE);

					InputStream inputStream = socket.getInputStream();
					BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
					if (in.readLine().equals("join")) {
						username = JOptionPane.showInputDialog(null, "사용자이름을 입력하세요.", JOptionPane.INFORMATION_MESSAGE);

						OutputStream outputStream = socket.getOutputStream();
						PrintWriter out = new PrintWriter(outputStream, true);

						out.println(username);

					}

					Thread thread = new Thread(() -> {
						try {
							InputStream input = socket.getInputStream();
							BufferedReader reader = new BufferedReader(new InputStreamReader(input));

							while (true) {
								String message = reader.readLine();
								if (message.startsWith("@welcome")) {
									int tokenIndex = message.indexOf("/");
									message = message.substring(tokenIndex + 1);
								} else if(message.startsWith("@userList")) {
									int tokenIndex = message.indexOf("/");
									message = message.substring(tokenIndex + 1);
									String[] usernames = message.split(",");
									userListModel.clear();
									for(String username : usernames) {
										userListModel.addElement(username);
									}
									continue;
								}
									
								contentView.append(message + "\n");
								contentView.setCaretPosition(contentView.getDocument().getLength());
							}
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});

					thread.start();

				} catch (ConnectException e1) {
					JOptionPane.showMessageDialog(null, "서버 접속 실패", "접속실패", JOptionPane.ERROR_MESSAGE);

				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		connectButton.setBackground(new Color(128, 255, 128));
		connectButton.setForeground(new Color(0, 0, 0));
		connectButton.setFont(new Font("HY견고딕", Font.PLAIN, 13));
		connectButton.setBounds(486, 26, 67, 23);
		contentPane.add(connectButton);

		portInput = new JTextField();
		portInput.setText("9090");
		portInput.setBounds(437, 27, 44, 21);
		contentPane.add(portInput);
		portInput.setColumns(10);

		JScrollPane contentScroll = new JScrollPane();
		contentScroll.setBounds(12, 25, 304, 272);
		contentPane.add(contentScroll);

		contentView = new JTextArea();
		contentScroll.setViewportView(contentView);

		userListScroll = new JScrollPane();
		userListScroll.setBounds(328, 58, 225, 239);
		contentPane.add(userListScroll);

		userListModel = new DefaultListModel<>();
		userList = new JList(userListModel);
		userListScroll.setViewportView(userList);

		JScrollPane messageScroll = new JScrollPane();
		messageScroll.setBounds(12, 307, 420, 34);
		contentPane.add(messageScroll);

		messageInput = new JTextField();
		messageInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (!messageInput.getText().isBlank()) {
						try {
							OutputStream outputStream = socket.getOutputStream();
							PrintWriter out = new PrintWriter(outputStream, true);

							out.println(username + " : " + messageInput.getText());
							messageInput.setText("");

						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		messageScroll.setViewportView(messageInput);

		JButton sendButton = new JButton("전송");
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!messageInput.getText().isBlank()) {
					try {
						OutputStream outputStream = socket.getOutputStream();
						PrintWriter out = new PrintWriter(outputStream, true);

						out.println(username + " : " + messageInput.getText());
						messageInput.setText("");

					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		sendButton.setBackground(new Color(255, 0, 0));
		sendButton.setFont(new Font("HY견고딕", Font.PLAIN, 13));
		sendButton.setBounds(437, 307, 116, 34);
		contentPane.add(sendButton);
	}
}

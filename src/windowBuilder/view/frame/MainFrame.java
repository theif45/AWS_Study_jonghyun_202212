package windowBuilder.view.frame;

import javax.swing.JFrame;

import windowBuilder.view.panel.MainPanel;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		좌표,너비,높이 설정
		setBounds(100, 100, 600, 500);
		
		MainPanel mainPanel = MainPanel.getInstance();
//		생성된 뒤에 login,register를 한번 호출해줘야됨
		mainPanel.init();
		setContentPane(mainPanel);
	}
}

package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import windowBuilder.view.frame.MainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.FlowLayout;
import java.awt.CardLayout;

public class UserManagementApplication{

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					
					MainFrame frame = new MainFrame();
//					보여주는지 결정하는 메소드
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
//		runnable 객체 실행
		EventQueue.invokeLater(runnable);
	}
}

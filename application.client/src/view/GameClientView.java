package view;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;

public class GameClientView extends JPanel {

	public GameClientView() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 440, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(10, 10, 200, 20);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JButton startBtn = new JButton("Anmelden");
		startBtn.setBounds(260, 10, 150, 20);
		frame.getContentPane().add(startBtn);
		
		JTextArea logArea = new JTextArea();
		logArea.setEditable(false);
		logArea.setBounds(10, 450, 400, 50);
		frame.getContentPane().add(logArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 40, 400, 400);
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
	}
}

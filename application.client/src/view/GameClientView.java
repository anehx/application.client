package view;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import controller.GameClientController;

public class GameClientView extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;

	public GameClientView(GameClientController controller) {
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(10, 10, 200, 20);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JButton startBtn = new JButton("Anmelden");
		startBtn.setBounds(260, 10, 150, 20);
		startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.start(nameField.getText());
			}
		});
		frame.getContentPane().add(startBtn);
		
		
		JTextArea logArea = new JTextArea();
		logArea.setEditable(false);
		logArea.setBounds(10, 450, 400, 50);
		frame.getContentPane().add(logArea);
		
		frame.setVisible(true);
	}

	public void setLabyrinth(LabyrinthView labyrinth) {
		frame.getContentPane().add(labyrinth);
		frame.repaint();
	}
}

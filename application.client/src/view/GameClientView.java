package view;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import model.GameElement;

public class GameClientView extends JPanel {
	
	public LabyrinthView labyrinth;

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
		
		labyrinth = new LabyrinthView();
		frame.getContentPane().add(labyrinth);
		
		frame.setVisible(true);
	}

}

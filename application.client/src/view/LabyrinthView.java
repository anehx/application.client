package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JPanel;
import model.GameElement;

public class LabyrinthView extends JPanel {

	public Vector<GameElement> elements;
	
	public LabyrinthView() {
		super();

		this.elements = new Vector<GameElement>();
		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(10, 40, 400, 400);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (GameElement element : this.elements) {
			element.draw(g);
		}
	}
}

package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import model.GameElement;
import model.Labyrinth;

public class LabyrinthView extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public Labyrinth labyrinth;
	
	public LabyrinthView(Labyrinth labyrinth) {
		super();
		
		this.labyrinth = labyrinth;

		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(10, 40, 13 * 32, 13 * 32);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (GameElement element : this.labyrinth.elements) {
			element.draw(g);
		}
	}
}

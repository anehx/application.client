package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.GameElement;
import model.Labyrinth;

public class LabyrinthView extends JPanel implements Observer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Labyrinth labyrinth;
	
	public LabyrinthView(Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
		
		this.setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void update(Observable labyrinth, Object obj) {
		this.repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (GameElement element : this.labyrinth.elements) {
			element.draw(g);
		}
	}
}
package application.client.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

import application.client.model.Bomb;
import application.client.model.Box;
import application.client.model.Labyrinth;
import application.client.model.Player;

@SuppressWarnings("serial")
public class LabyrinthView extends JPanel implements Observer {
	private Labyrinth labyrinth = Labyrinth.getInstance();
	
	public LabyrinthView() {
		this.setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void update(Observable labyrinth, Object obj) {
		this.repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (this.labyrinth.isStarted()) {
			for (Box box : this.labyrinth.getBoxes()) {
				box.draw(g);
			}
			for (Bomb bomb : this.labyrinth.getBombs()) {
				bomb.draw(g);
			}
			for (Player player : this.labyrinth.getPlayers()) {
				player.draw(g);
			}
		}
	}
}
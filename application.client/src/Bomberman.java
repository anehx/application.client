import java.awt.BorderLayout;

import controller.ActionController;
import controller.KeyController;
import model.Labyrinth;
import model.LabyrinthStub;
import view.LabyrinthView;
import view.View;

public class Bomberman {
	/**
	 * Main function which starts the whole application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		new Bomberman();
	}
	
	/**
	 * Initialize the main controller and view
	 * and set the window visible
	 */
	public Bomberman() {
		Labyrinth labyrinth = LabyrinthStub.getInstance();
		View view = new View();
		LabyrinthView labyrinthView = new LabyrinthView(labyrinth);
		
		labyrinth.addObserver(labyrinthView);
		
		ActionController actionController = new ActionController(view, labyrinth);
		KeyController keyController = new KeyController(view, labyrinth);
		
		view.setVisible(true);
		view.getContentPane().add(labyrinthView, BorderLayout.CENTER);
	}
}
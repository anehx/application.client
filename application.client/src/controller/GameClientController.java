package controller;

import model.Labyrinth;
import model.LabyrinthStub;
import model.Player;
import view.GameClientView;
import view.LabyrinthView;

public class GameClientController {
	public static void main(String args[]) {
		new GameClientController();
	}
	
	private GameClientView view;

	public GameClientController() {
		view = new GameClientView(this);
	}

	public void start(String name) {
		Labyrinth labyrinth = LabyrinthStub.getInstance();
		LabyrinthView labyrinthView = new LabyrinthView(labyrinth);
		
		labyrinth.addElement(new Player(0, 0, name));

		view.setLabyrinth(labyrinthView);
	}
}

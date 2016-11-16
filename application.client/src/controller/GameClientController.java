package controller;

import java.awt.Rectangle;

import model.Box;
import model.LabyrinthStub;
import model.Player;
import view.GameClientView;
import view.LabyrinthView;

public class GameClientController {
	private GameClientView view;

	public GameClientController() {
		view = new GameClientView(this);
	}

	public void start(String name) {
		LabyrinthStub stub = LabyrinthStub.getInstance();
		LabyrinthView labyrinth = new LabyrinthView();
		
		stub.elements.add(new Player(0, 0, 32, 32, name));
		
		labyrinth.elements = stub.elements;
		labyrinth.setBounds(10, 40, stub.width, stub.height);

		view.setLabyrinth(labyrinth);
	}
}

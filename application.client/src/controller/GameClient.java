package controller;

import stub.LabyrinthStub;
import view.GameClientView;

public class GameClient {
	
	public static void main(String[] args) {
		GameClientView panel = new GameClientView();
		LabyrinthStub lab = LabyrinthStub.getInstance();

		panel.labyrinth.elements = lab.elements;
	}
}

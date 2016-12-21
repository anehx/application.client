package application.client.controller;

import protocol.GameStartedMessage;

public class GameStartedController extends MessageController {
	public void gameStarted(GameStartedMessage message) {
		// TODO: load labyrinth
		// this.labyrinth.setBoxes(loadedBoxes);
		this.labyrinth.setStarted(true);
		
		this.log.addMessage("Game started");
	}
}

package application.client.controller;

import protocol.BombExplodedMessage;

public class BombExplodedController extends MessageController {

	public void bombExploded(BombExplodedMessage message) {
		// TODO: load labyrinth
		// this.labyrinth.setBoxes(loadedBoxes);
		
		this.labyrinth.removeBomb(message.getId());
	}

}

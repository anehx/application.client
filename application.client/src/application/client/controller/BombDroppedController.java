package application.client.controller;

import application.client.model.Bomb;
import protocol.BombDroppedMessage;

public class BombDroppedController extends MessageController {
	public void bombDropped(BombDroppedMessage message) {
		this.labyrinth.addElement(new Bomb(message.getPositionX(), message.getPositionY(), message.getId()));
	}

}

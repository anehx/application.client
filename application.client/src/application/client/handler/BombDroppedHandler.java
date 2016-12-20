package application.client.handler;

import application.client.model.Bomb;
import protocol.BombDroppedMessage;

public class BombDroppedHandler extends MessageHandler {
	public void bombDropped(BombDroppedMessage message) {
		this.labyrinth.addElement(new Bomb(message.getPositionX(), message.getPositionY(), message.getId()));
	}

}

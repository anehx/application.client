package application.client.controller;

import protocol.PlayerMovedMessage;

public class PlayerMovedController extends MessageController {
	public void playerMoved(PlayerMovedMessage message) {
		this.labyrinth.movePlayer(message.getPlayer(), message.getDirection());
	}
}

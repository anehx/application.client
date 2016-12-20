package application.client.handler;

import protocol.PlayerMovedMessage;

public class PlayerMovedHandler extends MessageHandler {
	public void playerMoved(PlayerMovedMessage message) {
		this.labyrinth.movePlayer(message.getPlayer(), message.getDirection());
	}
}

package application.client.handler;

import protocol.PlayerHitMessage;

public class PlayerHitHandler extends MessageHandler {
	public void playerHit(PlayerHitMessage message) {
		this.labyrinth.removePlayer(message.getPlayer());
		
		this.log.addMessage("Player " + message.getPlayer() + " was hit");
	}
}

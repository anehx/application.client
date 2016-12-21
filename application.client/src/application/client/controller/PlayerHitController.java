package application.client.controller;

import protocol.PlayerHitMessage;

public class PlayerHitController extends MessageController {
	public void playerHit(PlayerHitMessage message) {
		this.labyrinth.removePlayer(message.getPlayer());
		
		this.log.addMessage("Player " + message.getPlayer() + " was hit");
	}
}

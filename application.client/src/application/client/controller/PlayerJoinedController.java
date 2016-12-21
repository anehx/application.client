package application.client.controller;

import application.client.model.Player;
import protocol.PlayerJoinedMessage;

public class PlayerJoinedController extends MessageController {
	public void playerJoined(PlayerJoinedMessage message) {
		Player player = new Player(message.getInitialX(), message.getInitialY(), message.getPlayer());
		
		if (player.name == this.labyrinth.playerName) {
			this.labyrinth.player = player;
		}
		
		this.labyrinth.addPlayer(player);
		
		this.log.addMessage("Player " + message.getPlayer() + " joined the Game");
	}
}
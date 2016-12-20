package application.client.handler;

import application.client.model.Player;
import protocol.PlayerJoinedMessage;

public class PlayerJoinedHandler extends MessageHandler {
	public void playerJoined(PlayerJoinedMessage message) {
		Player player = new Player(message.getInitialX(), message.getInitialY(), message.getPlayer());
		
		if (player.name == this.labyrinth.playerName) {
			this.labyrinth.player = player;
		}
		
		this.labyrinth.addElement(player);
		
		this.log.addMessage("Player " + message.getPlayer() + " joined the Game");
	}
}
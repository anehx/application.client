package application.client.handler;

import protocol.GameStartedMessage;

public class GameStartedHandler extends MessageHandler {
	public void gameStarted(GameStartedMessage message) {
		this.labyrinth.setStarted(true);
		
		this.log.addMessage("Game started");
	}
}

package application.client;


import application.client.handler.BombDroppedHandler;
import application.client.handler.BombExplodedHandler;
import application.client.handler.ErrorHandler;
import application.client.handler.GameStartedHandler;
import application.client.handler.PlayerHitHandler;
import application.client.handler.PlayerJoinedHandler;
import application.client.handler.PlayerMovedHandler;
import protocol.Message;
import protocol.PlayerHitMessage;
import protocol.BombDroppedMessage;
import protocol.BombExplodedMessage;
import protocol.ErrorMessage;
import protocol.GameStartedMessage;
import protocol.PlayerJoinedMessage;
import protocol.PlayerMovedMessage;

public class Dispatcher {
	public void dispatchMessage(Message message) {
		if (message instanceof BombDroppedMessage) {
			BombDroppedHandler handler = new BombDroppedHandler();
			handler.bombDropped((BombDroppedMessage)message);
		}
		else if (message instanceof BombExplodedMessage) {
			BombExplodedHandler handler = new BombExplodedHandler();
			handler.bombExploded((BombExplodedMessage)message);
		}
		else if (message instanceof ErrorMessage) {
			ErrorHandler handler = new ErrorHandler();
			handler.error((ErrorMessage)message);
		}
		else if (message instanceof GameStartedMessage) {
			GameStartedHandler handler = new GameStartedHandler();
			handler.gameStarted((GameStartedMessage)message);
		}
		else if (message instanceof PlayerHitMessage) {
			PlayerHitHandler handler = new PlayerHitHandler();
			handler.playerHit((PlayerHitMessage)message);
		}
		else if (message instanceof PlayerJoinedMessage) {
			PlayerJoinedHandler handler = new PlayerJoinedHandler();
			handler.playerJoined((PlayerJoinedMessage)message);
		}
		else if (message instanceof PlayerMovedMessage) {
			PlayerMovedHandler handler = new PlayerMovedHandler();
			handler.playerMoved((PlayerMovedMessage)message);
		}
	}

}

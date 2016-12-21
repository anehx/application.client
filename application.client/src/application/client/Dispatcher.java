package application.client;


import protocol.Message;
import protocol.PlayerHitMessage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import application.client.controller.BombDroppedController;
import application.client.controller.BombExplodedController;
import application.client.controller.ErrorController;
import application.client.controller.GameStartedController;
import application.client.controller.MessageController;
import application.client.controller.PlayerHitController;
import application.client.controller.PlayerJoinedController;
import application.client.controller.PlayerMovedController;
import protocol.BombDroppedMessage;
import protocol.BombExplodedMessage;
import protocol.ErrorMessage;
import protocol.GameStartedMessage;
import protocol.PlayerJoinedMessage;
import protocol.PlayerMovedMessage;

public class Dispatcher {
	public void dispatchMessage(Message message) {
		if (message instanceof BombDroppedMessage) {
			BombDroppedController handler = new BombDroppedController();
			handler.bombDropped((BombDroppedMessage)message);
		}
		else if (message instanceof BombExplodedMessage) {
			BombExplodedController handler = new BombExplodedController();
			handler.bombExploded((BombExplodedMessage)message);
		}
		else if (message instanceof ErrorMessage) {
			ErrorController handler = new ErrorController();
			handler.error((ErrorMessage)message);
		}
		else if (message instanceof GameStartedMessage) {
			GameStartedController handler = new GameStartedController();
			handler.gameStarted((GameStartedMessage)message);
		}
		else if (message instanceof PlayerHitMessage) {
			PlayerHitController handler = new PlayerHitController();
			handler.playerHit((PlayerHitMessage)message);
		}
		else if (message instanceof PlayerJoinedMessage) {
			PlayerJoinedController handler = new PlayerJoinedController();
			handler.playerJoined((PlayerJoinedMessage)message);
		}
		else if (message instanceof PlayerMovedMessage) {
			PlayerMovedController handler = new PlayerMovedController();
			handler.playerMoved((PlayerMovedMessage)message);
		}
	}

}

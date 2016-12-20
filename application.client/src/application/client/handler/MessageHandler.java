package application.client.handler;

import application.client.model.Labyrinth;
import application.client.model.Log;

public abstract class MessageHandler {
	protected Labyrinth labyrinth = Labyrinth.getInstance();
	protected Log log = Log.getInstance();
}

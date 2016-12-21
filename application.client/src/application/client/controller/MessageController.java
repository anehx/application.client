package application.client.controller;

import application.client.model.Labyrinth;
import application.client.model.Log;

public abstract class MessageController {
	protected Labyrinth labyrinth = Labyrinth.getInstance();
	protected Log log = Log.getInstance();
}

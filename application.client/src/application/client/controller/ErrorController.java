package application.client.controller;

import protocol.ErrorMessage;

public class ErrorController extends MessageController {
	public void error(ErrorMessage message) {
		this.log.addMessage(message.getError());
	}
}

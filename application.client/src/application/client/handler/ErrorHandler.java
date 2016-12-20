package application.client.handler;

import protocol.ErrorMessage;

public class ErrorHandler extends MessageHandler {
	public void error(ErrorMessage message) {
		this.log.addMessage(message.getError());
	}
}

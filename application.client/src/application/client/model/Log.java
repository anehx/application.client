package application.client.model;

import java.util.Observable;
import java.util.Vector;

public class Log extends Observable {
	private static Log instance;
	
	private Vector<String> messages = new Vector<String>();
	
	public static synchronized Log getInstance() {
		if (Log.instance == null) {
			Log.instance = new Log();
		}
		
		return Log.instance;
	}
	
	public void addMessage(String message) {
		this.messages.add(message);
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public Vector<String> getMessages() {
		return this.messages;
	}
}
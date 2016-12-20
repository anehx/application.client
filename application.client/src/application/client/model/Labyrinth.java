package application.client.model;

import java.util.Observable;
import java.util.Vector;

import application.client.model.GameElement;

public class Labyrinth extends Observable {
	protected static Labyrinth instance;
	
	public static final int FIELD_IN_PX = 32;
	
	private Vector<GameElement> elements = new Vector<GameElement>();
	private boolean started = false;
	public String playerName;
	public Player player;
	
	protected Labyrinth() {
	}
	
	public static synchronized Labyrinth getInstance() {
		if (Labyrinth.instance == null) {
			Labyrinth.instance = new Labyrinth();
		}
		
		return Labyrinth.instance;
	}
	
	public void addElement(GameElement element) {
		this.elements.add(element);
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public Player findPlayer(String name) {
		for (GameElement element : this.elements) {
			if (element instanceof Player && ((Player)element).name.equals(name)) {
				return (Player)element;
			}
		}
		
		return null;
	}

	public void movePlayer(String playerName, String direction) {
		this.findPlayer(playerName).move(direction);
		
		this.setChanged();
		this.notifyObservers();
	}

	public void removePlayer(String playerName) {
		this.elements.remove(this.findPlayer(playerName));
		
		this.setChanged();
		this.notifyObservers();
	}

	public boolean isStarted() {
		return this.started;
	}

	public void setStarted(boolean started) {
		this.started = started;
		
		this.setChanged();
		this.notifyObservers();
	}

	public Vector<GameElement> getElements() {
		return this.elements;
	}
}
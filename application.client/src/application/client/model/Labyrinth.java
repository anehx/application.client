package application.client.model;

import java.util.Observable;
import java.util.Vector;

public class Labyrinth extends Observable {
	protected static Labyrinth instance;

	public static final int FIELD_IN_PX = 32;
	
	private Vector<Player> players = new Vector<Player>();
	private Vector<Box> boxes = new Vector<Box>();
	private Vector<Bomb> bombs = new Vector<Bomb>();
	
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
	
	public boolean isStarted() {
		return this.started;
	}

	public void setStarted(boolean started) {
		this.started = started;
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public void addBox(Box box) {
		this.boxes.add(box);
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public void addBomb(Bomb bomb) {
		this.bombs.add(bomb);
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public void setBoxes(Vector<Box> boxes) {
		this.boxes = boxes;
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public Player findPlayer(String name) {
		for (Player player : this.players) {
			if (player.name.equals(name)) {
				return player;
			}
		}
		
		return null;
	}
	
	public Bomb findBomb(String id) {
		for (Bomb bomb : this.bombs) {
			if (bomb.id.equals(id)) {
				return bomb;
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
		this.players.remove(this.findPlayer(playerName));
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public void removeBomb(String id) {
		this.bombs.remove(this.findBomb(id));
		
		this.setChanged();
		this.notifyObservers();
	}

	public Vector<Player> getPlayers() {
		return this.players;
	}
	
	public Vector<Box> getBoxes() {
		return this.boxes;
	}
	
	public Vector<Bomb> getBombs() {
		return this.bombs;
	}
}
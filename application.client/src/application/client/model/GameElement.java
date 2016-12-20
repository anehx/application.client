package application.client.model;

import java.awt.Graphics;

public abstract class GameElement implements Comparable<GameElement> {
	public int x;
	public int y;
	
	public final int width = Labyrinth.FIELD_IN_PX;
	public final int height = Labyrinth.FIELD_IN_PX;
	
	public GameElement(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void draw(Graphics g);
	public abstract int compareTo(GameElement element);
	
	public int getXInPx() {
		return this.x * Labyrinth.FIELD_IN_PX;
	}

	public int getYInPx() {
		return this.y * Labyrinth.FIELD_IN_PX;
	}
}

package model;

import java.awt.Graphics;

public abstract class GameElement {
	public int x;
	public int y;
	public int width;
	public int height;
	
	public GameElement(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public abstract void draw(Graphics g);
}

package model;

import java.awt.Graphics;

public class Bomb extends GameElement {
	public int id;
	public boolean isExploded = false;
	public int countdown = 5;

	public Bomb(int x, int y, int width, int height, int id) {
		super(x, y, width, height);
		
		this.id = id;
	}
	
	public void draw(Graphics g) {};
}

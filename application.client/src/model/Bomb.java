package model;

import java.awt.Graphics;

public class Bomb extends GameElement {
	public int id;
	public boolean isExploded = false;
	public int countdown = 5;

	public Bomb(int x, int y, int id) {
		super(x, y);
		
		this.id = id;
	}
	
	public void draw(Graphics g) {};
}

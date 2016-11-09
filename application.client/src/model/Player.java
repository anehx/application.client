package model;

import java.awt.Graphics;

public class Player extends GameElement {
	public String name;
	public boolean dead = false;
	
	public Player(int x, int y, int width, int height, String name) {
		super(x, y, width, height);

		this.name = name;
	}
	
	public void draw(Graphics g) {};
}

package model;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameElement {
	public String name;
	public boolean dead = false;
	
	public Player(int x, int y, String name) {
		super(x, y);

		this.name = name;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.drawString(this.name, this.getXInPx(), this.getYInPx() + (this.height / 2));
		g.drawRect(this.getXInPx(), this.getYInPx(), this.width, this.height);
	};
}

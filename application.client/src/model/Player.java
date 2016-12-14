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
		g.setColor(Color.CYAN);
		g.fillOval(
			this.getXInPx() + this.width / 4,
			this.getYInPx() + this.width / 4,
			this.width / 2,
			this.height / 2
		);
	};
}

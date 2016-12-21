package application.client.model;

import java.awt.Color;
import java.awt.Graphics;

public class Bomb extends GameElement {
	public String id;

	public Bomb(int x, int y, String id) {
		super(x, y);
		
		this.id = id;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(this.getXInPx() - 11 + 16, this.getYInPx() - 11 + 16, 22, 22);
	}
}

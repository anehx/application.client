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
		g.fillOval(this.getXInPx() - 11 + 16, this.getYInPx() - 11 + 16, 22, 22);
		g.setColor(Color.BLACK);
		g.fillOval(this.getXInPx() - 10 + 16, this.getYInPx() - 10 + 16, 20, 20);
	}

	@Override
	public int compareTo(GameElement element) {
		return 1;
	};
}

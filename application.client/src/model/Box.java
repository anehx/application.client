package model;

import java.awt.Color;
import java.awt.Graphics;

public class Box extends GameElement {
	private static Color COLOR_DESTROYABLE = Color.darkGray;
	private static Color COLOR_INDESTROYABLE = Color.black;
	
	public boolean destroyable;
	
	public Box(int x, int y, boolean destroyable) {
		super(x, y);
		
		this.destroyable = destroyable;
	}

	public void draw(Graphics g) {
		if (this.destroyable) {
			g.setColor(Box.COLOR_DESTROYABLE);
		}
		else {
			g.setColor(Box.COLOR_INDESTROYABLE);
		}
		
		g.fillRect(this.getXInPx(), this.getYInPx(), this.width, this.height);
		
	};
}

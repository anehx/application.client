package application.client.model;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameElement {
	private static int[] LEFT = new int[] {-1,0};
	private static int[] RIGHT = new int[] {1,0};
	private static int[] UP = new int[] {0,-1};
	private static int[] DOWN = new int[] {0,1};
	
	public String name;
	public boolean dead = false;
	
	public Player(int x, int y, String name) {
		super(x, y);

		this.name = name;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(
			this.getXInPx() + this.width / 4,
			this.getYInPx() + this.width / 4,
			this.width / 2,
			this.height / 2
		);
	}
	
	public void move(String direction) {
		int[] dir = new int[] {0,0};
		
		switch (direction) {
		case "left":
			dir = Player.LEFT;
			break;
		case "right":
			dir = Player.RIGHT;
			break;
		case "up":
			dir = Player.UP;
			break;
		case "down":
			dir = Player.DOWN;
			break;
		}
		
		this.x += dir[0];
		this.y += dir[1];
	}

	@Override
	public int compareTo(GameElement element) {
		return 0;
	}
}

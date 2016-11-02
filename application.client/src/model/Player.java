package model;

public class Player extends GameElement {
	public String name;
	public boolean isDead = false;
	
	public Player(String name, double initialX, double initialY) {
		this.name = name;
		this.positionX = initialX;
		this.positionY = initialY;
	}
	
	public void draw() {};
}

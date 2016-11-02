package model;

public class Bomb extends GameElement {
	public int id;
	public boolean isExploded = false;
	public int countdown = 5;

	public Bomb(int id) {
		this.id = id;
	}
	
	public void draw() {};
}

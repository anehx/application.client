package model;

public class Box extends GameElement {
	public boolean destroyable;
	
	public Box(int x, int y, int width, int height, boolean destroyable) {
		super(x, y, width, height);
		
		this.destroyable = destroyable;
	}

	public void draw() {};
}

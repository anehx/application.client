package model;

public class Box extends GameElement {
	public boolean isDestroyable;
	
	public Box(boolean isDestroyable) {
		this.isDestroyable = isDestroyable;
	}

	public void draw() {};
}

package model;

import model.GameElement;
import java.util.Vector;

public class Labyrinth {
	private int width;
	private int height;
	private Vector<GameElement> elements;
	
	public Labyrinth(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
		this.elements = new Vector<GameElement>();
	}
	
	public void addElement(GameElement element) {
		this.elements.add(element);
	}
	
	public void draw() {
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

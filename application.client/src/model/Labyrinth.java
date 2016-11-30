package model;

import model.GameElement;
import java.util.Vector;

public class Labyrinth {
	public static final int FIELD_IN_PX = 32;
	
	public int width;
	public int height;
	public Vector<GameElement> elements;
	
	public Labyrinth(int width, int height) {
		this.width = width;
		this.height = height;
		this.elements = new Vector<GameElement>();
	}
	
	public void addElement(GameElement element) {
		this.elements.add(element);
	}
}
package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Labyrinth;
import view.View;

public class KeyController implements KeyListener {
	/**
	 * The labyrinth containing all game elements
	 */
	private Labyrinth labyrinth;
	
	/**
	 * The main view
	 */
	private View view;
	
	public KeyController(View view, Labyrinth labyrinth) {
		this.view = view;
		this.labyrinth = labyrinth;
		
		this.view.addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 32:
			System.out.println("drop bomb");
			break;
		case 37:
			System.out.println("move left");
			break;
		case 38:
			System.out.println("move up");
			break;
		case 39:
			System.out.println("move right");
			break;
		case 40:
			System.out.println("move down");
			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
}
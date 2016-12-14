package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Box;
import model.Labyrinth;
import view.View;

public class ActionController implements ActionListener {
	/**
	 * The labyrinth containing all game elements
	 */
	private Labyrinth labyrinth;
	
	/**
	 * The main view
	 */
	private View view;
	
	/**
	 * Initialize the action controller
	 * 
	 * @param view
	 * @param labyrinth
	 */
	public ActionController(View view, Labyrinth labyrinth) {
		this.view = view;
		this.labyrinth = labyrinth;
		
		this.view.btnStart.addActionListener(this);
	}
	
	/**
	 * Action to start the game
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = this.view.txtName.getText();
		
		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(this.view, "Bitte geben Sie einen Namen an!");
			
			return;
		}
		
		this.view.txtName.setEnabled(false);
		this.view.btnStart.setEnabled(false);
		
		this.view.setFocusable(true);
		this.view.requestFocus();
		
		this.labyrinth.addElement(new Box(0, 0, false));
	}
}

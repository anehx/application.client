package application.client.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import application.client.BombermanClient;
import application.client.model.Labyrinth;
import application.client.view.LoginView;
import application.client.view.View;
import protocol.GameStartedMessage;
import protocol.PlayerJoinedMessage;

public class ActionController implements ActionListener {
	private BombermanClient client;
	private LoginView view;
	private View window;
	
	public ActionController(BombermanClient client, View window, LoginView view) {
		this.client = client;
		this.view = view;
		this.window = window;
		
		this.view.btnStart.addActionListener(this);
	}
	
	/**
	 * Action to start the game
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = this.view.txtName.getText();
		
		this.client.serverProxy.send(new PlayerJoinedMessage(name, 0, 0));

		// TODO: Remove! (only for testing)
		this.client.serverProxy.send(new GameStartedMessage(""));
		
		Labyrinth.getInstance().playerName = name;
		
		this.view.txtName.setEnabled(false);
		this.view.btnStart.setEnabled(false);
			
		this.window.setFocusable(true);
		this.window.requestFocus();
	}
}

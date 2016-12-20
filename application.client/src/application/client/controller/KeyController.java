package application.client.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import application.client.BombermanClient;
import application.client.model.Labyrinth;
import application.client.model.Player;
import application.client.view.View;
import protocol.BombDroppedMessage;
import protocol.PlayerMovedMessage;

public class KeyController implements KeyListener {
	private BombermanClient client;
	private View view;
	
	public KeyController(BombermanClient client, View view) {
		this.client = client;
		this.view = view;
		
		this.view.addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		Player player = Labyrinth.getInstance().player;

		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			this.client.serverProxy.send(new BombDroppedMessage(player.name, player.x, player.y));
			break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_A:
			this.client.serverProxy.send(new PlayerMovedMessage(player.name, "left"));
			break;
		case KeyEvent.VK_UP:
		case KeyEvent.VK_W:
			this.client.serverProxy.send(new PlayerMovedMessage(player.name, "up"));
			break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			this.client.serverProxy.send(new PlayerMovedMessage(player.name, "right"));
			break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			this.client.serverProxy.send(new PlayerMovedMessage(player.name, "down"));
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
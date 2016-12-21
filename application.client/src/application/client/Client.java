package application.client;

import java.awt.BorderLayout;
import java.io.IOException;

import application.client.controller.ActionController;
import application.client.controller.KeyController;
import application.client.model.Labyrinth;
import application.client.model.Log;
import application.client.view.LabyrinthView;
import application.client.view.LogView;
import application.client.view.LoginView;
import application.client.view.View;
import protocol.Message;
import network.ClientApplicationInterface;
import network.ServerProxy;
// import network.client.ServerProxyStub;

public class Client implements ClientApplicationInterface {
	public ServerProxy serverProxy;
	public Dispatcher dispatcher;
	public String playerName;
	
	/**
	 * Main function which starts the whole application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		new Client();
	}
	
	/**
	 * Initialize the main controller and view
	 * and set the window visible
	 */
	private Client() {
		Labyrinth labyrinth = Labyrinth.getInstance();
		Log log = Log.getInstance();
		
		View view = new View();
		LoginView loginView = new LoginView();
		LabyrinthView labyrinthView = new LabyrinthView();
		LogView logView = new LogView();
		
		new ActionController(this, view, loginView);
		new KeyController(this, view);
		
		this.dispatcher = new Dispatcher();
		
		try {
			this.serverProxy = new ServerProxy(this, "localhost");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		labyrinth.addObserver(labyrinthView);
		log.addObserver(logView);

		view.getContentPane().add(loginView, BorderLayout.NORTH);
		view.getContentPane().add(labyrinthView, BorderLayout.CENTER);
		view.getContentPane().add(logView, BorderLayout.SOUTH);
		
		view.setVisible(true);
	}

	@Override
	public void handleMessage(ServerProxy serverProxy, Message message) {
		this.dispatcher.dispatchMessage(message);
	}
}
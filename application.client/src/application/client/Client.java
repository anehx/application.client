package application.client;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.UnknownHostException;

import application.client.controller.ActionController;
import application.client.controller.KeyController;
import application.client.model.Box;
import application.client.model.Labyrinth;
import application.client.model.Log;
import application.client.view.LabyrinthView;
import application.client.view.LogView;
import application.client.view.LoginView;
import application.client.view.View;
import protocol.Message;
import network.client.ClientApplicationInterface;
import network.client.ServerProxy;
import network.client.ServerProxyStub;

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
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	private Client() {
		Labyrinth labyrinth = Labyrinth.getInstance();
		Log log = Log.getInstance();
		
		this.generateInitialData();
		
		View view = new View();
		LoginView loginView = new LoginView();
		LabyrinthView labyrinthView = new LabyrinthView();
		LogView logView = new LogView();
		
		new ActionController(this, view, loginView);
		new KeyController(this, view);
		
		this.dispatcher = new Dispatcher();
		this.serverProxy = new ServerProxyStub(this);
		
		labyrinth.addObserver(labyrinthView);
		log.addObserver(logView);

		view.getContentPane().add(loginView, BorderLayout.NORTH);
		view.getContentPane().add(labyrinthView, BorderLayout.CENTER);
		view.getContentPane().add(logView, BorderLayout.SOUTH);
		
		view.setVisible(true);
	}
	
	private void generateInitialData() {
		Labyrinth labyrinth = Labyrinth.getInstance();
		
		labyrinth.addElement(new Box( 1,  1, false));
		labyrinth.addElement(new Box( 3,  1, false));
		labyrinth.addElement(new Box( 5,  1, false));
		labyrinth.addElement(new Box( 7,  1, false));
		labyrinth.addElement(new Box( 9,  1, false));
		labyrinth.addElement(new Box(11,  1, false));
		labyrinth.addElement(new Box( 1,  3, false));
		labyrinth.addElement(new Box( 3,  3, false));
		labyrinth.addElement(new Box( 5,  3, false));
		labyrinth.addElement(new Box( 7,  3, false));
		labyrinth.addElement(new Box( 9,  3, false));
		labyrinth.addElement(new Box(11,  3, false));
		labyrinth.addElement(new Box( 1,  5, false));
		labyrinth.addElement(new Box( 3,  5, false));
		labyrinth.addElement(new Box( 5,  5, false));
		labyrinth.addElement(new Box( 7,  5, false));
		labyrinth.addElement(new Box( 9,  5, false));
		labyrinth.addElement(new Box(11,  5, false));
		labyrinth.addElement(new Box( 1,  7, false));
		labyrinth.addElement(new Box( 3,  7, false));
		labyrinth.addElement(new Box( 5,  7, false));
		labyrinth.addElement(new Box( 7,  7, false));
		labyrinth.addElement(new Box( 9,  7, false));
		labyrinth.addElement(new Box(11,  7, false));
		labyrinth.addElement(new Box( 1,  9, false));
		labyrinth.addElement(new Box( 3,  9, false));
		labyrinth.addElement(new Box( 5,  9, false));
		labyrinth.addElement(new Box( 7,  9, false));
		labyrinth.addElement(new Box( 9,  9, false));
		labyrinth.addElement(new Box(11,  9, false));
		labyrinth.addElement(new Box( 1, 11, false));
		labyrinth.addElement(new Box( 3, 11, false));
		labyrinth.addElement(new Box( 5, 11, false));
		labyrinth.addElement(new Box( 7, 11, false));
		labyrinth.addElement(new Box( 9, 11, false));
		labyrinth.addElement(new Box(11, 11, false));
	}

	@Override
	public void handleMessage(Message message) {
		this.dispatcher.dispatchMessage(message);
	}
}
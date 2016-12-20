package application.client.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import application.client.model.Log;

@SuppressWarnings("serial")
public class LogView extends JPanel implements Observer {
	private JTextArea txtLog;
	
	private Log log = Log.getInstance();
	
	public LogView() {
		this.setLayout(new BorderLayout(0, 0));
		
		this.txtLog = new JTextArea();
		this.txtLog.setRows(10);
		this.txtLog.setEnabled(false);
		this.txtLog.setDisabledTextColor(Color.BLACK);
		
		this.add(txtLog);
	}

	@Override
	public void update(Observable labyrinth, Object obj) {
		String text = String.join("\n", this.log.getMessages());
		
		this.txtLog.setText(text);
	}
}
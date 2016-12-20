package application.client.view;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginView extends JPanel implements Observer {
	public JTextField txtName;
	public JButton btnStart;
	
	public LoginView() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.txtName = new JTextField();
		this.btnStart = new JButton("Starten");
		
		this.txtName.setColumns(10);
		
		this.add(txtName);
		this.add(btnStart);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// disable
	}
}
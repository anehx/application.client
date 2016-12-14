package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class View extends JFrame {
	/**
	 * The mandatory serial version UID for the frame
	 */
	private static final long serialVersionUID = 1L;
	
	public JPanel pnlControl;
	public JTextField txtName;
	public JTextArea txtLog;
	public JButton btnStart;
	
	/**
	 * Generate needed UI elements and assign controllers
	 * 
	 * @param controller
	 */
	public View() {
		this.setBounds(100, 100, 700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new BorderLayout(0, 0));
		
		pnlControl = new JPanel();
		this.getContentPane().add(pnlControl, BorderLayout.NORTH);
		pnlControl.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtName = new JTextField();
		pnlControl.add(txtName);
		txtName.setColumns(10);
		
		btnStart = new JButton("Starten");
		pnlControl.add(btnStart);
		
		txtLog = new JTextArea();
		txtLog.setRows(6);
		txtLog.setEnabled(false);
		this.getContentPane().add(txtLog, BorderLayout.SOUTH);
	}
}

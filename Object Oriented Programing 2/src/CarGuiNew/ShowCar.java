package CarGuiNew;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowCar {

	public JFrame ShowCarFarame;
	public JTextArea carDisplayTextArea = new JTextArea();
	public JButton ExitButton = new JButton("Exit");

	/**
	 * Launch the application.
	 */
	
		


	/**
	 * Create the application.
	 */
	public ShowCar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ShowCarFarame = new JFrame();
		ShowCarFarame.setBounds(100, 100, 450, 300);
		ShowCarFarame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShowCarFarame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		carDisplayTextArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		ShowCarFarame.getContentPane().add(carDisplayTextArea);
		
		
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ExitButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ShowCarFarame.getContentPane().add(ExitButton, BorderLayout.NORTH);
	}

}

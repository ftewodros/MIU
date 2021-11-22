package HelloWorldPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FevenT {

	private JFrame feven;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					FevenT window = new FevenT();
					window.feven.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FevenT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		feven = new JFrame();
		feven.setTitle("feven window");
		feven.setBounds(100, 100, 450, 300);
		feven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		feven.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(217, 0, 117, 29);
		feven.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(0, 0, 117, 29);
		feven.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("145");
		btnNewButton_5.setBounds(113, 0, 117, 29);
		feven.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1 = new JButton("345");
		btnNewButton_1.setBounds(327, 0, 117, 29);
		feven.getContentPane().add(btnNewButton_1);
	}
}

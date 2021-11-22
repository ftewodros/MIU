package CarGuiNew;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JButton;

public class addCar {

	public JFrame addCarFrame;
	public  JTextField makeField;
	public  JTextField modelField;
	public  JTextField textField;
	public JButton btnNewButton ;
	public JButton btnNewButton_1;
	public JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public addCar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addCarFrame = new JFrame();
		addCarFrame.setBounds(100, 100, 450, 300);
		addCarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addCarFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel make = new JLabel("make");
		addCarFrame.getContentPane().add(make);
		
		modelField = new JTextField();
		addCarFrame.getContentPane().add(modelField);
		modelField.setColumns(5);
		
		JLabel lblNewLabel = new JLabel("model");
		addCarFrame.getContentPane().add(lblNewLabel);
		
		makeField = new JTextField();
		addCarFrame.getContentPane().add(makeField);
		makeField.setColumns(5);
		
		JLabel lblNewLabel_1 = new JLabel("year");
		addCarFrame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		addCarFrame.getContentPane().add(textField);
		textField.setColumns(5);
		
		btnNewButton = new JButton("Exit");
		addCarFrame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Add Car");
		addCarFrame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2= new JButton("Show Car");
		addCarFrame.getContentPane().add(btnNewButton_2);
	}

}

package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CarDisplayWindow {

	public JFrame carDisplay_Frame;
	
	public JButton return_Button = new JButton("Return");
	public JTextArea carDisplayTextArea;
	public JButton displayExit_Button;


		
	public CarDisplayWindow() {
		initialize();
	}


	public void initialize() {
		carDisplay_Frame = new JFrame();
		carDisplay_Frame.setTitle("Car Display");
		carDisplay_Frame.setBounds(100, 100, 450, 300);
		carDisplay_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carDisplay_Frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Cars:");
		carDisplay_Frame.getContentPane().add(lblNewLabel);
		
		carDisplayTextArea = new JTextArea();
		carDisplayTextArea.setEditable(false);
		carDisplay_Frame.getContentPane().add(carDisplayTextArea);
		
		carDisplay_Frame.getContentPane().add(return_Button);
		
		displayExit_Button = new JButton("Exit");
		carDisplay_Frame.getContentPane().add(displayExit_Button);
	}

}

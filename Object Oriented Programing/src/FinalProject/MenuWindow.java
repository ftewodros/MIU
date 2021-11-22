package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuWindow {

	public JFrame menuFrame;
	
	
	
	
	public JButton carEntry_Button;
	public JButton carDisplay_Button;
	public JButton menuExit_Button;


	
	
	public MenuWindow() {
		initialize();
	}

	
	
	
	private void initialize() {
		menuFrame = new JFrame();
		menuFrame.setTitle("Menu");
		menuFrame.setResizable(false);
		menuFrame.setBounds(100, 100, 450, 300);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		carEntry_Button = new JButton("Car Entry");
		menuFrame.getContentPane().add(carEntry_Button);
		
		carDisplay_Button = new JButton("Car Display");
		menuFrame.getContentPane().add(carDisplay_Button);
		
		menuExit_Button = new JButton("Exit");
		menuFrame.getContentPane().add(menuExit_Button);
		
		
		

}
}
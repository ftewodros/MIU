package LibrarySetup;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FacuiltyMembers {

	private JFrame FacuilityFrame;
	private JTextField publicationText;
	private JTextField weeksText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacuiltyMembers window = new FacuiltyMembers();
					window.FacuilityFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FacuiltyMembers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FacuilityFrame = new JFrame();
		FacuilityFrame.setBounds(100, 100, 450, 300);
		FacuilityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FacuilityFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel(" publications");
		FacuilityFrame.getContentPane().add(lblNewLabel);
		
		publicationText = new JTextField();
		FacuilityFrame.getContentPane().add(publicationText);
		publicationText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("weeks");
		FacuilityFrame.getContentPane().add(lblNewLabel_1);
		
		weeksText = new JTextField();
		FacuilityFrame.getContentPane().add(weeksText);
		weeksText.setColumns(10);
	}

}

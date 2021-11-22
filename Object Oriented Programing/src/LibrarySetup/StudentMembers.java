package LibrarySetup;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentMembers {

	private JFrame StudentFrame;
	private JTextField publicationsText;
	private JTextField weeksText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMembers window = new StudentMembers();
					window.StudentFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentMembers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		StudentFrame = new JFrame();
		StudentFrame.setBounds(100, 100, 450, 300);
		StudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StudentFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel(" publications");
		StudentFrame.getContentPane().add(lblNewLabel);
		
		publicationsText = new JTextField();
		StudentFrame.getContentPane().add(publicationsText);
		publicationsText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("weeks");
		StudentFrame.getContentPane().add(lblNewLabel_1);
		
		weeksText = new JTextField();
		StudentFrame.getContentPane().add(weeksText);
		weeksText.setColumns(10);
	}

}

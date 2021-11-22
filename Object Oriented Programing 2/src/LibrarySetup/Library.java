package LibrarySetup;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Library {

	private JFrame frame;
	private JTextField BooksText;
	private final JLabel lblNewLabel_1 = new JLabel(" Magazines");
	private JTextField MagazinesText;
	private JTextField CDSText;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library window = new Library();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Library() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Books");
		frame.getContentPane().add(lblNewLabel);
		
		BooksText = new JTextField();
		frame.getContentPane().add(BooksText);
		BooksText.setColumns(7);
		frame.getContentPane().add(lblNewLabel_1);
		
		MagazinesText = new JTextField();
		frame.getContentPane().add(MagazinesText);
		MagazinesText.setColumns(7);
		
		JLabel lblNewLabel_2 = new JLabel("CDs");
		frame.getContentPane().add(lblNewLabel_2);
		
		CDSText = new JTextField();
		frame.getContentPane().add(CDSText);
		CDSText.setColumns(7);
		
		btnNewButton = new JButton("Copies");
		frame.getContentPane().add(btnNewButton);
	}

}

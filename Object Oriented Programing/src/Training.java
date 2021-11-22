import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Training {

	public JFrame Genesis;
	public JTextField chapter1;
	public JTextField chapter2;
	public JTextField chapter3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Training window = new Training();
					window.Genesis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Training() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Genesis = new JFrame();
		Genesis.setBounds(100, 100, 404, 300);
		Genesis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Genesis.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		chapter1 = new JTextField();
		Genesis.getContentPane().add(chapter1);
		chapter1.setColumns(7);
		
		chapter2 = new JTextField();
		Genesis.getContentPane().add(chapter2);
		chapter2.setColumns(7);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1= chapter1.getText();
				String s2= chapter2.getText();
				int x;
				int y;
				try {
				 x= Integer.parseInt(s1);
				 y= Integer.parseInt(s2);
				} catch(Exception e1) {
				JOptionPane.showMessageDialog(add, "Input must be numbers only");
				chapter1.setText(s2);
				chapter2.setText(s2);
				return;
				}
				chapter3.setText(""+ s1+s2);
			}
		});
		Genesis.getContentPane().add(add);
		
		chapter3 = new JTextField();
		Genesis.getContentPane().add(chapter3);
		chapter3.setColumns(7);
	}

}

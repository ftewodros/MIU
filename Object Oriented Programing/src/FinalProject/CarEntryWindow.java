package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class CarEntryWindow {

	public JFrame carEntry_Frame;
	public JTextField make_Text;
	public JTextField model_Text;
	public JTextField year_Text;
	public JTextField weight_Text;
	public JTextField thankSize_Text;
	public JTextField fuelType_Text;
	public JTextField batterySize_Text;
	public JTextField battreyType_Text;
	public JButton submit_Button = new JButton("Submit");
	public JButton return_Button = new JButton("Return");
	public JRadioButton electric_RadioButton = new JRadioButton("Electric");
	public JRadioButton gas_RadioButton = new JRadioButton("Gas");
	public JButton entryExit_Button;
	public JComboBox comboBox = new JComboBox();





	public CarEntryWindow() {
		initialize();
	}

	
	public void initialize() {
		carEntry_Frame = new JFrame();
		carEntry_Frame.setTitle("Car Entry");
		carEntry_Frame.setBounds(100, 100, 450, 300);
		carEntry_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carEntry_Frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Make");
		carEntry_Frame.getContentPane().add(lblNewLabel);
		
		make_Text = new JTextField();
		carEntry_Frame.getContentPane().add(make_Text);
		make_Text.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Model");
		carEntry_Frame.getContentPane().add(lblNewLabel_1);
		
		model_Text = new JTextField();
		carEntry_Frame.getContentPane().add(model_Text);
		model_Text.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Year");
		carEntry_Frame.getContentPane().add(lblNewLabel_2);
		
		year_Text = new JTextField();
		carEntry_Frame.getContentPane().add(year_Text);
		year_Text.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Weight");
		carEntry_Frame.getContentPane().add(lblNewLabel_3);
		
		weight_Text = new JTextField();
		carEntry_Frame.getContentPane().add(weight_Text);
		weight_Text.setColumns(10);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"febi", "pink", "blue", "yellow", "red", "abi", "debo"}));
		carEntry_Frame.getContentPane().add(comboBox);
		
		carEntry_Frame.getContentPane().add(gas_RadioButton);
		
		JLabel lblNewLabel_4 = new JLabel("Thank Size");
		carEntry_Frame.getContentPane().add(lblNewLabel_4);
		
		thankSize_Text = new JTextField();
		carEntry_Frame.getContentPane().add(thankSize_Text);
		thankSize_Text.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fuel Type");
		carEntry_Frame.getContentPane().add(lblNewLabel_5);
		
		fuelType_Text = new JTextField();
		carEntry_Frame.getContentPane().add(fuelType_Text);
		fuelType_Text.setColumns(10);
		
		carEntry_Frame.getContentPane().add(electric_RadioButton);
		
		JLabel lblNewLabel_6 = new JLabel("Battery Size");
		carEntry_Frame.getContentPane().add(lblNewLabel_6);
		
		batterySize_Text = new JTextField();
		carEntry_Frame.getContentPane().add(batterySize_Text);
		batterySize_Text.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Battrey Type");
		carEntry_Frame.getContentPane().add(lblNewLabel_7);
		
		battreyType_Text = new JTextField();
		carEntry_Frame.getContentPane().add(battreyType_Text);
		battreyType_Text.setColumns(10);
		
		carEntry_Frame.getContentPane().add(submit_Button);
		
		carEntry_Frame.getContentPane().add(return_Button);
		
		entryExit_Button = new JButton("Exit");
		carEntry_Frame.getContentPane().add(entryExit_Button);
	}

}

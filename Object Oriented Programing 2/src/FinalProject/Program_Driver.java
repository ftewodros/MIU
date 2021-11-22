package FinalProject;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Program_Driver {
	
	
	
	
	public static CarDisplayWindow carDisplayWindow;
	public static CarEntryWindow carEntryWindow;
	public static MenuWindow menuWindow;
	static Gas gascar;
	static Electric electriccar;
	static List<Car> car=new ArrayList<Car>();
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		File file=new File("C:\\Users\\zekar\\OneDrive\\Desktop\\cars.txt");
		if(file.isFile()&&file.canRead()) {
			try {
				FileInputStream input=new FileInputStream(file);
				ObjectInputStream objectIn=new ObjectInputStream(input);
				car=(List<Car>)objectIn.readObject();
				objectIn.close();
				input.close();
			}catch(Exception e22) {
				System.out.println();
			}
		}
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					menuWindow = new MenuWindow();
					carDisplayWindow = new CarDisplayWindow();
					carEntryWindow = new CarEntryWindow();
					
					
					menuWindow.menuFrame.setVisible(true);
					carDisplayWindow.carDisplay_Frame.setVisible(false);
					carEntryWindow.carEntry_Frame.setVisible(false);
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			
			
			
			
			menuWindow.carEntry_Button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					carEntryWindow.carEntry_Frame.setVisible(true);
					menuWindow.menuFrame.setVisible(false);
					
					
				}});
			
			
			
			
			                 
			
			
			menuWindow.carDisplay_Button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					carDisplayWindow.carDisplay_Frame.setVisible(true);
					menuWindow.menuFrame.setVisible(false);
					
				}});
			
			
			
			
			                 ///////////Entry Return Button
			
			
		    carEntryWindow.return_Button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					menuWindow.menuFrame.setVisible(true);		
					carEntryWindow.carEntry_Frame.setVisible(false);
					
				}
				});			

			                  /////////Display Return Button
		    
		    
			carDisplayWindow.return_Button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					carDisplayWindow.carDisplay_Frame.setVisible(false);
					menuWindow.menuFrame.setVisible(true);	
					
				}
				
			});
			
			

			                     ////////Gas Radio Button
			
			 carEntryWindow.gas_RadioButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					carEntryWindow.electric_RadioButton.setSelected(false);
					carEntryWindow.batterySize_Text.setEditable(false);
					carEntryWindow.battreyType_Text.setEditable(false);
					
					carEntryWindow.gas_RadioButton.setSelected(true);
					carEntryWindow.thankSize_Text.setEditable(true);
					carEntryWindow.fuelType_Text.setEditable(true);


			
					
										
				}
			});
			 
			                        //////////Electric Radio Button
			 
			 carEntryWindow.electric_RadioButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						carEntryWindow.electric_RadioButton.setSelected(true);						
						carEntryWindow.batterySize_Text.setEditable(true);
						carEntryWindow.battreyType_Text.setEditable(true);
						
						carEntryWindow.gas_RadioButton.setSelected(false);
						carEntryWindow.thankSize_Text.setEditable(false);
						carEntryWindow.fuelType_Text.setEditable(false);

				
						
											
					}
				});
				 
			                         ////////Menu Exit Button
			
			 menuWindow.menuExit_Button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.exit(0);
						
											
					}
				});
				 
			                         ///////Display Exit Button
			
			 carDisplayWindow.displayExit_Button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					   System.exit(0);
										
				}
				 
			 });

			 
			                        ///////Entry Exit Button
			 
			 carEntryWindow.entryExit_Button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
										
				}
			});
			 
			 
			 carEntryWindow.submit_Button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						                       ////////////// Make
				
						if(carEntryWindow.make_Text.getText().isEmpty() && carEntryWindow.make_Text.getText().isBlank()) {
							JOptionPane.showMessageDialog(carEntryWindow.make_Text, "Can not be empty");
							return;
							
							                   ///////////// Model
						}
						if(carEntryWindow.model_Text.getText().isEmpty() && carEntryWindow.model_Text.getText().isBlank()) {
							JOptionPane.showMessageDialog(carEntryWindow.model_Text, "Can not be empty");
							return;
						}
						
						
						
						                        ////////////////Year
						
						
						int year= 0;
						  try {
							  
							  year=Integer.parseInt(carEntryWindow.year_Text.getText());								

						  }catch(Exception e1) {
							  JOptionPane.showMessageDialog(carEntryWindow.year_Text, "Year Error");
							  return;				  
							  
						  }
						  
						                         /////////////////// Weight 
						  
						  
						  double weight= 0;
						  try {
							  
						  weight=Double.parseDouble(carEntryWindow.weight_Text.getText());
					
						  }catch(Exception e2){
							  JOptionPane.showMessageDialog(carEntryWindow.weight_Text, "Weight Error");	
							  return;
						  }
						  
						                          /////////////////////Gas Radio Button
						  
						  
						  if(carEntryWindow.gas_RadioButton.isSelected()) {
							  if(carEntryWindow.fuelType_Text.getText().isEmpty()||carEntryWindow.fuelType_Text.getText().isBlank()) {
								  JOptionPane.showMessageDialog(carEntryWindow.fuelType_Text, "fuel type cant be empty");
								  return;
							  }
							  
							  if(carEntryWindow.thankSize_Text.getText().isEmpty()||carEntryWindow.thankSize_Text.getText().isBlank()) {
								  JOptionPane.showMessageDialog(carEntryWindow.thankSize_Text, "fuel type cant be empty");
								  return;
							  }
							  double tankSize=0;
							  try {
								  tankSize=Double.parseDouble(carEntryWindow.thankSize_Text.getText());
							  }catch(Exception e2) {
								  JOptionPane.showMessageDialog(carEntryWindow.thankSize_Text,"tank size should be a number");
								  return;
							  }
						  
					gascar=new Gas(carEntryWindow.make_Text.getText(),carEntryWindow.model_Text.getText(),year,weight,carEntryWindow.comboBox.getSelectedItem().toString(),tankSize,carEntryWindow.fuelType_Text.getText());
						  
						 car.add(gascar);
						      carEntryWindow.make_Text.setText("");
							  carEntryWindow.model_Text.setText("");
							  carEntryWindow.year_Text.setText("");
							  carEntryWindow.weight_Text.setText("");
							  carEntryWindow.fuelType_Text.setText("");
							  carEntryWindow.thankSize_Text.setText("");

						 
						  }
						  
						                          //////////////// Electric Radio button
						  
						  
						  
						  if(carEntryWindow.electric_RadioButton.isSelected()) {
							  
						
							if(carEntryWindow.battreyType_Text.getText().isEmpty() || carEntryWindow.battreyType_Text.getText().isBlank ()){
								JOptionPane.showMessageDialog(carEntryWindow.battreyType_Text, "Battrey Type Cant be Empty");
								return;
								
							}
							
							if(carEntryWindow.batterySize_Text.getText().isBlank()||carEntryWindow.batterySize_Text.getText().isEmpty()) {
								JOptionPane.showMessageDialog(carEntryWindow.batterySize_Text, "Battrey Size Cant be empty");
								return;
						
							}
							  
							double battery_size= 0;
							
							try {
								battery_size=Double.parseDouble(carEntryWindow.batterySize_Text.getText());
							}catch(Exception e2) {
								JOptionPane.showMessageDialog(carEntryWindow.batterySize_Text, "Battrey Size Cant be empty");
								return;
							}
							electriccar= new Electric(carEntryWindow.make_Text.getText(),carEntryWindow.model_Text.getText(),year,weight,carEntryWindow.comboBox.getSelectedItem().toString(),battery_size,carEntryWindow.battreyType_Text.getText());
							  
							  car.add(electriccar);
								carEntryWindow.make_Text.setText("");
								carEntryWindow.model_Text.setText("");
								  carEntryWindow.year_Text.setText("");
								  carEntryWindow.weight_Text.setText("");
								  carEntryWindow.battreyType_Text.setText("");
								  carEntryWindow.batterySize_Text.setText("");
											
							  
						  }
						
							 						  						  						  						  						  						  		 						 		  
					
					}
				});
			
			
			
			 
			 
			 
			 
			 
			 
			 
			
			
	}


	});
	}
}


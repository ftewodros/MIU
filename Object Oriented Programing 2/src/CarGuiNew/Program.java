package CarGuiNew;

import java.awt.EventQueue;

public class Program {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCar window = new addCar();
				
					window.addCarFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

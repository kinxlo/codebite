package view;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AppEntryPoint {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				runApp();
			}
		});
	}
	
	
	protected static void runApp(){
		TheElements element = new TheElements();
		
	}

}

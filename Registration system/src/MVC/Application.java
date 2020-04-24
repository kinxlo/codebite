package MVC;

import java.awt.EventQueue;

public class Application {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				runApp();
			}
		});
	}

	public static void runApp() {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}

package snake;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

	public GameWindow() {
		setSize(500, 500);
		setResizable(false);
		setTitle("Snake Game!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
}

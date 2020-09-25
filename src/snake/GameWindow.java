package snake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameWindow extends JFrame {

	private Rect background;
	private Snake snake;

	public GameWindow() {
		snake = new Snake();
		background  = new Rect(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		background.draw(g);
		snake.draw(g);

	}

}

/**
* Conway's Game of Life
*
*/

import java.awt.*;
import javax.swing.*;

public class GameOfLife {

	final String NAME_OF_GAME = "Conway's Game of Life";
	JFrame frame;
	Canvas canvasPanel;

	public static void main(String[] args) {
		new GameOfLife().go();
	}
	
	void go() {
		frame = new JFrame(NAME_OF_GAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		frame.setResizable(false);
		
		frame.setVisible(true);
	}
}
/**
* Conway's Game of Life
*
*/

import java.awt.*;
import javax.swing.*;

public class GameOfLife {
	public static void main(String[] args) {
		new GameOfLife().go();
	}
	
	void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		frame.setResizable(false);
		
		frame.setVisible(true);
	}
}
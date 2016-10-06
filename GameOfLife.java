/**
* Conway's Game of Life
*
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GameOfLife {

	final String NAME_OF_GAME = "Conway's Game of Life";
	final int START_LOCATION = 200;
	final int LIFE_SIZE = 50;
	final int POINT_RADIUS = 10;
	final int FIELD_SIZE = (LIFE_SIZE + 1) * POINT_RADIUS - 3;
	final int BTN_PANEL_SIZE = 58;
	boolean[][] lifeGeneration = new boolean[LIFE_SIZE][LIFE_SIZE];
	boolean[][] nextGeneration = new boolean[LIFE_SIZE][LIFE_SIZE];
	Random random = new Random();
	JFrame frame;
	Canvas canvasPanel;

	public static void main(String[] args) {
		new GameOfLife().go();
	}
	
	void go() {
		frame = new JFrame(NAME_OF_GAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(FIELD_SIZE, FIELD_SIZE + BTN_PANEL_SIZE);
		frame.setLocation(START_LOCATION, START_LOCATION);
		frame.setResizable(false);
		
		canvasPanel = new Canvas();
		canvasPanel.setBackground(Color.white);
		//
		
		JButton fillButton = new JButton("Fill");
		fillButton.addActionListener(new FillButtonListener());
		
		JButton stepButton = new JButton("Step");
		
		JPanel btnPanel = new JPanel();
		btnPanel.add(fillButton);
		btnPanel.add(stepButton);
		
		frame.getContentPane().add(BorderLayout.CENTER, canvasPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, btnPanel);
		
		frame.setVisible(true);
	}
	
	// randomly fill cells
	public class FillButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ev){
			//countGeneration = 1;
			for(int x = 0; x < LIFE_SIZE; x++) {
				for(int y=0; y < LIFE_SIZE; y++) {
					lifeGeneration[x][y] = random.nextBoolean();
				}
			}
			canvasPanel.repaint();
		}
	}
	
	public class Canvas extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			for(int x = 0; x < LIFE_SIZE; x++) {
				for(int y=0; y < LIFE_SIZE; y++) {
					if(lifeGeneration[x][y]){
						g.fillOval(x*POINT_RADIUS, y*POINT_RADIUS, POINT_RADIUS, POINT_RADIUS);
					}
				}
			}
		}
	}
}
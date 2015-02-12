/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 4000;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	public void run() {
		/* You fill this in, along with any subsidiary methods */
		setupGame();
//		playGame();
	}
	
	private void setupGame() {
			
		int startXPosition = 50;
		int startYPosition = BRICK_Y_OFFSET;
		
		for (int i=0;i<NBRICK_ROWS;i++) {

			for (int j=0;j<NBRICKS_PER_ROW;j++) {
				
				GRect rect = new GRect(startXPosition, startYPosition, BRICK_WIDTH, BRICK_HEIGHT);
				add (rect);
				startXPosition += BRICK_WIDTH+BRICK_SEP;
				rect.setFilled(true);
				if (i==0||i==1) {
					rect.setFillColor(Color.RED);
				} else if (i==2||i==3){
					rect.setFillColor(Color.ORANGE);
				} else if (i==4||i==5) {
					rect.setFillColor(Color.YELLOW);
				} else if (i==6||i==7) {
					rect.setFillColor(Color.GREEN);
				} else {
					rect.setFillColor(Color.CYAN);
				}

			}
			startXPosition = 50;
			startYPosition += BRICK_HEIGHT+BRICK_SEP;

		}
	}
	
	private GRect rect;
}

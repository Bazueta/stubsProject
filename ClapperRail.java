package project;

import java.awt.image.BufferedImage;

public class ClapperRail {
	
	int xloc;
	int yloc;
	int xincr;
	int yincr;
	BufferedImage[][] imageArray;
	
	/** 
	 * updates the location of the Clapper Rail object
	 * @param none
	 * @return none
	 */
	public void move() {
		System.out.println("player move method called.");
	
		xloc += xincr;
		yloc += yincr;
	}
}

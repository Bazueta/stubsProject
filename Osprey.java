package project;

import java.awt.image.BufferedImage;

public class Osprey implements Player{
	
	int xloc;
	int yloc;
	int xincr;
	int yincr;
	BufferedImage[][] imageArray;
	
	Osprey(int x, int y, int xi, int yi) {
		xloc = x; 
		yloc = y; 
		xincr = xi; 
		yincr = yi;
	}
	
	
	/**
	 * updates location(xloc and yloc) for osprey object
	 * @param none
	 * @return none
	 * @author Anna Bortle
	 */
	public void move() {
		xloc += xincr;
		yloc += yincr;
	}
	
	public int getxloc() {
		return this.xloc;
	}
	public int getyloc() {
		return this.yloc;
	}
}
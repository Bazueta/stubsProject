package project;

import java.awt.image.BufferedImage;

public class ClapperRail {
	
	int xloc;
	int yloc;
	int xIncr;
	int yIncr;
	BufferedImage[][] imageArray;
	
	ClapperRail(int xloc, int yloc, int xIncr, int yIncr){
		this.xloc = xloc;
		this.yloc = yloc;
		this.xIncr = xIncr;
		this.yIncr = yIncr;
	}
	
	public int getxloc(){
		return this.xloc;
	}
	
	public int getyloc(){
		return this.yloc;
	}
	
	/**
	 * updates x location and y location for clapper rail object
	 * @param none
	 * @return none
	 * @author Hannah Bridge
	 */
	public void move() {
		System.out.println("player move method called.");
	
		this.xloc += this.xIncr;
		this.yloc += this.yIncr;
	}
}
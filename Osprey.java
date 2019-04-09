package project;

import java.awt.image.BufferedImage;

public class Osprey implements Player{
	
	int xloc;
	int yloc;
	int xincr;
	int yincr;
	BufferedImage[][] imageArray;
	
	public void move() {
		System.out.println("player move method called.");
	
		xloc += xincr;
		yloc += yincr;
	}
}

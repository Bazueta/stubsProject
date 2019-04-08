package project;

import java.awt.image.BufferedImage;

public class ScoringObject {
	int xloc,yloc,xIncr,yIncr;
	int pointValue;
	BufferedImage[] imageArray;
	
	public void move() {
		this.xloc += this.xIncr;
		this.yloc += this.yIncr;
	}
}

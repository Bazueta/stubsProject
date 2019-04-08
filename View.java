package project;

import java.util.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame{
	DrawPanel dp = new DrawPanel();
	int frameCount;
	int picNum;
	final static int frameWidth = 1000;
	final static int frameHeight = 1000;
	int imageHeight;
	int imageWidth;
	BufferedImage[][] imageArray;
	Button exit, game1, game2, ans1, ans2, menu, replay;
	public BufferedImage createBufferedImage() {
		return new BufferedImage(1,1,1);
	}
	
	private class DrawPanel extends JPanel{
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//update the view of the game here
		}
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(this.frameWidth,this.frameHeight);
	}
	
	public void addControllertoButton(Controller c) {
		
	}
}
package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

public class Controller implements ActionListener, KeyListener {
	
	Model model;
	View view;
	Timer t;
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("action performed");
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		System.out.println("key pressed");
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		System.out.println("key released");
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("key typed");
		
	}
	
	public static void main(String[] args) {
		System.out.println("main called.");
	}
}

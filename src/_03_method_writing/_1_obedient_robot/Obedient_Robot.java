package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot robot = new Robot("mini");	
	
	public static void main(String[] args) {
		robot.setSpeed(100);
		robot.penDown();
				
		String shape = JOptionPane.showInputDialog("Would you like to draw a square, triangle, or circle?");
		
		String color = JOptionPane.showInputDialog("Would you like the shape to be red, yellow, or blue?");
		
		if(color.equals("red")) {
			robot.setPenColor(255,0,0);
			
			if(color.equals("yellow")) {
				robot.setPenColor(255,225,0);
				drawSquare();
			}
			
			if(color.equals("blue")) {
				robot.setPenColor(0,0,255);
			}
		}
		
		if(shape.equals("triangle")) {
			drawTriangle();
			
		}
		
		if(shape.equals("circle")) {
			drawCircle();
		}

		
		


		
	}
	
	public static void drawSquare() {
		robot.move(50);
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
		robot.move(50);


		
	}
	
	public static void drawTriangle() {
		robot.move(50);
		robot.turn(60);
		robot.move(50);
		robot.turn(60);
		robot.move(50);


	}
	public static void drawCircle() {
		for(int i = 0; i < 360 ; i++) {
		robot.move(1);
		robot.turn(1);
		}
		
	}



}

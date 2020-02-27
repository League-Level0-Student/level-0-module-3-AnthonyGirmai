//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		     Robot r2d2 = new Robot();
		//3. Ask the user what color they would like the robot to draw
		     String answer;  
		     
		     for(int i = 11; i>10; i++) {
		     answer = JOptionPane.showInputDialog("What Color Do You Want The Robot To Draw?");
		//5. Use an if/else statement to set the pen color that the user requested
              if(answer.equalsIgnoreCase("Red")) {
            	  r2d2.setPenColor(255,0,0);
              }
              
              else if(answer.equalsIgnoreCase("Green")) {
            	  r2d2.setPenColor(0,255,0);
              }
              else if(answer.equalsIgnoreCase("Blue")) {
            	  r2d2.setPenColor(0,0,255);
              }
              
        //6. If the user doesn’t enter anything, choose a random color
              else {
            	  r2d2.setRandomPenColor();
              }
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		    
		//4. Set the pen width to 10
		     r2d2.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
             r2d2.setSpeed(100);
		     r2d2.penDown();
             r2d2.move(100);
             r2d2.turn(90);
             r2d2.move(100);
             r2d2.turn(90);
             r2d2.move(100);
             r2d2.turn(90);
             r2d2.move(100);
             r2d2.turn(90);
             r2d2.penUp();
             
             
		     }

	}
}

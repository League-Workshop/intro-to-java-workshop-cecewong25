package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot yoda = new Robot();
	yoda.setSpeed(100);	
	yoda.penDown();
	yoda.move(100);	
	yoda.turn(90);
	yoda.move(100);
	yoda.turn(90);
	yoda.move(100);
	yoda.turn(90);
	yoda.move(100);
	yoda.moveTo(400, 200);
	for (int i = 0; i < 4 ; i++) {
		yoda.move(100);	
		yoda.turn(90);	
	}
	}
}

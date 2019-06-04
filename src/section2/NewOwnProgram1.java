package section2;

import org.jointheleague.graphical.robot.Robot;

public class NewOwnProgram1 {
public static void main(String[] args) {
	Robot chubaka = new Robot("mini");
	chubaka.setSpeed(100);	
	chubaka.penDown();
	for (int i = 0; i < 4 ; i++) {
		chubaka.move(100);	
		chubaka.turn(90);	
	}
	}
}
}

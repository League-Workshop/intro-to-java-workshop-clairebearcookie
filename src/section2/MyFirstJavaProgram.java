package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
	
			Robot john =new Robot();
			john.setPenColor(Color.PINK);
			john.move(100); john.sparkle();
		john.turn(90);  john.penDown();
		john.move(100); john.setSpeed(10);
		john.miniaturize(); john.move(10); john.move(12);
		john.setSpeed(100);john.turn(180);
		john.move(10); john.turn(270);
		john.move(20); john.penDown();
		john.setPenWidth(10);
		john.move(19); john.turn(10); john.move(100);
		john.expand(); john.turn(90);
		john.move(19); john.turn (300);
		john.move(50);
	}
}


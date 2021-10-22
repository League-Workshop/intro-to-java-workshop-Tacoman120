package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot pumkingeoff = new Robot();
		// Set your robot's pen down 
		pumkingeoff.penDown();
		// SPEED. Set the robot to go at max speed (100)
		pumkingeoff.setSpeed(100);
		// COUNT. Create an int variable that will count how many lines of the spiral we have drawn.
			//        Start its value as zero.
int spiral = 0;
		// LOOP. Start a while loop to repeat the COLOR, DRAW, TURN, and COUNT code below until 50 lines have been drawn
while(spiral<50) {
			// COLOR.   Have the robot set a random pen color:      setRandomPenColor()

			// DRAW.    Move the robot (5*count) pixels
			//          count is the name of the variable you created earlier
	pumkingeoff.move(5*spiral);
			// TURN.    Turn the robot (360/7) degrees to the right
	pumkingeoff.turn(360/7);
			// COUNT.   Increase the count of how many lines have been drawn so far ( count+=1 )
	spiral+=1; 
			// Change the robot pen width to the current value of the count variable 
	pumkingeoff.setPenWidth(0);

		//  End the while loop here
}
		
		// Run the program. 
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}

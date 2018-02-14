package extra;

import org.jointheleague.graphical.robot.Robot;

public class Heart {

	public static void main(String[] args) {
		
		Robot rob = new Robot();
		
		rob.hide();
		
		rob.setPenColor(250,0,0);
		
		rob.setSpeed(100);
		
		rob.moveTo(900,900);
		
		rob.setAngle(22);
		
		rob.penDown();
		
		rob.move(300);
		
		rob.moveTo(900,900);
		
		rob.setAngle(-23);
		
		rob.move(300);
		
		rob.setAngle(0);
		
		for(int i  =  0;i < 180; i++) {
			
			
			
			rob.move(1);
			
			rob.turn(1);
		}
		
		rob.setAngle(0);
		
for(int i  =  0;i < 180; i++) {
	
	
	
			rob.move(1);
			
			rob.turn(1);
		}
		
		}
	}
	
	


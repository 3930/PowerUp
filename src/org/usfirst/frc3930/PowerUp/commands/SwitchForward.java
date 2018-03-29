package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SwitchForward extends CommandGroup {

    public SwitchForward() {
        requires(Robot.driveBase);
        
        addParallel(new armDropManual(), 0.5);
        
        String gameData;
        
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		//int retries = 100;
		/*while (gameData.length() < 1 && retries > 0) {
			DriverStation.reportError("Gamedate is" + gameData + "retrying" + retries, false);
			try {
				Thread.sleep(5);
				gameData = DriverStation.getInstance().getGameSpecificMessage();
				if (gameData == null) { gameData = "";}
			} catch (Exception e) {
			}
			retries --;
		}*/
		if(gameData.charAt(0) == 'R') {
			
			Robot.driveBase.setDriveAngle(0);
			addSequential(new AutonomousDrive(-0.75,-0.75,'c'), 3.2);
			addSequential(new shootCube(),3);
			
		}
		else if(gameData.charAt(0) == 'L') {
			
			Robot.driveBase.setDriveAngle(0);
			addSequential(new AutonomousDrive(-0.75,-0.75,'c'), 3.2);
			
		}else {
			
			Robot.driveBase.setDriveAngle(0);
			addSequential(new AutonomousDrive(-0.75,-0.75,'c'), 3.2);
		}
		
		
    }
}

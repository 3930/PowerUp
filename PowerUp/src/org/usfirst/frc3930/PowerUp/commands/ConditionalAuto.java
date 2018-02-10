package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ConditionalAuto extends CommandGroup {

    public ConditionalAuto() {
        requires(Robot.driveBase);
        
        String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if(gameData.charAt(0) == 'L') {
			
			addSequential(new AutonomousDrive(1,1), 5);
			
		} else {
			
			addSequential(new AutonomousDrive(1,0.5), 10);
			
		}
      
    }
}

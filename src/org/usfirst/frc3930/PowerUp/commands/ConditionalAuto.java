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
        Robot.driveBase.resetGyro();
        
        Robot.driveBase.setTurnAngle(80);

        addSequential(new AutonomousDrive(0.7,0.0),1);
        addSequential(new AutonomousTurn(0.5,false));
		
		
    }
}

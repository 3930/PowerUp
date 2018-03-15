package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class UnconditionalAuto extends CommandGroup {
	
    public UnconditionalAuto() {
        
    	requires(Robot.driveBase);
    	addSequential(new AutonomousDrive(-0.75,-0.75,'a'),4);
    	//(This commented line works)
    	//Robot.driveBase.resetGyro();
    	//Robot.driveBase.setDriveAngle(0);
    	//(new AutonomousDrive(-0.75,-0.75,'c'),3);
    	
    	}
    	
    }


    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	


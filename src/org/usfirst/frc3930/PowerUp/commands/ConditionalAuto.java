package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;
import org.usfirst.frc3930.PowerUp.subsystems.driveBase;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ConditionalAuto extends CommandGroup {

    public ConditionalAuto() {
    	
    	requires(Robot.driveBase);
    	Robot.driveBase.resetGyro();
    	
    	Robot.driveBase.setDriveAngle(0);
    	addSequential(new AutonomousDrive(-0.75,-0.75,'c'),1);
    	
    	Robot.driveBase.setDriveAngle(85);
    	addSequential(new AutonomousDrive(0.60,-0.60,'d'));
    	
    }
}

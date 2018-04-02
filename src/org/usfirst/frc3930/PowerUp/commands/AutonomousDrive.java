package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
 /*Subcommands:
  * a - Normal drive - Speed for both motors only
  * b - Drive Left until an angle is reached
  * d - Drive Right until an angle is reached
  * c - Drive perfectly straight according to NavX
  */
public class AutonomousDrive extends Command {
	
	public double speed;
	public double driveAngle;
	//For commands 2 and 3 only - NOT included in constructor
	private double speedCorrection = Math.abs(driveAngle - Robot.driveBase.getYaw()) * 0.005;
	
    public AutonomousDrive(double newSpeed, double newDriveAngle) {
    	this.speed = newSpeed;
    	this.driveAngle = newDriveAngle;
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveBase);
       
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
	
    	if(Robot.driveBase.getYaw() > driveAngle) {
    		Robot.driveBase.autoDrive(-speed, -speed * (100 + speedCorrection));
    	}else if(Robot.driveBase.getYaw() < driveAngle){
    		Robot.driveBase.autoDrive(-speed * (100 + speedCorrection), -speed);
    	}else {
    		Robot.driveBase.autoDrive(-speed, -speed);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

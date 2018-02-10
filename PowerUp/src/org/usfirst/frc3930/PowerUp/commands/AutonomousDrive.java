package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousDrive extends Command {
	
	private int commandNumber;
	private double speed;
	
    public AutonomousDrive(int newCommandNumber, double newSpeed) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveBase);
        this.commandNumber = newCommandNumber;
        this.speed = newSpeed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(commandNumber == 1) {
    		Robot.driveBase.driveFB(speed);
    	}
    	if(commandNumber == 2) {
    		Robot.driveBase.steerLeft(speed);
    	}
    	if(commandNumber == 3) {
    		Robot.driveBase.steerRight(speed);
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

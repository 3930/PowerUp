package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
 /*Subcommands:
  * a - Normal drive - Speed for both motors only
  * b - Turn right to a specified angle using the NavX
  * d - Turn Left to a specified angle using the NavX
  * c - Drive until a certain angle is reached
  */
public class AutonomousDrive extends Command {
	
	public double speedLeft;
	public double speedRight;
	private char subcommand;
	//For commands 2 and 3 only - NOT included in constructor
	private double speedCorrection = Math.abs(Robot.driveBase.driveAngle - Robot.driveBase.getYaw()) * 0.005;
	
    public AutonomousDrive(double newSpeedLeft, double newSpeedRight, char newSubcommand) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveBase);
        this.speedLeft = newSpeedLeft;
        this.speedRight = newSpeedRight;
        this.subcommand = newSubcommand;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	//Subcommand a - Normal Drive
    	if(subcommand == 'a') {
    		
    		Robot.driveBase.autoDrive(speedLeft,speedRight);
    	
    	//Subcommand b - Drive Right to Angle
    	}else if (subcommand == 'b') {
    		
    		while(Robot.driveBase.getYaw() <= Robot.driveBase.driveAngle) {
    			Robot.driveBase.autoDrive(speedLeft, speedRight);
    		}
    		Robot.driveBase.autoDrive(0, 0);
    	
    	//Subcommand d - Drive Left to Angle
    	}else if (subcommand == 'd') {
    		
    		while(Robot.driveBase.getYaw() >= Robot.driveBase.driveAngle) {
    			Robot.driveBase.autoDrive(speedLeft, speedRight);
    		}
    		Robot.driveBase.autoDrive(0, 0);
    	
    	//Subcommand c - Drive perfectly straight
    	}else if (subcommand == 'c') {
    		
    		if(Robot.driveBase.getYaw() > Robot.driveBase.driveAngle) {
    			Robot.driveBase.autoDrive(speedLeft, speedRight * (100 + speedCorrection));
    		}else if(Robot.driveBase.getYaw() < Robot.driveBase.driveAngle){
    			Robot.driveBase.autoDrive(speedLeft * (100 + speedCorrection), speedRight);
    		}else {
    			Robot.driveBase.autoDrive(speedLeft, speedRight);
    		}
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

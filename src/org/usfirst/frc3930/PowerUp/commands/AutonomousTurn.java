package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousTurn extends Command {
	
	public double speed;
	public boolean isLeftTurn;

    public AutonomousTurn(double newSpeed, boolean leftTurn) {
    	
    	this.speed = newSpeed;
    	this.isLeftTurn = leftTurn;

        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveBase);
    
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
		if(!isLeftTurn) {
			while(Robot.driveBase.getYaw() <= Robot.driveBase.turnAngle) {
				Robot.driveBase.autoDrive(-speed, speed);
			}
			Robot.driveBase.autoDrive(0, 0);	
		}else if(isLeftTurn){
			while(Robot.driveBase.getYaw() >= Robot.driveBase.turnAngle) {
				Robot.driveBase.autoDrive(speed, -speed);
			}
			Robot.driveBase.autoDrive(0, 0);
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

package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class allPistonRetract extends Command {

    public allPistonRetract() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.PGripper);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.PGripper.leftRetract();
    	Robot.PGripper.rightRetract();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.PGripper.leftOff();
    	Robot.PGripper.rightOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.PGripper.leftOff();
    	Robot.PGripper.rightOff();
    }
}

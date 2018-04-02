package org.usfirst.frc3930.PowerUp.commands;

import org.usfirst.frc3930.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class allPistonExtend extends Command {

    public allPistonExtend() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.PGripper);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.PGripper.rightExtend();
    	Robot.PGripper.leftExtend();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.PGripper.rightOff();
    	Robot.PGripper.leftOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.PGripper.rightOff();
    	Robot.PGripper.leftOff();
    }
}

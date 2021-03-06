// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3930.PowerUp.subsystems;

import org.usfirst.frc3930.PowerUp.Robot;
import org.usfirst.frc3930.PowerUp.RobotMap;
import org.usfirst.frc3930.PowerUp.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.RobotDriveBase;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class driveBase extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController frontLeft = RobotMap.driveBasefrontLeft;
    private final SpeedController backLeft = RobotMap.driveBasebackLeft;
    private final SpeedController frontRight = RobotMap.driveBasefrontRight;
    private final SpeedController backRight = RobotMap.driveBasebackRight;
    private final DifferentialDrive robotDrive = RobotMap.driveBaseRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    	
    	getRobotDrive().arcadeDrive(Robot.oi.joystick.getRawAxis(1),Robot.oi.joystick.getRawAxis(0));

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public DifferentialDrive getRobotDrive() {
    	return robotDrive;
    }
    
    public void driveFB(double speed) {
    	getRobotDrive().tankDrive(speed, speed);
    }
    
    public void steerRight(double speed) {
    	getRobotDrive().tankDrive(speed, 0-speed);
    }
    
    public void steerLeft(double speed) {
    	getRobotDrive().tankDrive(0-speed, speed);
    }
    
}

